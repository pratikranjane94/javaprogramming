import java.io.BufferedReader;
import java.io.InputStreamReader;
class insertionsortstring
{
public static void main(String[] args)throws Exception
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the strings:->");
        String str=br.readLine();

        String s[]=str.split(" ");
				int n=s.length;
          String temp;
		
          for(int i = 1; i < n; i++) 
          {
             temp=s[i];
               for(int j = i; j > 0; j--)
								{
									 if(temp.compareTo(s[j - 1]) < 0)
												
							         s[j] = s[j-1];
											
                    else
												 s[j] = temp;
          }
				 for(int k=0;k<n;k++)
        {
            System.out.println(s[k]);
        }
				
     }
}
}

