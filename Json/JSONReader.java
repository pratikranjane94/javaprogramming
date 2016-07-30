package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class JSONReader{
	public static void main(String[] args)throws Exception{
		
		//creating JSonParser Object it is use to convert a JSON text to a JavaScript object.
		JSONParser parser = new JSONParser();
		
		try{     
			//Parse method will read data from the file and return the object
			JSONArray array = (JSONArray)parser.parse(new FileReader("test.json"));
			
			//calling iterator method on jsonArray object
			Iterator<JSONObject> iterator = array.iterator();

			//displaying the details of the inventory
			System.out.println("Name  wt(kg)  price/kg  Total");			
			while(iterator.hasNext()){
				JSONObject jsonObject = (JSONObject)iterator.next();						
				String name = (String) jsonObject.get("name");
  	  	System.out.print(name+"    ");

				//retriving weight value
				Long weight = (Long)(jsonObject.get("weight(kg)"));
				System.out.print(weight+"      ");
				
				//retriving price values
				Long priceperkg = (Long)jsonObject.get("pricekg");
				System.out.print(priceperkg+ "        ");
				
				//printing total value				
				System.out.println(priceperkg*weight); 			
			}
    } 
		catch(FileNotFoundException e){
    	e.printStackTrace();
    } 
		catch(IOException e){
      e.printStackTrace();
    }
	}
}
