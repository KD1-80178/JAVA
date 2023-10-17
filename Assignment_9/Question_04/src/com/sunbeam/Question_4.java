package com.sunbeam;

import java.util.*;

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
public class Question_4 {

	public static void main(String[] args) {
		List<Book> list=new ArrayList<>();
		int choice;
		do
		{
		   
			System.out.println("enter the choice : ");
			System.out.println("0.Exit ");
			System.out.println("1.Add new Book ");
		    System.out.println("2.Display books in forward direction");
			System.out.println("3.delete book at an index ");
			System.out.println("4.check given isbn is in list or not");
			System.out.println("5.delete all books ");
			System.out.println("6.display books in list ");
			System.out.println("7.sort books by price");
			choice=new Scanner(System.in).nextInt();
			System.out.println();
			
			
			switch(choice)
				{
				case 1:
				{
					list.add(new Book("a1",500,"Nivedita",5));
					list.add(new Book("a2",250,"pratik",2));
					list.add(new Book("a3",120,"prajwal",3));
					list.add(new Book("a4",500,"prabha",7));
					list.add(new Book("a5",500,"rohan",8));
					System.out.println("Books are added....");
					break;
				}	
				case 2:
					System.out.println("Books in the list are :");
					for(Book book : list) 
					{
					System.out.println(book);
					}
					System.out.println();
				
					break;
					
				case 3:
				{
					int index;
					System.out.println("enter the index..");
					index=new Scanner(System.in).nextInt();
										
					if(index > 0 && index <list.size())
					 list.remove(index);
					else
						System.out.println("invalid index....");
					
					System.out.println("Book is removed...");
					System.out.println();
					break;
				}
					
				case 4:
				{
					Book b=new Book();
					System.out.println("enter the book isbn =");
					String isbn=new Scanner(System.in).nextLine();
					b.setIsbn(isbn);
					
					if(list.contains(b))
					{
						System.out.println("book with given isbn "+isbn+" is present in list");
					}
					else
						System.out.println("book with given isbn "+isbn+" is not present in list");
					break;
				}
					
				case 5:
				{
					list.clear();
					System.out.println("deleting all books from list....");
					System.out.println();
					break;
				}
					
				case 6:
				{
					System.out.println("Number of books in list = "+list.size());
					System.out.println();
					break;
				}
					
				case 7:
				{
					class bookPriceComparator implements Comparator<Book>
					{
						@Override
						public int compare(Book b1, Book b2) 
						{
							int diff= - Double.compare(b1.getPrice(), b2.getPrice());
							return diff;
						}
					}
					bookPriceComparator comparator=new bookPriceComparator();
					list.sort(comparator);;
					
					System.out.println("After sorting by price = ");
					for (Book b1:list)
						System.out.println(b1);
					System.out.println();
				}
				
				}
		}while(choice!=0);
			
	}

}
		