package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseStatusCodeValidation;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class DeleteRequestTC {
	
	@Test
	public void  tc5() throws IOException {
		Properties pr = PropertiesFileLoad.propertiesFile();
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.deleteRequest("QA_URI", PostRequestTC.id);
		System.out.println("Delete request ");
		ResponseStatusCodeValidation.responseStatus(res, 200);
	}
}
