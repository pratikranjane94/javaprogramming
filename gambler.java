import java.math.*;
import java.util.*;
class gambler
{
public static void main(String[] args)throws Exception
{
int w=0;
int l=0;
Scanner sc= new Scanner(System.in);
int stake, goal, number;
System.out.println("enter the stake");
stake = sc.nextInt();
System.out.println("enter the goal");
goal = sc.nextInt(); 
System.out.println("enter the number");
number = sc.nextInt(); 
int bets= 0;
int win = 0;
for(int i= 0; i<=number;i++)
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



























