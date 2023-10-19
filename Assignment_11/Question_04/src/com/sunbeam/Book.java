package com.sunbeam;

import java.util.Scanner;

public class Book implements Comparable<Book>{
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		super();
		
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	
	public void accept()
	{
		System.out.println("enter the isbn = ");
		isbn=new Scanner(System.in).nextLine();
		System.out.println("enter the price = ");
		price=new Scanner(System.in).nextDouble();
		System.out.println("enter the authorName = ");
		authorName=new Scanner(System.in).nextLine();
		System.out.println("enter the quantity = ");
		quantity=new Scanner(System.in).nextInt();
	}
	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}



	@Override
	public int compareTo(Book b1) {
		int diff=this.isbn.compareTo(b1.isbn);
		return diff;
	}

}