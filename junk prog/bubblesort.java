import java.util.Scanner;
class bubblesort
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of element");
int n= sc.nextInt();
utility u= new utility();
int[] a= new int[n];
System.out.println("enter element");
for(int i= 0;i<n;i++)
{

a[i]=sc.nextInt();

}
System.out.println("entered element=");
for(int i= 0;i<n;i++)
{
System.out.println(a[i]+",");
}
		int b[]=u.bubblesort(a);
	System.out.println("the sorted array are=");
		for(int i= 0;i<n;i++)
		{
		System.out.println(b[i]+",");
	}

}


}

