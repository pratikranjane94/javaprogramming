package com.bridgelabz.classes;
import com.bridgelabz.utility.Utility;
class Sorting 
{
	public static void main(String[] args)throws Exception
	{
		Utility u = new Utility();
	System.out.println("1 for binary search for integer");
	System.out.println("2 for binary search for string");
	System.out.println("3 for insertion sort for integer");
	System.out.println("4 for insertion sort for string");
	System.out.println("5 for bubble sort for integer");
	System.out.println("6 for bubble sort for String");
	int choice = u.inputNumber();
					
				switch(choice)
				{
					case 1:
						{
							//int n=0;
							System.out.println("enter the number of element in array");
							int n=u.inputNumber();
							int[] number=u.input1DArray(n);
							System.out.println("enter the number to be search");
							int key=u.inputNumber();
							int m=u.binarySearch(number,key);
							if(m==-1)
								{
							System.out.println("entered word is not there in file ");
								} 	
							else 	
							{
							System.out.println("entered word at index="+(m));
							}
						break;
					}


			case 2:
						{
								String s=u.getFileText("abc.txt");
								s = s.trim();
								String wordslist[]=s.split(" ");

								for(int i=0;i<wordslist.length;i++)
								{
								System.out.print(wordslist[i]+" ");
								}
								System.out.print("enter the word to be searched :");
								String search=u.inputString(); 
								int index= u.binarySearchString(wordslist,search);
									if(index==-1)
									{
									System.out.println("entered word is not there in file ");
									} 	
									else 	
									{
								System.out.println("entered word at index="+(index));
									}
								break;

						}
					case 3:
					{
								System.out.println("enter the number of element in array");
								int n=u.inputNumber();
								int[] numbers=u.input1DArray(n);
								int[] sorted= u.insertionSort(numbers);
								System.out.println("sorted array are");
								for(int i=0;i<n;i++)
								{
									System.out.print(sorted[i]+" ");
								}
								break;
					}
					case 4:
						{
								String s=u.getFileText("abc.txt");
								s = s.trim();
								String wordslist[]=s.split(" ");
								System.out.println("before sorting ");
							for(int i=0;i<wordslist.length;i++)
								{
								System.out.print(wordslist[i]+" ");

								}
System.out.println("\n ");
								String[] sorted=u.insertionSort(wordslist);
									System.out.println("after sorting ");
								for(int i=0;i<sorted.length;i++)
								{
								System.out.print(sorted[i]+" ");
								}
								break;
						}
			case 5:
						{
								System.out.println("enter the number of element in array");
								int n=u.inputNumber();
								int[] numbers=u.input1DArray(n);
								int[] sorted= u.bubbleSort(numbers);
								for(int i=0;i<n;i++)
								{
								System.out.print(sorted[i]+" ");
								}
								break;
						}
			case 6:
						{
								String s=u.getFileText("abc.txt");
								s = s.trim();
								String wordslist[]=s.split(" ");

								for(int i=0;i<wordslist.length;i++)
								{
								System.out.println(wordslist[i]+" ");
								}
								String[] sorted=u.bubbleSort(wordslist);
								System.out.println("after bubble sorting\n");
								for(int i=0;i<sorted.length;i++)
								{
								System.out.println(sorted[i]+" ");
								}
								break;
						}
				}
	}
}
