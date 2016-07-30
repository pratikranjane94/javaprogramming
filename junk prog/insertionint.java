import java.util.Scanner;

class insertionint
{
public static void main(String[] args)
{
int temp;
utility u = new utility();
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

int k[]=u.insertionsort(a);	

System.out.println("sorted elements are ");
for(int l=0;l<i;l++)
{
System.out.println(k[l]);
}


}



}
