package com.app.fruits;

public class Mango extends Fruits
{
	public void acceptData()
	{
		super.acceptData();
	}
		
	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mango(String color, double weight, String name, boolean isFresh)
	{
		super(color, weight, name, isFresh);
	}
	
	public String taste()
	{
		return "sweet ";
	}
	
}
