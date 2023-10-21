package com.sunbeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_03 {

	public static void main(String[] args) {
		try(FileWriter fwr= new FileWriter("line.txt")){
		
		try(BufferedWriter bwr=new  BufferedWriter(fwr)) {
			System.out.println("enter the lines ");
		 
		 for(int i=1; i<=4; i++) {
			 String line = new Scanner(System.in).nextLine();
			 bwr.write(line);
			 bwr.newLine();
			 }
		}
		
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
