package com.java.googleSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
	public static Properties prop;
	public static void initialiseProperties() {	
		try {
			prop = new Properties();
			FileInputStream in = new FileInputStream(System.getProperty("user.dir")
					+ "/config.properties");
			prop.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String value) {
		return prop.getProperty(value);
	}
}
