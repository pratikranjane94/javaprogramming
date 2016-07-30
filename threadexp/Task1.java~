package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
class MultithreadEx3 extends Thread
  {
   public void run()
		{  
  			for(int i=1;i<=5;i++)
					{  
   					try
								{  
    							Thread.sleep(500);  
  						 	}				
								catch(Exception e)
								{
								System.out.println(e);
								}  
 								System.out.println(i);  
  							}  
 					}  
    }

class MultithreadEx4 extends Thread
  {
    public void run()
		{  
  			for(int i=1;i<=5;i++)
					{  
   					try
								{  
    							Thread.sleep(500);  
  						 	}				
								catch(Exception e)
								{
								System.out.println(e);}  
 								System.out.println(i);  
  							}  
 					}  
    }
  
class Task1
  {
    public static void main(String args[])throws Exception
      {
					Utility u = new Utility();
					System.out.println("enter the number of task");
					int n= u.inputNumber();
					int[] exptime= new int[n];
					int[] deadtime= new int[n];
					for(int i=0;i<n;i++)
					{
					System.out.println("enter the expected and deadtime for the"+i+"task");
					exptime[i]=u.inputNumber();
					deadtime[i]=u.inputNumber();
					}
					for(int i=0;i<n;i++)
					{
					System.out.println("details of the task");
					System.out.println("expected date for the task"+i+"="exptime[i]);
					System.out.println("deadline date for the task"+i+"="deadtime[i]);
					}

			
        MultithreadEx3 th1=new MultithreadEx3();
        MultithreadEx4 th2=new MultithreadEx4();
        th1.start();
        th2.start();
      }
  }
