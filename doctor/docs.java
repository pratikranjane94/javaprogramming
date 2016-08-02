package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
import java.io.*;
import java.util.*;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

class docs
{
	String name;
	int id;
	String specialization;
	String availability;
	int appointment1=0;

	public docs(String name, int id, String specialization, String availability)
	{
		this.name = name;
		this.id = id;
		this.specialization = specialization;
		this.availability = availability;
		//appointment1 = 0;
	}

	public docs()
	{
	}
	
	//	printing popularity
	public void popularity()
	{
		System.out.println("doctor sourav is "+Math.random()*10+ " rating");
		System.out.println("doctor shelly is "+Math.random()*10+ "  rating");
		System.out.println("doctor laxman is "+Math.random()*10+ "  rating");
    }
		
	// printing doctor info
	public void printDoctor(docs d)
	{
		System.out.println("Doctor id : "+d.id);
		System.out.println("Doctor name : "+d.name);
		System.out.println("Doctor specialization : "+d.specialization);
		System.out.println("Doctors availability : "+d.availability +"\n");
	}

	// printing list of doctors
	public void listOfDoctors(ArrayList<docs> doctors)
	{
		for(docs d : doctors)
		{
			System.out.println("Doctor id : "+d.id);
			System.out.println("Doctor name : "+d.name);
			System.out.println("Doctor specialization : "+d.specialization);
			System.out.println("Doctors availability : "+d.availability +"\n");
		}
	}
	
	// searchByName
	public docs searchByName(ArrayList<docs> doctors, String name)
	{
		
		for(docs d : doctors)
		{
			if(name.equals(d.name)==true)
				return d;
		}	
		return null;
	}
	
	//	searchById
	public docs searchById(ArrayList<docs> doctors, int id)
	{
		for(docs d : doctors)
		{
			if(d.id == id)
				return d;
		}	
		return null;
	}

	//	searchBySpecialization
	public docs searchBySpecialization(ArrayList<docs> doctors, String specialization)
	{
		for(docs d : doctors)
		{
			if(specialization.equals(d.specialization) == true)
				return d;
		}	
		return null;
	}	

	//	searchByAvailability
	public docs searchByAvailability(ArrayList<docs> doctors, String availability)
	{
		for(docs d : doctors)
		{
			if(availability.equals(d.availability) == true)
				return d;
		}	
		return null;
	}	

	// appointment
	public void takeAppointment(ArrayList<docs> doctors,String name)
	{
    	for(docs dt1:doctors)
		{
			if((name.equals(dt1.name))==true)
            {
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Calendar calendar = Calendar.getInstance();
 			//	dt1.count++;
				
				if(appointment1 <= 5)
				{
					calendar.add(Calendar.DAY_OF_MONTH, 1);	
					String tmrwDate = sdf.format(calendar.getTime());
					System.out.println("your appointment is scheduled at = "+tmrwDate);
			
				}
				else
				{
					calendar.add(Calendar.DAY_OF_MONTH, 2);	
					String tmrwDate2 = sdf.format(calendar.getTime());
					System.out.println("your appointment is scheduled at "+tmrwDate2);
				}
           }
       }
   }

} // end of Doctor class

