package com.sunbeam;

import java.util.HashMap;

// We don't required to add hashCade() and equals() method in book class..
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


//No need to write equals() and hashCode() in Student class,because our key is of Integer type which has its own equals() and hashCode() methos.
	
public class Question_05 {

	public static void main(String[] args) {
		Map<String,Book> map=new HashMap<>();
		
		int choice;
		do {
			System.out.println("Enter the choice = ");
			System.out.println("1. Insert book into map");
			System.out.println("2. find the book in map");
			choice=new Scanner(System.in).nextInt();
			
			switch(choice)
			{
			case 1:
				Book b=new Book();
				b.accept();
				map.put(b.getIsbn(), b);
				break;
				
			case 2:
				System.out.println("enter the book isbn = ");
				String isbn = new Scanner(System.in).next();
				b = map.get(isbn);
				if(b==null)
					System.out.println("book is not found....");
				else
				{
					System.out.println("book is found....");
					System.out.println("Book with given isbn" +isbn+" is = "+b);
				}
				break;
				
			case 3:
				Set<Entry<String,Book>> entries = map.entrySet();
		        for(Entry<String,Book> entry : entries) {
		        	System.out.println(entry.getKey() + " -- " + entry.getValue());
		        }
				
			}
					
		}while(choice!=0);
	
	}

}
