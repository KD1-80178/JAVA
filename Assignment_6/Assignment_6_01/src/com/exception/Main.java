package com.exception;

public class Main {

	public static void main(String[] args)  {
		Program p1=new Program();
		Program p2=new Program();
		try {
		p1.acceptString();
		p2.acceptString();
		}
		catch(ExceptionLineTooLong e)
		{
			e.printStackTrace();
		}
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
	}

}
