package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Question_04 {

	public static void main(String[] args) {
		
		try(FileReader frd=new FileReader("/home/nivedita/Desktop/SUNBEAM K-CDAC/All Uploading Data/JAVA/Assignment_13/Question_03/line.txt"))
		{
			try(BufferedReader brd=new BufferedReader(frd))
			{
				String line;
				while((line = brd.readLine())!=null)
				{
				System.out.println(line);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
