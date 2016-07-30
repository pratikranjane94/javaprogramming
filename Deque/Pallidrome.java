package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;

 public class Pallidrome
{
Utility u = new Utility();
public void  checkPalindrome()
{
	
	System.out.println("enter the string to be check pallidrome or not");
	String name =u.inputString();
	DequeUtil <Character> obj= new DequeUtil<Character>();
				for(int i=0;i<name.length();i++)
					{
					char ch =name.charAt(i);
          obj.addRear(ch);
					}
				int count=0;
      	while(obj.size() > 1)
      	  {
            if(obj.removeFront() != obj.removeRear())
            {
                count++;
                break;
            }
        }
 if(count==0)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is Not palindrome");
        }
    }


public static void main(String[] args)

{
Pallidrome p= new Pallidrome();
p.checkPalindrome();


}
}
