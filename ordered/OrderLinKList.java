package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
public class OrderLinKList<E>{

	private Node head;
    private Node tail;
    private int size;


	//add elemnts to the link list.
	public void add(E item){
		Node temp = new Node(item, null, null);
		size++;
		if(head==null){
			head=temp;
			tail=temp;
		}
		else{
			Node trav=head;
			if(item instanceof Integer)
				while(trav!=null){
					if((Integer)trav.getData() > (Integer)item){
						//wants to add integer in between the number
						// 8 -> 10 and add 9
						temp.right=trav;
						temp.left=trav.left;
						if(trav.left!=null)
							(trav.left).right=temp;
						else
							head=temp;

						trav.left=temp;
						return;
					}	
					trav=trav.right;
				}// end of while loop
			if((Integer)item  > (Integer)tail.getData()){
				// Put elements last of the link list.
				temp.left=tail;
				tail.right=temp;
				tail=temp;
			}
			else{
				//Put the elemnts start of the link list.
				temp.left=null;
				temp.right=head;
				head=temp;
			}
		}
	}// end of the add function.

	//search method return true if elements found in the list otherwise return false.
	  public  void display()
    {
        Node temp =start;
        while( temp != null)
        {
            System.out.print(temp.data+"---->");
            temp=temp.nextNode;
        }
        System.out.println(" ");
    }
     // Size of Function
   public  int size()
    {
        int count=0;
        Node temp =start;
        while( temp.nextNode != null)
        {
            temp=temp.nextNode;
            count++;
        }
        System.out.println("sizze of Linked List"+count);
        return count;
    }

   // Serching of a Word Function
   public void searchData()
    {
        Node temp = start;
        int count=0;
        System.out.println("Enter a number to Search");
        int s =u1.inputInteger();
        int flag=0;
        while(temp.nextNode != null)
        {
            count++;
            if( temp.data==s)
            {
                System.out.println(" number is found At "+count);
                flag++;
                break;

            }
            temp=temp.nextNode;
        }

        if(flag == 1)
        {
            removeData(count);
        }
        else
        {
            addItem(s);
            System.out.println("After Adding a LIst ");
            display();
        }

    }
    // removeWord From a Linked lIst
    void removeData(int count)
    {
        Node temp = start;
        if(count==1)
        {
            start =start.nextNode;
        System.out.println("After Deleting LIst is ");

        display();
        }
        else
        {
        for(int i=0;i<count-1;i++)
        {
            temp=temp.nextNode;
        }
        temp.nextNode =temp.nextNode.nextNode;
        System.out.println("After Deleting LIst is ");
        display();
        }
    }
    public static void main(String[] args)
    {
        OrderedLinkedList obj = new OrderedLinkedList();
        obj.getDataFromFile();
        obj.display();
        obj.size();
       	obj.searchData();
    }
}
