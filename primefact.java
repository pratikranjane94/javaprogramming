import java.util.*;
class primefact
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter number whose prime factor to be calculated");
int i=sc.nextInt();
for(int j= 2;j<=i;j++)
{

while(i%j==0)
{

System.out.println(j);
j++;
}

}


}




}
