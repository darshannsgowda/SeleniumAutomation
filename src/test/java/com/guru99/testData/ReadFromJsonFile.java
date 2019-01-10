package com.guru99.testData;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadFromJsonFile 

{
	@SuppressWarnings("unchecked")
	public static void main(String []args) {
		 JSONParser parser = new JSONParser();
		 
	        try {
	 
	            Object obj = parser.parse(new FileReader(
	                    "C:\\Users\\darsh\\eclipse-workspace\\SeleniumAutomation\\src\\test\\java\\com\\guru99\\testData\\Createcustomer.json"));
	 
	            JSONObject jsonObject = (JSONObject) obj;
	 
	            String UserID = (String) jsonObject.get("UserID");
	            String Password = (String) jsonObject.get("Password");
	            
//	            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
	 
	            System.out.println("Name: " + UserID);
	            System.out.println("Author: " + Password);
//	            System.out.println("\nCompany List:");
//	            Iterator<String> iterator = companyList.iterator();
//	            while (iterator.hasNext()) {
//	                System.out.println(iterator.next());
//	            }
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		
	}
}