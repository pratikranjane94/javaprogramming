package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileReader1
{
    public static void main(String[] args) throws Exception
    {
	    int a=0;/*This variable is used to hold no. of shares of a stock.*/
        int z;/*This variable is used to hold the price of a stock.*/
        int c=0;/*This counter is used to avoid over-writing no. of shares of a stock and it's price in the same variable.*/
        int p;/*This counter is used to avoid printing no. of shares or stock price instead of stock name.*/
        int q=0;
        int i=0;
        int r=0;
				Utility u = new Utility();
        String k="";/*This variable is used to hold the stock name.*/
		FileReader fr=new FileReader("stocksummary.txt");/*stocksummary is a text file storing stock report.*/
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
        FileReader1 t=new FileReader1();
        int x[]=new int[100];
        /*This while loop is used to read all the strings line by line from a text file.*/
		while((line=br.readLine())!= null)
        {   
            boolean b=t.isNumerical(line);
            p=0;
            if(b==true)//This if block is used to check if the string is numeric or not.
            {
                x[i]=Integer.parseInt(line);
                i++;
                q++;
                p++;
                if(q%2==0)
                {
                    r=r+(x[i-1]*x[i-2]);
                    System.out.println(x[i-1]*x[i-2]);
                }
            }
           	else if(p==0)
			{
                k=line;
                System.out.println("The total value of stock "+k+" is: ");
			}
            
      }
      System.out.println("The total value of all stocks is :"+r);
    }
    /*This function is used to check if the string is numerical or not.*/
	public static boolean isNumerical(String line)
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
	
    }

}
