package com.sunbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Question_04 {

	public static void main(String[] args) {

		class bookPriceComparator implements Comparator<Book>
		{
			@Override
			public int compare(Book b1, Book b2) {
				int diff= - Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}
		
		bookPriceComparator comparator=new bookPriceComparator();
		
		TreeSet<Book> set1=new TreeSet<Book>(comparator);
		
		set1.add(new Book("a0", 250, "Nivedita", 5));
		set1.add(new Book("a2", 120, "Namrata", 2));
		set1.add(new Book("a4", 174, "Pratik", 4));
		set1.add(new Book("a8", 10, "Prabha", 8));
		set1.add(new Book("a4", 450, "Rajgonda", 1));  
		set1.add(new Book("a1", 125, "prajwal", 5));
		
		
		Iterator<Book> itr1=set1.iterator();
		
		System.out.println("Price descending set using Iterator.....");
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println();
		System.out.println("set using Descending Iterator.....");
		
		Iterator<Book> itr =set1.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
