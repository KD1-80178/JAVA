package Assignment_2_question_3;

import java.util.Scanner;

public class Date {
	int day;
	int month;
	int year;
	Scanner sc=new Scanner(System.in);
	public Date() {
		this(01,01,2020);
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	void acceptDate()
	{
		System.out.println("Date----------------");
		System.out.println("Enter the day = ");
		day=sc.nextInt();
		System.out.println("Enter the month = ");
		month=sc.nextInt();
		System.out.println("Enter the year = ");
		year=sc.nextInt();
	}
	void display()
	{
		System.out.println("Date = " +this.day+ "/" +this.month+ "/" +this.year);
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
		
}
