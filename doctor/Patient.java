package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
import java.io.*;
import java.util.*;
import java.util.ArrayList;

class Patient
{
	String name;
	int id;
	String mobileNumber;
	
	public Patient(String name, int id, String mobileNumber)
	{
		this.name = name;
		this.id = id;
		this.mobileNumber = mobileNumber;
	}
	public Patient()
	{
	}
	//	printing patient info
	public void printPatient(Patient p)
	{
		System.out.println("patient id : "+p.id);
		System.out.println("patient name : "+p.name);
		System.out.println("patient mobile number : "+p.mobileNumber);
	}
	//	printing list of patients
	public void listOfPatients(ArrayList<Patient> patients)
	{
			for(Patient p :  patients)
			{
				System.out.println("Patient id : "+p.id);
				System.out.println("Patient name : "+p.name);
				System.out.println("Patient mobile number : "+p.mobileNumber);
				
			}
	}
	//	searchByName
	public Patient searchByName(ArrayList<Patient> patients, String name)
	{
		for(Patient p : patients)
		{
			if(name.equals(p.name) == true)
				return p;
		}
		return null;
	}
	//	searchById
	public Patient searchById(ArrayList<Patient> patients, int id)
	{
		for(Patient p : patients)
		{
			if(p.id == id)
				return p;
		}
		return null;
	}
	//	searchByMobileNumber
	public Patient searchByMobileNumber(ArrayList<Patient> patients, String mobileNumber)
	{
		for(Patient p : patients)
		{
			if(mobileNumber.equals(p.mobileNumber) == true)
				return p;
		}
		return null;
	}
}	// end of patient class
