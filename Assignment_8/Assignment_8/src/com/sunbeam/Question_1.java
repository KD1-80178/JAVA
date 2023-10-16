package com.sunbeam;

import java.util.Scanner;

abstract class Employee
{
    
    private int id;
    float sal;
    public Employee()
    {
    	this.id=10;
    	this.sal=50000;
    }
    public Employee(int id,float sal)
    {
        this.id=id;
        this.sal=sal;
    }
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
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
 abstract public float getTotalSalary();
 
}
class Manager extends Employee
{
	private float bonus;
	public Manager()
	{
		super();
		this.bonus=500;
	}
	public Manager(int id, float sal, float bonus) {
		super.accept();
		this.bonus = bonus;
	}
	
	void accept()
    {
		super.accept();
		System.out.println("enter the Manager details ===========");
        System.out.println("enter the bonus =");
        bonus=new Scanner(System.in).nextFloat();
    }
    
    void disp()
    {
    	super.disp();
    	System.out.println("displaying the Manager details ===========");
    	System.out.println("bonus = "+bonus);
    }
	
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	@Override
	public float getTotalSalary() {
		return (this.bonus+super.sal);
		
	}
	
	
}
class Salesman extends Employee
{
	private float comm;
	
	public Salesman() {
		super();
		
	}
	
	public Salesman(int id, float sal, float comm) {
		super(id, sal);
		this.comm = comm;
	}


	void accept()
    {
		super.accept();
		System.out.println("enter the Salesman details ===========");
        System.out.println("enter the comm =");
        comm=new Scanner(System.in).nextFloat();
    }
    
    void disp()
    {
    	super.disp();
    	System.out.println("displaying the Salesman details ===========");
    	System.out.println("bonus = "+comm);
    }

	public float getComm() {
		return comm;
	}


	public void setComm(float comm) {
		this.comm = comm;
	}


	@Override
	public float getTotalSalary() {
		//System.out.println("Total salary of salesman = "+());
		return (this.comm+super.sal);
	}
	
}

class Box<T extends Employee>
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
	
	public float calculateSalary()
	{
		return obj.getTotalSalary();
	}
}
public class Question_1 {

	public static void main(String[] args) {
		
		System.out.println("Salesman details--------------");
		Salesman s=new Salesman();
		s.accept();
		s.disp();
		
		Box<Salesman> b1=new Box<Salesman>();
		b1.set(s);
		System.out.println("Total salary = "+b1.calculateSalary());
		
		System.out.println("manager details--------------");
		Manager m=new Manager();
		m.accept();
		m.disp();
				
		Box<Manager> b2=new Box<Manager>();
		b2.set(m);
		System.out.println("Total salary = "+b2.calculateSalary());
		
		System.out.println("Employee details either manager or Salesman--------------");
		Box<Manager> b3=new Box<Manager>();
		b3.set(m);
		System.out.println("Total salary = "+b3.calculateSalary());
	}
}
