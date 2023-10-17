package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

class main
{
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
			}
			}
		}
	}
}


public class Question_2 {
	
	public static void main(String[] args) {
		Double arr[]= {1.2,2.3,4.5,89.6,54.1};
		
		class doubleComparator implements Comparator<Double>{

			@Override
			public int compare(Double d1,Double d2) {
				
				return Double.compare(d1, d2);
			}
		}
		
		doubleComparator cmp=new doubleComparator();
		Arrays.sort(arr, cmp);
		
		for(Double d:arr)
			System.out.println(d);
		
		
		

	}

}
