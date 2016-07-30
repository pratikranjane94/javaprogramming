import java.io.BufferedReader;
import java.io.InputStreamReader;
class bubblesorts
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the strings:->");
        String str=br.readLine();
	utility u = new utility();
        String strArr[]=str.split(" ");

        String temp;                                    

       String[] strarry1= u.bubblesortsu(strArr);

        for(int i=0;i<strArr1.length;i++)
        {
            System.out.println(strArr[i]);
        }
    }
}
