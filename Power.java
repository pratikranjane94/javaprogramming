package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
class Power
{
public static void main(String[] args)
{
			int sum= 2;
			int k =0;
			int i=Integer.parseInt(args[0]);
				System.out.println("entered integer is="+i);
			if(i>=31)
				{
			System.out.println("entered integer i shuold be less than 31");
				}
			else
			if(i==0)
			{
			System.out.println("power of 2 raised to 1="+k);
			}
		else 
			if(i==1)
			{
			System.out.println("power of 2 raised to 1="+sum);
			}
			else
		
					for(int j=1;j<=i;j++)
						{
							sum = sum*2;
							System.out.println(sum+"\n");
						}	
}

}
