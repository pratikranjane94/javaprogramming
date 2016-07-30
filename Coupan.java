package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
import java.util.Random;
class Coupan
{
public static void main(String[] args)throws Exception
{
		int count=0;
		Utility u = new Utility();
		System.out.println("enter the number of coupan you want ");
		int n= u.inputNumber();
		System.out.println("enter the range you want");
		int m=u.inputNumber();
		generatenumber(n,m);
} 
	public  static void generatenumber(int n,int m)
	{
	
			int d=0;
			Random r= new Random();
			
			for(int i= 0;i<n;i++)
				{
					d=r.nextInt(m);
					System.out.println(d+",");
				}
	}
}
