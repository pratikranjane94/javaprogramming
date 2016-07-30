package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
public class Stock1
{
		public static void main(String [] args)throws Exception
{

int number=0;
double total=0.0;
double prize=0.0;
String sharename="";
String[] wordslist1=null;
		stockreport1 sr= new  stockreport1();
		Utility u = new Utility();
		String s=u.getFileText("abc.txt");
		s = s.trim();
		String[] wordslist=s.split("\n");
			for(int i=0;i<wordslist.length;i++)
			{
					System.out.println(wordslist[i]);

for(int i=0;i<)

						if(wordlist.charAt[i]==',')

					 wordslist1=wordslist[i].split(",");
					//System.out.println(wordslist1[1]);

			}

			for(int i=0;i<wordslist1.length;i++)
			{
			System.out.println(wordslist1[i]);
			}













/*
			for(int i=0;i<wordslist1.length;i++)
			{
			System.out.println(wordslist1[i]);
			}



			for(int i=0;i<wordslist.length;i++)
			{
				String wordslist1[]=wordslist.split(",");
			}
			for(int i=0;i<wordslist1.length;i++)
			{
			System.out.println(wordslist1[i]);
			}
/*
				for(int j=0;j<wordslist.length;j++)
					{
		
									 sharename =wordslist[j];
									 number=Integer.parseInt(wordslist[j+1]);
									 prize=Double.parseDouble(wordslist[j+2]);
								 sr.stockreport1(number,prize);
						}


	

				/*	for(int i=0;i<wordslist.length;i++)
						{
				
						}


			public static boolean isNumber(String line)
			{
        try
	    	{
		    Integer.parseInt(line);
        }
				catch(Exception e)
				{
		    return false;
				}
        return true;
  		 }*/
		/*System.out.println("Enter name of stocks");
		String stockname = u.inputString();
		System.out.println("Enter share name");
		String sharename = u.inputString();
		System.out.println("Enter number of share");
		int number= u.inputNumber(); 
		System.out.println("Enter prize of share");
		double prize= u.inputNumber(); 
		double total= sr.stockreport1(number,prize);
		System.out.println("total share prize of "+sharename+"="+total);*/

}
}
