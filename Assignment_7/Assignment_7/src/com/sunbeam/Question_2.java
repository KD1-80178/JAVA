package com.sunbeam;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		  String s;
		  System.out.println("Enter the String = ");
		  s=new Scanner(System.in).next();
		  for (int i=s.length()-1;i>=0;i--)
		  {
			  System.out.print(s.charAt(i)+" ");
		  }

	}

}
