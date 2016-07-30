package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
class Jsonexample
{
			public static void main(String[] args)throws Exception 
			{
				Utility u = new Utility();
				JSONArray array= new JSONArray();
				
			for(int i=0;i<3;i++)
		{
			JSONObject obj = 	new JSONObject();
			System.out.println("Enter Name");
			String name = u.inputString();
			System.out.println("Enter Weight");
			int num = u.inputNumber();
			System.out.println("Enter price/kgs");
			int price = u.inputNumber();
			obj.put("name",name);
			obj.put("weight(kg)",new Integer(num));
			obj.put("price/kg",new Integer(price));
			array.add(obj);
		}

	try{
			FileWriter fw = new FileWriter("test.json");
			fw.write(array.toJSONString());
			fw.flush();
			fw.close();
		}
		//handling the exception
		catch(IOException ioe){
			System.out.println(ioe);
		}
				//displaying the json data
		System.out.println(array);
			}
}
