package com.sunbeam;

import java.util.stream.IntStream;

public class Question_08 {

	public static void main(String[] args) {
	IntStream strm=IntStream.range(1, 10);
	int total=strm.sum();
	System.out.println("Total sum = "+total);
	
	IntStream strm1=IntStream.range(1, 10);
	System.out.println("Summery statistics of stream1 = "+strm1.summaryStatistics());

	}

}
