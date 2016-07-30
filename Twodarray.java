package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
import java.util.Scanner;
class Twodarray 
{
	public static void main(String args[])throws Exception
	{
			Utility u = new Utility();
			System.out.println("enter the number of column");
			int m=u.inputNumber();
			System.out.println("enter the number of row");
			int n=u.inputNumber();
			int[][] a= new int[m][n];
			for(int i=0;i<m;i++)
				{
				for(int j= 0;j<n;j++)
					{
						System.out.println("enter the element");
						a[i][j]=u.inputNumber();
					}
				}
			System.out.println("entered 2d array element are ");
			for(int i=0;i<m;i++)
			{
				for(int j= 0;j<n;j++)
					{
						System.out.println(a[i][j]);
					}
			}
	}
}	
