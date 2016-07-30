package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
class Primefact
{
public static void main(String[] args)
{
		Utility u = new Utility();
		System.out.println("enter number whose prime factor to be calculated");
		int i=u.inputNumber();
			for(int j= 2;j<=i;j++)
					{
						while(i%j==0)
									{
										System.out.println(j);
										j++;
									}
					 }

}
}
