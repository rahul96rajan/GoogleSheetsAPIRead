package com.java.googleSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Properties;

public class TestClass {
	public static void main(String[] args) throws GeneralSecurityException, IOException {
	
	/*	Properties prop;
			try {
				prop = new Properties();
				FileInputStream in = new FileInputStream(System.getProperty("user.dir")
						+ "/config.properties");
				prop.load(in);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}*/
				
		List<List<Object>> values = GoogleSheetsUtil.pritnAllValues();
		
		 System.out.println("###########THE VALUE FROM THE SHEET############# \n");
         for (List row : values) {
         	for(int j = 0; j<row.size();j++) {
         		System.out.print( row.get(j)+",");
         	}
             System.out.println();
         }

	}

}
