package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.ReadFile;
import java.io.BufferedReader;
import java.io.FileReader;
class LinkedListMain
{
	public static void main(String arg[]) throws Exception
	{
		String str,words[];
		int i;	
		Utility u = new Utility();
		ReadFile read = new ReadFile();
		str = read.readFileLineByLine();
		words = str.split(" ");
		for(i=0; i<words.length; i++)
		{
			System.out.println(words[i]);
		}
	}
}
