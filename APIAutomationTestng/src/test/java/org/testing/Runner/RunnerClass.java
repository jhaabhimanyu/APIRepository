package org.testing.Runner;

import java.io.IOException;

import org.testing.TestScripts.DeleteRequestTC;
import org.testing.TestScripts.GetRequestTC;
import org.testing.TestScripts.GetRequestWithQueryParameters;
import org.testing.TestScripts.PostRequestTC;
import org.testing.TestScripts.PutRequestTC;

public class RunnerClass {
	public static void main(String[] args) throws IOException {
		PostRequestTC post = new PostRequestTC();
		post.tc1();
		
		GetRequestTC get = new GetRequestTC();
		get.tc2();
		
		GetRequestWithQueryParameters query = new GetRequestWithQueryParameters();
		query.tc3();
		
		PutRequestTC put = new PutRequestTC();
		put.tc4();
		
		DeleteRequestTC delete = new DeleteRequestTC();
		delete.tc5();
		
		
	}

}
