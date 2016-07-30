package com.bridgelabz.classes;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class InventoryManager{
	String nameOfInventory;
	Long weightOfInventory;
	Long priceOfInventory;
	public static void main(String[] args)throws ParseException{
		JSONParser parser = new JSONParser();
		try{
			JSONArray array = (JSONArray)parser.parse(new FileReader("test.json"));
			Iterator<JSONObject> iterator = array.iterator();
			Iterator<JSONObject> iterator1 = array.iterator();
			//displaying the details of the inventory

			System.out.println("Inventory details on all products");
			System.out.println("Name  wt(kg)  price/kg  Total");
			ArrayList<InventoryManager> al = new ArrayList<InventoryManager>();			
			while(iterator.hasNext()){
				JSONObject jsonObject = (JSONObject)iterator.next();
				InventoryManager im = new InventoryManager();
				im.nameOfInventory = (String) jsonObject.get("name");
  	  	System.out.print(im.nameOfInventory+"    ");

				//retriving weight value
				im.weightOfInventory = (Long)(jsonObject.get("weight(kg)"));
				System.out.print(im.weightOfInventory+"      ");
				
				//retriving price values
				im.priceOfInventory = (Long)jsonObject.get("pricekg");
				System.out.print(im.priceOfInventory+ "        ");
				al.add(im);
				
				//printing total value				
				System.out.println(im.priceOfInventory*im.weightOfInventory); 			
			}
			System.out.println();
				System.out.println(al);
			System.out.println("Json Objects");
			while(iterator1.hasNext()){
				JSONObject jsonObject = (JSONObject)iterator1.next();
				System.out.println(jsonObject.toString());			
			}
    } 
		catch(FileNotFoundException e){
    	e.printStackTrace();
    } 
		catch(IOException e){
      e.printStackTrace();
    }
		
	}
		public String toString(){
			return "Name: "+this.nameOfInventory+" Weight: "+this.weightOfInventory+" Price: "+this.priceOfInventory;		
		}
}
