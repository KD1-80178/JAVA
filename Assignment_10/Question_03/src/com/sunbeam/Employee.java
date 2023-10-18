package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	
	private int empid;
	private String name;
    private float sal;
    private String design;
    
    
    void accept()
    {
    	System.out.println("enter the employee details ===========");
        System.out.println("enter the empid =");
        empid=new Scanner(System.in).nextInt();
        System.out.println("enter the name =");
        name=new Scanner(System.in).nextLine();
        System.out.println("enter the salary =");
        sal=new Scanner(System.in).nextFloat();
        System.out.println("enter the Designation =");
        design=new Scanner(System.in).nextLine();
    }
    
    void disp()
    {
    	System.out.println("displaying the employee details ===========");
    	System.out.println("ID = "+empid);
    	System.out.println("Name = "+name);
    	System.out.println("Salary = "+sal);
    	System.out.println("Designation = "+design);
    }
    
    

	public Employee() {
		super();
		
	}

	public Employee(int empid, String name, float sal, String design) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
		this.design = design;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + ", design=" + design + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}
	
	
	
}
