package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner; 

public class Question_02 {
	
	
		public static void main(String[] args) {
		List<Book> list=new ArrayList<>();
		int choice;
		do
		{
		   
			System.out.println("enter the choice : ");
			System.out.println("0.Exit ");
			System.out.println("1.Add new Book if not present,if present increament its qty");
		    System.out.println("2.Display books in forward direction using random access");
			System.out.println("3.search book with given isbn ");
			System.out.println("4.delete a book at given index ");
			System.out.println("5.delete book with given isbn ");
			System.out.println("6.reverse the string ");
			System.out.println("7.write books in file");
			System.out.println("8.read book from file ");
			choice=new Scanner(System.in).nextInt();
			System.out.println();
			
			
			switch(choice)
				{
				case 1:
				{
					Book b=new Book();
					b.accept();
					if(list.contains(b))
					{
						int index=list.indexOf(b);
						Book bk=list.get(index);
						bk.setQuantity(bk.getQuantity()+1);						
;					}
					else
						list.add(b);
					break;
				}	
				case 2:
					System.out.println("Books in forward order using list iterator :");
					ListIterator<Book> itr=list.listIterator();
					while(itr.hasNext())
					{
						System.out.println("Element = "+itr.next());
					}
					
					break;
					
				case 3:
				{
					System.out.println("enter the book isbn =");
					String isbn=new Scanner(System.in).nextLine();
					Book key=new Book();
					key.setIsbn(isbn);
					int index=list.indexOf(key);
					if(index==-1)
						System.out.println("Book with isbn "+isbn+" is not found");
					else
						System.out.println("Book with isbn "+isbn+" is found");
					break;
				}
					
				case 4:
				{
					System.out.println("enter an index =");
					int index1=new Scanner(System.in).nextInt();
					
					if(index1 >= 0 && index1 <list.size())
					{
					list.remove(index1);
					System.out.println("Book at index "+index1+" is deleted");
					}
					else
						System.out.println("book is not deleted..");
					break;
				}
					
				case 5:
				{
					System.out.println("enter the book isbn =");
					String isbn=new Scanner(System.in).nextLine();
					Book b2=new Book();
					b2.setIsbn(isbn);
					int index2=list.indexOf(b2);
					
					if(index2 >= 0 && index2 <list.size())
					{
					list.remove(index2);
					System.out.println("Book of given isbn "+isbn+" is deleted");
					}
					else
						System.out.println("Book of given isbn "+isbn+" is not found");
					break;
				}
					
				case 6:
				{
					Collections.reverse(list);
					System.out.println("list in reverse order = ");
					System.out.println(list);
					break;
				}
				
				case 7:
						try(FileOutputStream fout=new FileOutputStream("Books.txt"))
						{
							try(ObjectOutputStream oout=new ObjectOutputStream(fout))
							{
								oout.writeObject(list);
							}
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
						System.out.println("Books are saved in file .....");
					
					break;
					
				case 8:
					try(FileInputStream fin=new FileInputStream("Books.txt"))
					{
						try(ObjectInputStream oin=new ObjectInputStream(fin))
						{
							list=(List<Book>) oin.readObject();
							for (Book book : list) {
								System.out.println(book);
							}
						} 
					}catch (EOFException e) 
					   {
							
					    }
					catch(Exception e)
					{
						e.printStackTrace();
					}
					break;
					
				default:
				System.out.println("Invalid choice ............");
					
				}
		}while(choice!=0);
		

	}

}
