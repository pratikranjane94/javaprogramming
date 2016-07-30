package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
//import java.util.Scanner;
class anagram
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
else {
		for(int i =0;i<n;i++)
			{
			  for(int j= 0;j<m;j++)
				{
				if(fword.charAt(i)!=sword.charAt(j))
					{
					flag=false;
					}
else{
k++;
				flag=true;
}
				}
				
			}
}
if(k==m)
{
System.out.println("string is anagram");
}
else
{

System.out.println("string is not anagram");

}

}


}
