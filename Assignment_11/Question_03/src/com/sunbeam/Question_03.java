package com.sunbeam;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


//In TreeSet duplicates are not allowed because of Natural ordering.
//TreeSet not consider hashCode()  and equals() method
//The elements are returned in sorted order.

public class Question_03 {

	public static void main(String[] args) {
		Set<Book> set=new TreeSet<>();
		
		set.add(new Book("a0", 250, "Nivedita", 5));
		set.add(new Book("a2", 120, "Namrata", 2));
		set.add(new Book("a4", 174, "Pratik", 4));
		set.add(new Book("a8", 10, "Prabha", 8));
		set.add(new Book("a4", 450, "Rajgonda", 1));  
		set.add(new Book("a1", 125, "prajwal", 5));
		
		for (Book book : set) {
			System.out.println(book);
		}

	}

}
