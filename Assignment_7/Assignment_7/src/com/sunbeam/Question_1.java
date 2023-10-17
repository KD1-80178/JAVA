package com.sunbeam;

public class Question_1 {

	public static void main(String[] args) {
	 String []arr= {"Nivedita","patil"};
	 String arr1= new String();
	 
	 for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr1 += arr[i];
				}
			}
		}
		System.out.println("Duplicate values are"+arr1);
		}
	 
	}


