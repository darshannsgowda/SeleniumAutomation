package com.guru99.testData;


	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Iterator;

	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	import org.json.simple.parser.JSONParser;
	import org.json.simple.parser.ParseException;

	public class Class {

		public static void main(String[] args) {
			
			JSONParser parser = new JSONParser();
			//JsonParser to convert JSON string into Json Object

			try {
				
				Object obj = parser.parse(new FileReader("Createcustomer.json"));
				JSONObject jsonobject = (JSONObject) obj;
				String UserID = (String)jsonobject.get("UserID");
				String Password = (String)jsonobject.get("Password");
			} catch (FileNotFoundException e) {e.printStackTrace();} 
			catch (IOException e) {e.printStackTrace();}
			catch (ParseException e) {e.printStackTrace();}
		}

	}

