import java.util.Scanner;
class insertion
{
public static void main(String[] args)throws Exception
{
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the words");
	i = sc.nextInt();
		String[] words = new String[i];
		System.out.println("enter the words");
		for(int j= 0; j<i;j++)
		{
		words[i]= sc.nextLine();
		}


}
}



  public static void insertionSortAsc(String[] names, int i) 
    {
        String temp = words[i];
        int j = i-1;
        while (j >= 0 && words[j].compareToIgnoreCase(temp) > 0) 
	{
            words[j+1]=words[j];
            j--;
        }
        words[j+1]=temp; 
    }
public static insertionsort(String[] words,i)
{
for(int j= 0; j<i;j++)
{
insertionsortasc(words,i)
}

}
