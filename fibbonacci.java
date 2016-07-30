package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
import static java.lang.Math.*;
 import java.text.DecimalFormat;
class fibbonacci
		{
		public static void main(String[] args)
		{
			Utility u = new Utility();
			System.out.println("enter how many number");
			int n=u.inputNumber();
			System.out.println("enter the number to check");
			double number=u.inputNumber();
		for(int i=0;i<n;i++)
			{
			double k=(pow((1+sqrt(5)),i)-pow((1-sqrt(5)),i))/(pow(2,i)*sqrt(5));
			Double d = new Double(k);
			int j = d.intValue();
			if(number==j)
				{
				System.out.println("number found at index="+i);
				break;
				}
			}

			
		}

}

//ceil(pow((1+sqrt(5)),i)-pow((1+sqrt(5)),i))/(pow(2,i)*sqrt(5))
//(pow((1+sqrt(5)),n)-pow((1+sqrt(5)),n))/(pow(2,n)*sqrt(5))
//double(pow(1.6180339,n)-pow((1/0.6180339),n))/sqrt(5)

//number==ceil((1/sqrt(5))*((pow((1+sqrt(5)/2),n)-(pow((1-sqrt(5)/2),n))))
/*
////////////////////////////////////////////////////////////
Math.ceil(d)///Math.sqrt(5)
number=  	(pow(1.6180339,n) – pow(–0.6180339,n))/sqrt[5] 




	double m=pow(1.6180339,n);
			double k=pow((-1/1.6180339),n);
			double j=(m-k)/Math.sqrt(5);
			double l=ceil((m-k)/j);
			System.out.println(l);

an = [ Phin - (phi)n ]/Sqrt[5]. 
phi=pow(((1-sqrt(5))/2),n)
  
//	System.out.println(k);
//double m=ceil((1/sqrt(5))*((pow((1+sqrt(5)/2),n)-(pow((1-sqrt(5)/2),n)))));
		//System.out.println(m);


double k= pow(((1+sqrt(5))/2),n);
			System.out.println(k);
		double p=pow(((1-sqrt(5))/2),n);
			System.out.println(p);
		double r=((k-p)/(sqrt(5)));
			System.out.println(r);

	*/

