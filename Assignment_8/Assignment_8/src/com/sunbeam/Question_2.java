package com.sunbeam;

import java.util.Scanner;

class Person implements Displayable
{
	private String name;
	private int age;
	
	public void accept()
	{
		System.out.println("Enter the person details =======");
		System.out.println("enter the name = ");
		this.name=new Scanner(System.in).next();
		System.out.println("enter the age = ");
		this.age=new Scanner(System.in).nextInt();
	}

	@Override
	public void display() {
		System.out.println("displaying person data ======");
		System.out.println("Name = "+name+" Age = "+age);
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
class Date implements Displayable
{
	private int day;
	private int month;
	private int year;
	
	public void accept()
	{
		System.out.println("Enter the Date details =======");
		System.out.println("enter the day = ");
		this.day=new Scanner(System.in).nextInt();
		System.out.println("enter the month = ");
		this.month=new Scanner(System.in).nextInt();
		System.out.println("enter the year = ");
		this.year=new Scanner(System.in).nextInt();
	}

	@Override
	public void display() {
		System.out.println("displaying Date data ======");
		System.out.println("Day = "+day+" Month = "+month+" year = "+year);
		
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
class employee
{
	private int id;
    private float sal;
    
    void accept()
    {
    	System.out.println("enter the employee details ===========");
        System.out.println("enter the id =");
        id=new Scanner(System.in).nextInt();
        System.out.println("enter the salary =");
        sal=new Scanner(System.in).nextFloat();
    }
    
    void disp()
    {
    	System.out.println("displaying the employee details ===========");
    	System.out.println("ID = "+id);
    	System.out.println("Salary = "+sal);
    }

	@Override
	public String toString() {
		return "employee [id=" + id + ", sal=" + sal + "]";
	}
    
}
class boxx <T>
{
	private T obj;
	
	public void set(T obj)
	{
		this.obj=obj;
	}
	public T get()
	{
		return this.obj;
	}
}

public class Question_2 {
	public static void printDisplayableBox(boxx<? extends Displayable > b)
	{
		b.get().display();
	}
	public static void printBox(boxx< ? >b)
	{
		System.out.println(b.get().toString());
	}

	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.accept();
								
		boxx<Person> b1=new boxx<>();
		b1.set(p1);
		printDisplayableBox(b1);
		
		Date d1=new Date();
		d1.accept();
				
		boxx<Date> b2=new boxx<>();
		b2.set(d1);
		printDisplayableBox(b2);
		
		employee d2=new employee();
		d2.accept();
				
		boxx<employee> b3=new boxx<>();
		b3.set(d2);
//		printDisplayableBox(b3);
		
		printBox(b1);
		printBox(b2);
		printBox(b3);
		
	}

}
