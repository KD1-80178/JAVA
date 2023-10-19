package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//In HashSet duplicates are not allowed because of overriding our own HashCode() and equals() method
// If we are not overriding our own hashCode(), it will take duplicate entries.
// The elements are returned in no particular order.

public class Question_01 {

	public static void main(String[] args) {
		
		Set<Book> set=new HashSet<>();
		
		set.add(new Book("a0", 250, "Nivedita", 5));
		set.add(new Book("a2", 120, "Namrata", 2));
		set.add(new Book("a4", 174, "Pratik", 4));
		set.add(new Book("a8", 10, "Prabha", 8));
		set.add(new Book("a4", 450, "Rajgonda", 1));  
		set.add(new Book("a1", 125, "prajwal", 5));
		
		Iterator<Book> itr=set.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			System.out.println("Set = "+b);
		}

	}

}
