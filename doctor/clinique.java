package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
import java.io.*;
import java.util.*;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

class clinique
{
		Utility u= new Utility();
		Scanner sc = new Scanner(System.in);	
		ArrayList<docs> doctors = new ArrayList<docs>();
		ArrayList<Patient> patients = new ArrayList<Patient>();
		Patient p = new Patient();

	
	
	public void loadInventory()
	{
			docs ravi= new docs("ravi",1,"heart","am");
			docs sumit= new docs("sumit",2,"kidney","pm");
			docs prachi= new docs("prachi",3,"liver","am");
			docs nadeem= new docs("nadeem",4,"cancer","pm");	
			doctors.add(ravi);
			doctors.add(sumit);
			doctors.add(prachi);
			doctors.add(nadeem);

			Patient man= new Patient("man",1,"7280558061");
			Patient han= new Patient("han",2,"9036108931");
			Patient chan= new Patient("pr",3,"888888888");
			Patient mad= new Patient("mad",4,"8795953529");
			patients.add(man);
			patients.add(han);
			patients.add(chan);
			patients.add(mad);	
	}

	public static void main(String[] args) throws Exception
	{
		clinique clinique = new clinique();
		clinique.loadInventory();
        System.out.println("Do you want to perform operation(Enter Y or N): ");
        char ch1;
        Scanner sc1=new Scanner(System.in);
        
        //ch=(char)sc1.nextInt();
        ch1 = (char)System.in.read();
        while(ch1 !='N')
        {
		clinique.display();
        System.out.println("Do you want to perform operation(Enter Y or N): ");
        ch1 = (char)System.in.read();
        }
	}
	public void display()
	{		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);	
		System.out.println("Tmrw date is = "+ sdf.format(calendar.getTime()));		

		System.out.println("Welcome to BridgeLab clinique");
		System.out.println(" 1 : show list of the doctors ");
		System.out.println(" 2 : Show list of the patient");
		System.out.println(" 3 : search for the doctor");
		System.out.println(" 4 : search for the patient");
		System.out.println(" 5 : take an appointment from doctor");
		System.out.println(" 6 : Specialized in");
		System.out.println(" 7 : popular doctors");
		System.out.println(" 8 : Exit"); 
		System.out.print("Select operation = ");
		String operation = sc.next();
		switch(operation)
		{
			case "1":
				System.out.println("List of doctors are"+"\n");
				new docs().listOfDoctors(doctors);
				break;
			
			case "2":
				System.out.println("List of patients are"+"\n");
				p.listOfPatients(patients);
				break;

			case "3":
				searchForTheDoctor();
				break;

			case "4":
				searchForThePatient();
				break;

			case "5":
				System.out.print("Enter the doctor name =");
				String dname = sc.next();
				docs d = new docs().searchByName(doctors,dname);
				if(d != null)
					new docs().takeAppointment(doctors,dname);
				else
					System.out.println("There is no doctor named "+dname);
				break;

			case "6":
				System.out.println("heart");
				System.out.println("brain");
				System.out.println("muscle");
				System.out.println("bone");
				System.out.println("skin");
				break;
			
			case "7":
				new docs().popularity();				
				
			case "8":
				System.exit(1);
				break;
			
			
			default:
				System.out.println("wrong choice");
		}		
	}	// end of display()
		public void searchForTheDoctor()
		{
			docs d = null;
			String operation = "";
			System.out.println(" 1 : Search by name ");
			System.out.println(" 2 : Search by id ");
			System.out.println(" 3 : Search by specialization");
			System.out.println(" 4 : search by availability ");
			System.out.print("Select operation = ");
			operation = u.inputString();
			switch(operation)
			{
				case "1":
					System.out.print("Enter the doctor name =");
					String dname = u.inputString();;
					d = new docs().searchByName(doctors,dname);
					if(d != null)
						new docs().printDoctor(d);
					else
						System.out.println("There is no doctor name "+dname);
				break;

				case "2":
					System.out.print("Enter the doctor id = ");
					int id = u.inputNumber();
					d = new docs().searchById(doctors,id);
					if(d != null)
						new docs().printDoctor(d);
					else
						System.out.println("There is no doctor with id "+id);
				break;
				
				case "3":
					System.out.print("Enter specialization = ");
					String specialization = u.inputString();
					d = new docs().searchBySpecialization(doctors,specialization);
					if(d != null)
						new docs().printDoctor(d);
					else
						System.out.println("There is no "+specialization+" specialization");
				break;

				case "4":				
					System.out.print("Enter availability = ");
					String availability = u.inputString();
					d = new docs().searchByAvailability(doctors,availability);
					if(d != null)
						new docs().printDoctor(d);
					else
						System.out.println("There is no doctor available at this time");
				break;
				default:
					System.out.println("Wrong choice");
			}

		}	// End of searchForTheDoctor()


		public void searchForThePatient()
		{
			Patient p = null;
			String operation = "";
			System.out.println(" 1 : Search by name ");
			System.out.println(" 2 : Search by id ");
			System.out.println(" 3 : Search by mobile number");
			System.out.print("Select operation = ");
			operation = sc.next();
			switch(operation)
			{
				case "1":
					System.out.print("Enter the patient name =");
					String pname = u.inputString();
					p = new Patient().searchByName(patients,pname);
					if(p != null)
						new Patient().printPatient(p);
					else
						System.out.println("There is no such patient name "+pname);
				break;

				case "2":
					System.out.print("Enter the patient id = ");
					int id = u.inputNumber();
					p = new Patient().searchById(patients,id);
					if(p != null)
						new Patient().printPatient(p);
					else
						System.out.println("There is no such patient with id "+id);
				break;

				case "3":
					System.out.print("Enter the patient mobile number = ");
					String mobileNumber = u.inputString();
					p = new Patient().searchByMobileNumber(patients,mobileNumber);
					if(p != null)
						new Patient().printPatient(p);
					else
						System.out.println("There is no such patient with mobile number "+mobileNumber);
				break;

				default:
					System.out.println("Wrong choice");
			}
		}	//	searchForThePatient()
}
