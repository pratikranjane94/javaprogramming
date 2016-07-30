import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.FileInputStream;
import java.util.Random;
public class Util
{
BufferedReader br,brflie=null;
//constructor for intializing utility class object
	public Util()
		{
		br= new BufferedReader( new InputStreamReader(System.in));
		}
		//to read string value 
		public String inputString()
			{
			try
				{
    		return br.readLine();
				}
				catch(Exception e)
				{
				System.out.println(e.printStackTrace());
				}
				return " ";
			}
		/// to read integer vaue
		public int inputInteger()
		{
			try
			{
			return Integer.parseInt(br.readLine())
			}
		catch
				{
					System.out.println(	e.printStackTrace());
				}
			return 0;
		}
		// to read double value 
		public double inputdouble()
			{
				try
					{
				return Double.parsedouble(br.readLine())
					}
				catch
				{
					System.out.println(	e.printStackTrace());
				}
					return 0.0;
			}
			//to read longinteger
		public long inputLong()
		{
			try
				{
			return Long.parseLong(br.readLine());		
				}
			catch(Exception e)
				{	
				System.out.println(	e.printStackTrace());
				}
				return 0L;
		}
			// to read boolean
		public boolean inputBoolean()
		{
			try
			{
			return Boolean.parseBoolean(br.readLine());	
			}
			catch(Exception e)
			{
			System.out.println(	e.printStackTrace());
			}
			return false;
		}
			// to input integer in array
		public int[] input1DArray(int arraysize)
		{
			int[] array=new int[arraysize];
				for(int i = 0;i<arraysize;i++)
					{
					array[i] = inputInteger();
					}	
				return array;
	  }
//creating String array by reading values
	public String[] input1DStringArray(int arraysize)
	{
		String[] words = new String[arraysize];	
		for(int i = 0;i<words.length;i++)
		{
			System.out.print("Enter word"+(i+1));
			words[i] = inputString();
		}
	return words;
	}

	//printing 1-D String array
	public void print1DStringArray(String[] words)
	{
		System.out.print("[");
		for(int i = 0;i<words.length;i++)
		{
			if(i == words.length-1)
			System.out.print(words[i]);
			else
			System.out.print(words[i]+", ");		
		}
		System.out.print("]");	
	}	
// to read file in java 
				public String readFile(String fileName)
				{
					try
				  {
							FileInputStream fis = new FileInputStream(fileName);
           		char ch;
           		String word="";
           		while (fis.available() > 0)
							{
             		ch = (char) fis.read();
             		word = word+ch;
           		}
        			return word;
					}
					catch(IOException ioe)
						{
							System.out.println(ioe);
						}
					return null;
				}
//reading file data and making it as a String
 	public String readFile(String fileName){
		try{
			FileInputStream fis = new FileInputStream(fileName);
           		char ch;
           		String word="";
           		while (fis.available() > 0){
             		ch = (char) fis.read();
             		word = word+ch;
           		}
        	return word;
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
		return null;
	}

	
		////writing node data to the file
		public  void writeNodeToFile(Node node)
		{
			try
			{	
		String ndata = "";
		FileWriter fw = new FileWriter("UnOrdered.txt");
		while(node != null)
				{
              	ndata += (String)node.getData();
		ndata +=" ";
              	node=node.link;
    		}
			fw.write(ndata);
			fw.close();
			}
		catch(Exception ioe)
		{
			System.out.println(ioe);		
		}
		System.out.println("data written to file successfully");	
		}


	

//converting string values into integer and then storing in array
	public int[] convertStringtoInt(String[] nStrings)
		{
		int len = nStrings.length;
		int [] nums = new int[len];
		for(int i = 0;i < len;i++)
			{
			nums[i] = Integer.parseInt(nStrings[i]);
			}
			return nums;
		}




	}



}
