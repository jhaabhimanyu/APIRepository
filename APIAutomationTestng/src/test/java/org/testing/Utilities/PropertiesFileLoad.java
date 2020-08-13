package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {
	public static Properties propertiesFile() throws IOException {
		File f = new File("../APIAutomation/Enviornment.properties");
		FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		return pr;
		
	}

}
