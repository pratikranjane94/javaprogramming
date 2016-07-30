package com.bridgelabz.classes;
import java.util.Arrays;
import com.bridgelabz.utility.Utility;

class Anagram
{
public static void main(String[] args)throws Exception
{
		int k=0;
		int l=0;
		boolean flag = false;
		Utility u = new Utility();
		System.out.println("enter the fisrt word");
		String fword = u.inputString();
		int n=fword.length();
		System.out.println("enter the second word");
		String sword = u.inputString();
		int m=sword.length();
		if(n!=m)
			{
				System.out.println("string is not anagram");
				System.exit(0);
			}
		else 
				{	
					char[] ch1=fword.toCharArray();
					char[] ch2=sword.toCharArray();
			//Sorting both ch1 and ch2
					Arrays.sort(ch1);
					Arrays.sort(ch2);
			//Checking ch1 and ch2 are equal
				flag=Arrays.equals(ch1,ch2);
			}
				if(flag)
					{
						System.out.println("string is anagram");
					}
				else
					{
					System.out.println("string is not anagram");
					}
}
}

//////////////////////////////
		
