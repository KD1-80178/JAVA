package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		LinkedList<Employee> l1=new LinkedList<>();
		int choice;
		
		do {
			System.out.println("enter the choice : ");
			System.out.println("0.Exit ");
			System.out.println("1.Add the Employee in linked list");
		    System.out.println("2.Delete the Employee in linked list");
			System.out.println("3.Find the Employee in linked list ");
			System.out.println("4.Sort the Employee in linked list ");
			System.out.println("5.Empid to be modified in linked list ");
			choice=new Scanner(System.in).nextInt();
			
			switch(choice)
			{
			case 1:
				Employee e=new Employee();
				e.accept();
				l1.add(e);
				System.out.println("Employee is added in linked list.....");
				System.out.println("\nList = "+l1);
				break;
				
			case 2:
				System.out.println("enter the book empid =");
				int empid=new Scanner(System.in).nextInt();
				Employee e2=new Employee();
				e2.setEmpid(empid);
				int index=l1.indexOf(e2);
				
				if(index >= 0 && index <l1.size())
				{
				l1.remove(index);
				System.out.println("Employee of given empid "+empid+" is deleted");
				}
				else
					System.out.println("Employee of given empid "+empid+" is not found");
				System.out.println("list of Employee is deleted .....");
				
				System.out.println();
				System.out.println(l1);
				break;
				
			case 3:
				System.out.println("enter the Empid =");
				int empid1=new Scanner(System.in).nextInt();
				Employee key=new Employee();
				key.setEmpid(empid1);
				int index2=l1.indexOf(key);
				if(index2==-1)
					System.out.println("Employee with empid "+empid1+" is not found");
				else
					System.out.println("Employee with empid "+empid1+" is found");
				
				System.out.println();
				System.out.println(l1);
				break;
				
			case 4:
				class empEmpidComparator implements Comparator<Employee>
				{
					@Override
					public int compare(Employee e1, Employee e2) 
				{
					int diff=e1.getEmpid()-e2.getEmpid();
						return diff;
				}
				}
				empEmpidComparator comparator=new empEmpidComparator();
				l1.sort(comparator);
				
				System.out.println("After the sorting list = ");
				System.out.println(l1);
				
				break;
				
			case 5:
				System.out.println("Enter emp id to be modified: ");
				int id = new Scanner(System.in).nextInt();
				Employee key1= new Employee();
				key1.setEmpid(id);
				int index1 = l1.indexOf(key1);
				
				if(index1 == -1)
				System.out.println("Employee not found.");
				else 
				{
				Employee oldEmp = l1.get(index1);
				System.out.println("Employee Found: " + oldEmp);
				System.out.println("Enter new information for the Employee");
				Employee newEmp = new Employee();
				newEmp.accept();
				l1.set(index1, newEmp);
				
				System.out.println();
				System.out.println(l1);
				}
				break;
				
				default:
					System.out.println("Invalid choice .....");
				
			}
		}while(choice!=0);

	}

}
