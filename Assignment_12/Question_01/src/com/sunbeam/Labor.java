package com.sunbeam;

public class Labor implements Employee{
	
	private int hrs;
	private double rate;
	
	@Override
	public double getSal() {
		return this.rate*this.hrs;
	}
	
	public double calIncentives()
	{
		if(this.hrs>300)
			return getSal()*0.05;
		else
			return 0.0;
	}

	public Labor() {
		super();
	}

	public Labor(int hrs, double rate) {
		super();
		this.hrs = hrs;
		this.rate = rate;
	}
	 
	@Override
	public String toString() {
		return "Labor [hrs=" + hrs + ", rate=" + rate + "]";
	}
	
	

}
