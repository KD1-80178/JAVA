package assignment_2_question_1;

import java.util.Scanner;

public class Invoice{
	String partNumber;
	String partDescription;
	int quantity;
	double pricePerItem;
	Scanner sc=new Scanner(System.in);
	
	void acceptData()
	{
		System.out.println("Enter the Part number = ");
		this.partNumber=sc.next();
		System.out.println("Enter the Part description = ");
		this.partDescription=sc.next();
		System.out.println("Enter the Quantity = ");
		this.quantity=sc.nextInt();
		System.out.println("Enter the price per item = ");
		this.pricePerItem=sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Product details = "+partNumber+","+partDescription+","+quantity+","+pricePerItem);
	}
	
	
	public Invoice() {
		
	}

	public Invoice(String partNumber, String partDescription, int quantity, int pricePerItem) {
		//super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
		
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	void calculateInvoiceAmount()
	{
		if(this.quantity<0 || this.pricePerItem<0)
		{
			setQuantity(0);
			setPricePerItem(0.0);
		}
		System.out.println("Invoice amount = "+this.quantity*this.pricePerItem);
	}
}
	

