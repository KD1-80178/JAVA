package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Question_04 {

	public static void main(String[] args) {
	Collection<String> c = new ArrayList<>();
	c.add("B");
	c.add("D");
	c.add("A");
	c.add("C");
	c.add(null);
	c.add(null);
	c.add(null);
	System.out.println("Using ArrayList ....");
	System.out.println(c.toString());
	System.out.println("In ArrayList NULL , Multiple NULL and Duplicates are allowed .....");
	System.out.println();

	Collection<String> c1= new HashSet<>();
	c1.add("B");
	c1.add("D");
	c1.add("A");
	c1.add("C");
	c1.add(null);
	c1.add(null);
	c1.add(null);
	System.out.println("Using HashSet ....");
	System.out.println(c1.toString());
	System.out.println("In HashSet NULL is allowed but Multiple NULL and Duplicates are not allowed .....");
	System.out.println();


	Collection<String> c2 = new LinkedHashSet<>();
	c2.add("B");
	c2.add("D");
	c2.add("A");
	c2.add("C");
	c2.add(null);
	c2.add(null);
	c2.add(null);
	System.out.println("Using LinkedHashset ....");
	System.out.println(c2.toString());
	System.out.println("In LinkedHashset NULL is allowed but Multiple NULL and Duplicates are not allowed .....");
	System.out.println();


	Collection<String> c3 = new TreeSet<>();
	c3.add("B");
	c3.add("D");
	c3.add("A");
	c3.add("C");
	c3.add(null);
	c3.add(null);
	c3.add(null);
	System.out.println("Using TreeSet ....");
	System.out.println(c3.toString());
	System.out.println("In TreeSet we can't add NULL because it gives nullPointerException .....");
	System.out.println();


	}

}
