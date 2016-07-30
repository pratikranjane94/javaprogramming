import java.util.Scanner;
class binarysearch
{
public static void main(String[] args)
{
int search;
Scanner sc = new Scanner(System.in);
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
int first= 0;
int last = i-1;
int middle=(first+last)/2;
		while(first<=last)
		{
			if(a[middle]<search)
				{
				first= middle+1;
				}
	else 
		if(search==a[middle])
		{
		System.out.println("search is found at the index of="+(middle+1));
		break;
		}
else 
	
       last = middle-1;
 
      middle = (first + last)/2;
   	
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
  }
}
}
}
