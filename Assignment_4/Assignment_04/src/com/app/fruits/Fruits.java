package com.app.fruits;

import java.util.Scanner;

public class Fruits {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruits() {		
		
	}

	public Fruits(String color, double weight, String name, boolean isFresh) {
		//super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	public void acceptData()
	{
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the color = ");
		color=new Scanner(System.in).next();
		System.out.println("Enter the weight = ");
		weight=new Scanner(System.in).nextDouble();
		System.out.println("Enter the name = ");
		name=new Scanner(System.in).next();
		System.out.println("Is the fruit is fresh = ");
		isFresh=new Scanner(System.in).nextBoolean();
	}

	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", Isfresh=" + isFresh +"]";
	}
	
	public String taste()
	{
		return "no specific taste";
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
