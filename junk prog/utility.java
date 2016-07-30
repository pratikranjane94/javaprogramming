import java.io.*;
//import java.io.InputStreamReader;
import java.util.Arrays;
//import java.io.BufferedReader;
import java.util.Scanner;
class utility
{
//Scanner sc = new Scanner(System.in);
BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
/*public int inputNumber()
{
		try
		{
			return Integer.parseInt(br.readLine());	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
}
public String getFileText(String fileName)
{
		try
		{
			brfile = new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line = brfile.readLine();
			while(line!=null)
			{
				sb.append(line);
				sb.append(System.lineSeparator());
				line = brfile.readLine();		
			}
			return sb.toString();
		 }
		catch(Exception exception)
		{
			return null;
		}
}	
	
/*public String[] bubblesortsut(String[] strarr)
{
for(int i = 0; i<strArr.length - 1; i++)        
        {                                               
            for(int j = 0; j<strArr.length - 1; j++) 
            {                                           
                if(strArr[j].compareTo(strArr[j+1]) > 0)
                {                                       
                    temp = strArr[j];                    
                    strArr[j] = strArr[j+1];              
                    strArr[j+1] = temp;                  
                }                                       
            }
        }

}
/*public int[] bubblesort(int[] k)
{
int n = k.length;
for(int i= 0;i<(n-1);i++)
			{
				for(int j= 0;j<(n-i-1);j++)
				{
					if(k[j]>k[j+1])
						{
						int temp=k[j];
						k[j]=k[j+1];
						k[j+1]=temp;
						}
				}	
			}
	
return k;
}




public int binarysearchint(int[] a,int search)
{

int first= 0;
int last = a.length-1;
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
		return middle+1;

		}
		else 
			{
				if(search < a[middle])
					last = middle-1;
				else
					first = middle+1;
			}
		}
		return -1;
	
}*/

	
	public int binarySearchString(String words[], String key)
	{
		Arrays.sort(words);
		System.out.println("Soretd List");
		for(int i=0; i<words.length; i++)
			System.out.print(words[i]+" ");
		System.out.println("\n");
	
		int first = 0,last = words.length;
		while(first < last){
		int mid = (first+last)/2;
		if(key.compareTo(words[mid]) < 0){
			last = mid;
		}
		else if(key.compareTo(words[mid]) > 0){
			first = mid+1;
		}
		else{
		return mid;
		}
		}	
	return -1;
	}
}
	/*boolean stringCompare(String str1, String str2)
	{
		//char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String str = "abcdefghijklmnopqrstuvwxyz";
		int i,index1,index2;
		char c1,c2;
		boolean flag=false;
		for(i=0; i<str1.length() || i<str2.length(); i++)
		{
			if(i>=str1.length())
				return flag = true;
			else if(i>=str2.length())
				return flag = false;
			else
			{
				c1 = str1.charAt(i);
				c2 = str2.charAt(i);
				index1 = str.indexOf(c1);
				index2 = str.indexOf(c2);
				//System.out.println(index1+" "+c1+"\t"+index2+" "+c2);
				if(index1<index2)
					return flag = true;
				else if(index1>index2)
					return flag = false;
			}
		}
		return flag;
	}
}

	/*public int[] insertionsort(int[] j)	
	{
 	int i=j.length;
	int temp;
	for(int m= 1;m<j.length;m++)	
	{
		for(int n=m;n>0;n--)
	{
		if(j[n]<j[n-1])
			{
 			temp= j[n];
			j[n]=j[n-1];
			j[n-1]=temp;
			}
	}}
return j;
}*/



