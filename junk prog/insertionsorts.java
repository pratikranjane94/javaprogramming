import java.io.BufferedReader;
import java.io.InputStreamReader;
class insertionsorts
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the strings:->");
        String str=br.readLine();

        String strArr[]=str.split(" ");

        String temp;                                    

        for(int i = 1; i<strArr.length - 1; i++)        
        {                                               
            for(int j = i; j>0; j--) 
            {   
                                      
                if(strArr[j].compareTo(strArr[j-1]) < 0)
                {                                       
                    System.out.print(strArr[j].compareTo(strArr[j-1]));
                    temp = strArr[j];                    
                    strArr[j] = strArr[j-1];              
                    strArr[j-1] = temp;                  
                }                                       
            }
        }

        for(int i=0;i<strArr.length;i++)
        {
            System.out.println(strArr[i]);
        }
    }
}
