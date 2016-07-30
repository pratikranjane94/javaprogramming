import java.util.Scanner;
import java.util.Random;
class coupan
{
public static void main(String[] args)
{
int count=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter the number of coupan you want ");
int n= sc.nextInt();
//Randomnumber rn= new Randomnumber();
generatenumber(n);

} 

//class Randomnumber()
//{
public  static void generatenumber(int n)
{
	//int m=n;
	int d=0;
	Random r= new Random();
	for(int i= 0;i<n;i++)
	{
	d=r.nextInt(600);
	System.out.println(d+",");
	}
//}
}
}
