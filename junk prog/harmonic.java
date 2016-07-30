import java.util.*;
class harmonic
{
public static void main(String[] args)
{

Scanner sc= new Scanner(System.in);
System.out.println("enter the value");
int h = sc.nextInt();
double sum = 0.0;
		if (h==0)
			{
			System.out.println("o is not valid please try sum other integer");

			}
			else
			{
				for(int i =1;i<=h;i++)
				{
				sum = sum+(double) 1/i;
				}
				
				System.out.println("harmonic number value is="+sum);
			}
		}




}
