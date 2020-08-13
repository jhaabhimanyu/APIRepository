package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.ResponseValidation.ResponseStatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JsonFileRead;
import org.testing.Utilities.JsonVariableReplacement;
import org.testing.Utilities.PropertiesFileLoad;
import org.testing.Utilities.ResponseExtractionUsingJsonPath;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PostRequestTC {
	static String id;
	static String firstname;
	
	@Test
	public void tc1() throws IOException {
		String body = JsonFileRead.bodyDataRead("../APIAutomation/src/test/java/org/testing/PayloadData/body.json");
		Random r = new Random();
		Integer v = r.nextInt();
		body = JsonVariableReplacement.jsonVariable(body, "id", v.toString());
		body = JsonVariableReplacement.jsonVariable(body, "firstname", "Atul");
		
		Properties pr=PropertiesFileLoad.propertiesFile();
		
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.postRequest(body, "QA_URI");
		
		System.out.println("Post request response data ");
		System.out.println(res.asString());
		
		ResponseStatusCodeValidation.responseStatus(res,201);
		ResponseDataValidation.responseData(res, "Atul", "firstname");
		id=ResponseExtractionUsingJsonPath.responseExtraction("id", res);
		firstname=ResponseExtractionUsingJsonPath.responseExtraction("firstname", res);
	}
}
