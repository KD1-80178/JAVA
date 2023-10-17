package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

public class Question_3 {

	public static void main(String[] args) {
		Student[] arr=new Student[5];
		arr[0]=new Student(2,"Nivedita","sangli",50);
		arr[1]=new Student(5,"pratik","udgaon",75);
		arr[2]=new Student(3,"prabha","sangli",51);
		arr[3]=new Student(1,"prajwal","miraj",24);
		arr[4]=new Student(2,"Nivedita","ugar",25);
		
		System.out.println("before sort : ");
		for(Student s:arr)
			System.out.println(s);
		
		class StudCityMarkName implements Comparator<Student>
		{
			@Override
			public int compare(Student s1, Student s2) {
				int diff= - s1.getCity().compareTo(s2.getCity());
				if(diff==0)
					diff= - Double.compare(s1.getMarks(), s2.getMarks());
				if(diff==0)
					diff=s1.getName().compareTo(s2.getName());
				return diff;
			}
			
		}
		StudCityMarkName comparator=new StudCityMarkName();
		Arrays.sort(arr,comparator);
		System.out.println("After sort : ");
		for(Student s:arr)
		{
			System.out.println(s);
		}
		
		
	}
}
