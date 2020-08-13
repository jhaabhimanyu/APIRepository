package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PutRequestTC {
	
	@Test
	public void tc4() throws IOException {
		JSONObject putdata = new JSONObject();
		putdata.put("firstname", "alok");
		putdata.put("id","-1731669782");
		putdata.put("designation", "Engineer");
		putdata.put("lastname", "singh");
		
		Properties pr = PropertiesFileLoad.propertiesFile();
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.putRequest(putdata.toString(), "QA_URI", PostRequestTC.id);
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Put request is as"+res.asString());	
	}

}
