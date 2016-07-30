 //package utility;
import java.util.Scanner;
class binarysearchs
{
public static void main(String[] args)
{
String searchs;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of words");
int i =sc.nextInt();
String[] a= new String[i];
System.out.println("enter the elements");
		for(int j=0;j<i;j++)
			{
			a[j]=sc.nextLine();
			}
			System.out.println("entered elements are");

			for(int j=0;j<i;j++)
			{
			System.out.println(a[j]+",");
			}
System.out.println("enter element to be found ");
searchs =sc.nextLine();
utility u= new utility();
int index=u.binarySearchString(a,searchs);
if(index==(-1))
{
System.out.println("entered element is not there found ");
}
else
{
System.out.println("enter element found at"+index);

}
}}
