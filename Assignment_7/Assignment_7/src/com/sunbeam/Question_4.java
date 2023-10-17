package com.sunbeam;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
		
		String s;
		  System.out.println("Enter the String = ");
		  s=new Scanner(System.in).nextLine();
		  System.out.println("Size of string = "+s.length());
		 
		  System.out.println("after trim = "+s.trim());
		  String[] t=s.split("%", 5); 
		 for(String a:t)
			 System.out.println(a);
		 
		 System.out.println(t.length);
		 
	}

}
