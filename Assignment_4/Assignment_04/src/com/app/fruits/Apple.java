package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruits{

	public void acceptData()
	{
		super.acceptData();
	}
	
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String color, double weight, String name, boolean isFresh) 
	{
		super(color, weight, name, isFresh);
	}

	public String taste()
	{
		return "sweet & sour";
	}
	
}
