package com.sunbeam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//No need to write equals() and hashCode() in Student class,because our key is of Integer type which has its own equals() and hashCode() methos.

public class Question_06 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Student> map=new LinkedHashMap<>();
		
		int choice;
		do {
			System.out.println("Enter the choice = ");
			System.out.println("1. Insert Student into map");
			System.out.println("2. find the Student based on rollno in map");
			System.out.println("3. Display all student entries = ");
			choice=new Scanner(System.in).nextInt();
			
			switch(choice)
			{
			case 1:
				Student s=new Student();
				s.accept();
				map.put(s.getRoll(),s);
				//System.out.println(s);
				break;
				
			case 2:
				System.out.println("enter the Student rollno = ");
				Integer rollNo = new Scanner(System.in).nextInt();
				s = map.get(rollNo);
				if(s ==null)
					
					System.out.println("Student of roll no"+ rollNo+" is not found....");
				else
				{
					System.out.println("Student of roll no"+ rollNo+" is found....");
					System.out.println("Student of roll no " + rollNo + " = "+s);
				}
				break;
				
			case 3:
				Set<Entry<Integer,Student>> entries = map.entrySet();
		        for(Entry<Integer,Student> entry : entries) {
		        	System.out.println(entry.getKey() + " -- " + entry.getValue());
		        }
			        
				break;
			}
			
		}while(choice!=0);
		
	}


	}


