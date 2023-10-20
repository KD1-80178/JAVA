package com.sunbeam;

import java.util.Scanner;

public class Question_05 {

		static <T> int countIf(T[] arr, T key, Check<T> c) 
		   {
			int count = 0;
			for(T ele: arr) {
			if(c.compare(ele, key))
			count++;
			}
			return count;
			}

		public static void main(String[] args) {
			Integer [] arr = {44, 77, 99, 22, 55, 66};
			Integer key = 50;

			int cnt = countIf(arr, key, (x,y)-> x > y);
			System.out.println("Count = " + cnt);
			
			Double [] arr1={44.4,77.7,99.9,22.2,55.5,66.6,55.5,55.5};
			System.out.println("Enter the key");
			Double key1=new Scanner(System.in).nextDouble();
			
			int count = countIf(arr1, key1, (a,b)-> a.equals(b));
			System.out.println("Count = " + count);
			
		}


	}


