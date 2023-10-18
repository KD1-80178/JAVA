package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Question_02 {

	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		 s.add("A");
		 s.add("B");
		 s.add("C");
		 s.add("Pratik");
		 s.add("tej");
		 s.add("Pavan");
		 s.add("Namrata_patillll");
		 s.add("John");
		 
		 System.out.println("List = "+s);
		 
		 class stringLengthComparator implements Comparator<String>
			{
				@Override
				public int compare(String s1, String s2) {
					int diff=s1.length()-s2.length();
					return diff;
				}
			}
			
		stringLengthComparator comparator=new stringLengthComparator();
		 
		 System.out.println("String with highest length = "+Collections.max(s, comparator));


	}

}
