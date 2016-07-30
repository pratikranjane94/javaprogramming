import java.util.Scanner;
class binarysearchin
{
public static void main(String[] args)
{
int search;
Scanner sc = new Scanner(System.in);
utility u=new utility();
System.out.println("enter the number of element");
int i =sc.nextInt();
int[] a= new int[i];
System.out.println("enter the elements");
		for(int j=0;j<i;j++)
			{
			a[j]=sc.nextInt();
			}
			System.out.println("entered elements are");

			for(int j=0;j<i;j++)
			{
			System.out.println(a[j]+",");
			}
			System.out.println("enter element to be search");
			{
			search =sc.nextInt();
			}
		int m=u.binarysearchint(a,search);
		if(m==-1)
		{
		System.out.println("enter the not elements");
		}
		else 
		{
		System.out.println("element present at"+m);
		}
  
}
}
