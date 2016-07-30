import java.util.Scanner;
class triplets
{
public static void main(String[] args)throws Exception
{
int count=0;
Scanner sc= new Scanner(System.in);
System.out.println("enter the number of element");
int n= sc.nextInt();
int[] a= new int[n];
System.out.println("enter the  element");
	for(int i= 0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
// to fix the first number
	for(int i= 0;i<n-1;i++)
	{
// to fix the second number
		for(int j=i+1;j<n-1;j++)
		{
// this is to look for the third number
			for(int k=j+1;j<n-1;j++)
			{
			if(a[i]+a[j]+a[k]==0)
			{
			count++;
			System.out.println("triplets are "+a[i]+","+a[j]+","+a[k]);
			}
			}
		}
	}

System.out.println("number of triplet elements is="+count);

}
}
