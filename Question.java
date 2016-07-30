package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
class Question
{
public static void main(String[] args)throws Exception
{
		int n,last;
		int count=0;
		Utility u = new Utility();
		n=Integer.parseInt(args[0]);
		last=(int)Math.pow(2,n)-1;
		int first=0;
		int middle=(first+last)/2;
		System.out.println("take your number");
		while(first<=last)
			{
				middle= (first+last)/2;
				System.out.println("is it equals to  middle(true/false)?"+middle);
				String s1=u.inputString();
					if(s1.equals("true"))
					{
					System.out.println("your number is "+middle);
					break;
					}
					System.out.println("is it greater than middle(true/false)?"+middle);
					String s2=u.inputString();
					if(s2.equals("true"))
						{
						first=middle+1;
						count++;
						}
							else
							if(s2.equals("false"))
							{
							last=middle-1;
							count++;
							}
			}
}

}
