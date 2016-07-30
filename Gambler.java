package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
class Gambler
{
public static void main(String[] args)throws Exception
{
				int w=0;
				int l=0;
				int bets= 0;
				Utility u = new Utility();
				int stake, goal, number;
				System.out.println("enter the stake");
				stake = u.inputNumber();
				System.out.println("enter the goal");
				goal = u.inputNumber();
				System.out.println("enter the number");
				number = u.inputNumber();
				for(int i= 0; i<number;i++)
				{
					int cash = stake;
							if(cash>0 && cash<goal)
									bets++;
										{
														double	 m= Math.random();
																				if(m>0.5)
																				{
																					w++;

																				}
																					else
																						{
																							l++;
																						}
										}

				}

				System.out.println("the percentage of win is "+(w*100)/number);
				System.out.println("the percentage of loss is "+(l*100)/number);
				System.out.println("the average of loss is "+(1.0*bets)/number);
				System.out.println("number of win ="+w);
				System.out.println(number);
}


}



























