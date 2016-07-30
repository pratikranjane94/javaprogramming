package com.bridgelabz.classes;
class Stopwatch
{
public static void main(String[] args)
{
		long starttime=System.nanoTime();
		System.out.println("the strattime is="+starttime);
			for(int i= 0;i<1000000;i++)
					{
						Object obj=new Object();
					}
				long endtime=System.nanoTime();
				System.out.println("the endtime is="+endtime);
				long elapsedtime=endtime-starttime;
				System.out.println("the elapsed time between is="+elapsedtime);
}
}
