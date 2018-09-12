package com.java.googleSheet;


import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

public class TestClass {
	public static void main(String[] args) throws GeneralSecurityException, IOException {
		ConfigUtil.initialiseProperties();
		String range = ConfigUtil.getProperty("range");    
		String sheetID = ConfigUtil.getProperty("spreadsheetId");
				
		List<List<Object>> values = GoogleSheetsUtil.pritnAllValues(range,sheetID);
		
		 System.out.println("\n########### THE VALUE FROM THE SHEET############# \n");
         for (List row : values) {
         	for(int j = 0; j<row.size();j++) {
         		System.out.print( row.get(j)+", ");
         	}
             System.out.println();
         }
	}
}
