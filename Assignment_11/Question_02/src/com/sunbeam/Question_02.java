package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


//In LinkedHashSet duplicates are not allowed because of overriding our own HashCode() and equals() method
//If we are not overriding our own hashCode(), it will take duplicate entries.
//The elements are returned in the same order that of Insertion.


public class Question_02 {

	public static void main(String[] args) {
		
		Set<Book1> set=new LinkedHashSet<>();
		
		set.add(new Book1("a0", 250, "Nivedita", 5));
		set.add(new Book1("a2", 120, "Namrata", 2));
		set.add(new Book1("a4", 174, "Pratik", 4));
		set.add(new Book1("a8", 10, "Prabha", 8));
		set.add(new Book1("a4", 450, "Rajgonda", 1));  
		set.add(new Book1("a1", 125, "prajwal", 5));
		
		Iterator<Book1> itr=set.iterator();
		while(itr.hasNext()) {
			Book1 b=itr.next();
			System.out.println("Set = "+b);
		}


	}

}
