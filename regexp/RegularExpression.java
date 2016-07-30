package com.bridgelabz.regex;
//import com.bridgelabz.regex.Utility;
import java.text.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class RegularExpression
  {
    public RegularExpression()
    {
        String data="Hello <<name>> We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.Please,let us know in case of any clarification.Thank you BridgeLabz 01/01/2016.";
				String name1="<<name>>";
				String replaces="VENKATASWAMY";
				Pattern r1=Pattern.compile(name1);
				Matcher m=r1.matcher(data);
				data=m.replaceAll(replaces);
				String p2="<<full name>>";
				String fname="VENKATASWAMY IPPE";
				Pattern r2=Pattern.compile(p2);
				Matcher m1=r2.matcher(data);
				data=m1.replaceAll(fname);
				String p3="91-(x){10}";
				String cno="91-8333035730";
				Pattern r3=Pattern.compile(p3);
				Matcher m2=r3.matcher(data);
				data=m2.replaceAll(cno);
        Date dateobj = new Date();
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
				String currentDate=df.format(dateobj);
				System.out.println(df.format(dateobj));
				Pattern r4=Pattern.compile("(\\d){2}/(\\d){2}/(\\d){4}");
				Matcher m3=r4.matcher(data);
				data=m3.replaceAll(df.format(dateobj));
				System.out.println(data);
      }
      public static void main(String args[])
		    {
          RegularExpression re=new RegularExpression();
        }
}
