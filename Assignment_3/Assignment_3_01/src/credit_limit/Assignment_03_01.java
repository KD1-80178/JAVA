package credit_limit;

import java.util.Scanner;

class Customer
{
	int accountNo;
	int balance;
	int charges;
	int credit;
	int credit_limit;
	
	Scanner sc=new Scanner(System.in);
	public Customer() {
		
	}
	
	public Customer(int accountNo, int balance, int charges, int credit, int credit_limit) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.charges = charges;
		this.credit = credit;
		this.credit_limit = credit_limit;
	}
	
	void acceptData()
	{
		System.out.println("Enter the accountNo = ");
		accountNo=sc.nextInt();
		System.out.println("Enter the balance = ");
		balance=sc.nextInt();
		System.out.println("Enter the charges = ");
		charges=sc.nextInt();
		System.out.println("Enter the credit = ");
		credit=sc.nextInt();
		System.out.println("Enter the credit_limit = ");
		credit_limit=sc.nextInt();
	}
	void display()
	{
		System.out.println("Account details -------------- ");
		System.out.println("Account number ="+accountNo+" Balance = "+balance+" Charges = "+charges+" Credit= "+credit);
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(int credit_limit) {
		this.credit_limit = credit_limit;
	}
	void newBalance()
	{
		int newBalance=0;
		newBalance=this.balance+this.charges-this.credit;
		System.out.println("New balance = "+newBalance);
		if(newBalance>this.credit)
			System.out.println("credit limit exceeded");
		else
			System.out.println("credit limit not exceeded");
	}
}
public class Assignment_03_01 {

	public static void main(String[] args) {
		Customer c1=new Customer(213,1000,100,250,700);
		c1.display();
		c1.newBalance();
		
		Customer c2=new Customer();
		c2.acceptData();
		c2.display();
		c2.newBalance();

	}

}
