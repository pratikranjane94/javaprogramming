import java.util.Scanner;
class twodarray
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the number of column");
int m=sc.nextInt();
System.out.println("enter the number of row");
int n=sc.nextInt();

int[][] a= new int[m][n];
for(int i=0;i<m;i++)
{
for(int j= 0;j<n;j++)
{
System.out.println("enter the element");
a[i][j]=sc.nextInt();

}

}
System.out.println("entered 2d array element are ");
for(int i=0;i<m;i++)
{
for(int j= 0;j<n;j++)
{
System.out.println(a[i][j]);

}

}

}


}	
