package com.sunbeam;

public class Question_1 {
	public static <T extends Number> T findMin(T[] arr)
	{
		T min=arr[0] ;
		for (T t:arr)
		{
			if(t.doubleValue() < min.doubleValue())
				min=t;
		}
		return min;
	}

	public static void main(String[] args) {
		Integer[] arr= {11,33,22,54};
		Integer i=findMin(arr);
		System.out.println("min element of array = "+i);
		
		Float[] arr1= {11.2f,3.3f,2.2f,5.4f};
		Float f=findMin(arr1);
		System.out.println("min element of array = "+f);
		
		Long[] arr2= {(long) 150,(long) 4587,(long)510};
		Long l=findMin(arr2);
		System.out.println("min element of array = "+l);

	}
}


