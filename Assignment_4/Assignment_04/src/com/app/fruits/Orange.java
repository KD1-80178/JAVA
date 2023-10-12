package com.app.fruits;

public class Orange extends Fruits
{
	public void acceptData()
	{
		super.acceptData();
	}
	
	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orange(String color, double weight, String name, boolean isFresh)
	{
		super(color, weight, name, isFresh);
	}
	public String taste()
	{
		return "sour ";
	}
	
}
