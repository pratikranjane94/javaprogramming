package com.bridgelabz.classes;
import com.bridgelabz.classes.NodeUtility;
import com.bridgelabz.classes.Node;
public class HashingFunctionClass
{
  OrderedLinkedList[] order=new OrderedLinkedList[11];
  NodeUtility nu=new NodeUtility();
  public  HashingFunctionClass()
  {
						
            int[] retArray = nu.integerFileReader();
						System.out.println(retArray );
            for(int i=0; i<retArray.length; i++)
            {
                int rem = retArray[i]%11;
                if(order[rem]== null)
                {
                    order[rem] = new OrderedLinkedList();
                    order[rem].addItem(retArray[i]);
                }
                else
                    order [rem].addItem(retArray[i]);
            }
            for(int i=0;i<11;i++)
            {
                System.out.println(i );
                if(order[i] !=null)
                {
                    order[i].display();
                }
            }
    }
    public static void main(String[] args)throws Exception 
    {
      HashingFunctionClass hs=new HashingFunctionClass();
    }
  }
