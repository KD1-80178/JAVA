package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Question_06 {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int n=new Scanner(System.in).nextInt();
		Stream<Integer> strm=Stream.iterate(1, x ->x+1).limit(n);
		
		int result=strm.reduce(1, (a,e)->a*e);
		System.out.println("Factorial of " +n+" is = "+result);

	}

}
