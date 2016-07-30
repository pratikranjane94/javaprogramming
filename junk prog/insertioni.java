import java.util.Scanner;

class insertioni
{
public static void main(String[] args)
{
int temp;
Scanner sc = new Scanner(System.in);
System.out.println("enter number of element ");
int i = sc.nextInt();
int[] a= new int[i];
System.out.println("enter elements ");
for(int j=0;j<i;j++)
{
a[j]=sc.nextInt();
}
System.out.println("entered elements are ");
for(int j=0;j<i;j++)
{
System.out.println(a[j]);
}

for(int m= 1;m<i;m++)
	{
	for(int n=m;n>0;n--)

	{
	if(a[n]<a[n-1])
		{
 		temp= a[n];
		a[n]=a[n-1];
		a[n-1]=temp;


		}
	}
	}

System.out.println("sorted elements are ");
for(int j=0;j<i;j++)
{
System.out.println(a[j]);
}


}



}
