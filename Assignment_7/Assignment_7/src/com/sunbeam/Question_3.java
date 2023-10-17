package com.sunbeam;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		String s;
		String r="";
		System.out.println("Enter the String = ");
		s=new Scanner(System.in).next();
		  for (int i=s.length()-1;i>=0;i--)
		  {
			  r=r+s.charAt(i);
		  }	
		  
		  if(s.equals(r))
			  System.out.println("String is palindrome....");
		  else
			  System.out.println("string is not palindrome...");

	}

}
