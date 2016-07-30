package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
class doctor
{
public static void main(String[] args)
{	
		Utility u = new Utility();
		System.out.println("enter the number of doctor");
		int d=u.inputNumber();
		String[] name=new String[d];
		int[] id=new int[d];
		String[] special=new String[d];
		String[] avail= new String[d];
			for(int i=0;i<d;i++)
				{
				System.out.println("enter details of doctors as name,id,specialization,availability");
				name[i]=u.inputString();
				id[i]=u.inputNumber();
				special[i]=u.inputString();
				avail[i]=u.inputString();
				}
				System.out.println("details of doctors are");
				for(int i=0;i<d;i++)
				{
				System.out.println("name of doctor is="+name[i]);
				System.out.println("id of this doctor is="+id[i]);
				System.out.println("speciality of this doctor is="+special[i]);
				System.out.println("avaialability of this doctor is="+avail[i]);
				}
}	
}
//System.out.println("enter the number of doctor");
