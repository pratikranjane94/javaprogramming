package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
public class BalancedParentheses
{
  Utility u1=new Utility();
  public BalancedParentheses()
  {
      //Stack<Character>stack =new Stack();
      StackClassMethod<Character>stack=new StackClassMethod();
      System.out.println("Enter Equation Expression like (3*4)+(4*5) ");
      String  expression =u1.inputString();
      for(int i =0; i<expression.length();i++)
      {
            char c = expression.charAt(i);
            if(c=='(' || c=='{')
            {
                stack.push(c);
            }
            else if(c==')'|| c=='}')
            {
              stack.pop();
            }
        }//end of for loop
        int n=stack.size();
        if(n==0)
        {
            System.out.println("Expression is Balanced ");
        }
        else
        {
            System.out.println("Expresion is Not Balanced");
        }
  }
  public static void main(String[] args)
  {
    BalancedParentheses bp=new BalancedParentheses();
  }
}
