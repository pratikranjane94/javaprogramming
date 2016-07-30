package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
class Harmonic
{
public static void main(String[] args)throws Exception
{
		double sum = 0.0;
		Utility u = new Utility();
		System.out.println("enter the value");
		int h = u.inputNumber();
		if (h==0)
				{
				System.out.println("0 is not valid please try sum other integer");
				}
			else
			{
				for(int i =1;i<=h;i++)
				{
				sum = sum+(double) 1/i;
				}
				System.out.println("harmonic number value is="+sum);
			}
}
}
