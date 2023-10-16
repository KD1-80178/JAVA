package com.exception;

import java.util.Scanner;

public class Program {
	
	private String name;
	private int length;
	
	void acceptString() throws ExceptionLineTooLong
	{
		System.out.println("enter the string");
		name=new Scanner (System.in).next();
		length=name.length();
		System.out.println("length of string = "+length);
		if (this.length>80)
			throw new ExceptionLineTooLong(name,length,"string length should not be more than 80 character");
		
	}

	@Override
	public String toString() {
		return "Program [name=" + name + "]";
	}
	
	
	
	
		
		

	
}
