package com.exception;

public class ExceptionLineTooLong extends Exception{
	private String string;
	private int length;

	public ExceptionLineTooLong() {
		
	}
	
	

	public ExceptionLineTooLong(String string, int length) {
		super();
		this.string = string;
		this.length = length;
	}



	public ExceptionLineTooLong(String string, int length,String msg) {
		super(msg);
		this.string = string;
		this.length = length;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [string=" + string + ", length=" + length + ", getMessage()=" + getMessage() + "]";
	}
	
	

	
	
	
	
	
}
