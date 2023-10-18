package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;

class Book
{
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
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	
}

public class Question_01 {

	public static void main(String[] args) {
		List<Book> list=new ArrayList<>();
		int choice;
		do
		{
		   
			System.out.println("enter the choice : ");
			System.out.println("0.Exit ");
			System.out.println("1.Add new Book if not present,if present increament its qty");
		    System.out.println("2.Display books in forward direction using random access");
			System.out.println("3.search book with given isbn ");
			System.out.println("4.delete a book at given index ");
			System.out.println("5.delete book with given isbn ");
			System.out.println("6.reverse the string ");
			choice=new Scanner(System.in).nextInt();
			System.out.println();
			
			
			switch(choice)
				{
				case 1:
				{
					Book b=new Book();
					b.accept();
					if(list.contains(b))
					{
						int index=list.indexOf(b);
						Book bk=list.get(index);
						bk.setQuantity(bk.getQuantity()+1);						
;					}
					else
						list.add(b);
					break;
				}	
				case 2:
					System.out.println("Books in forward order using list iterator :");
					ListIterator<Book> itr=list.listIterator();
					while(itr.hasNext())
					{
						System.out.println("Element = "+itr.next());
					}
					
					break;
					
				case 3:
				{
					System.out.println("enter the book isbn =");
					String isbn=new Scanner(System.in).nextLine();
					Book key=new Book();
					key.setIsbn(isbn);
					int index=list.indexOf(key);
					if(index==-1)
						System.out.println("Book with isbn "+isbn+" is not found");
					else
						System.out.println("Book with isbn "+isbn+" is found");
					break;
				}
					
				case 4:
				{
					System.out.println("enter an index =");
					int index=new Scanner(System.in).nextInt();
					
					if(index >= 0 && index <list.size())
					{
					list.remove(index);
					System.out.println("Book at index "+index+" is deleted");
					}
					else
						System.out.println("book is not deleted..");
					break;
				}
					
				case 5:
				{
					System.out.println("enter the book isbn =");
					String isbn=new Scanner(System.in).nextLine();
					Book b2=new Book();
					b2.setIsbn(isbn);
					int index=list.indexOf(b2);
					
					if(index >= 0 && index <list.size())
					{
					list.remove(index);
					System.out.println("Book of given isbn "+isbn+" is deleted");
					}
					else
						System.out.println("Book of given isbn "+isbn+" is not found");
					break;
				}
					
				case 6:
				{
					Collections.reverse(list);
					System.out.println("list in reverse order = ");
					System.out.println(list);
					break;
				}
				default:
				System.out.println("Invalid choice ............");
					
				}
		}while(choice!=0);
			
	}
}



	


