package com.sunbeam;

import java.util.Scanner;

interface Arithmetic
{
	double calc(double num1, double num2);
}

public class Question_03
{
	static void calculate(double num1, double num2, Arithmetic op) 
	   {
		double result = op.calc(num1, num2);
		System.out.println("Result: "+result);
		}

	public static void main(String[] args) {
		int choice;
		double x,y;
		System.out.println("enter the first number");
		x=new Scanner(System.in).nextDouble();
		System.out.println("enter the second number");
		y=new Scanner(System.in).nextDouble();
		
		do
		{
			System.out.println("Enter the choice = ");
			System.out.println("0.exit");
			System.out.println("1.Addition ");
			System.out.println("2.substraction ");
			System.out.println("3.multiplication ");
			System.out.println("4.division ");
			choice=new Scanner(System.in).nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Addition = ");
				calculate(x,y,(a,b)->a+b);
				break;
				
			case 2:
				System.out.println("substraction = ");
				calculate(x,y,(a,b)->a-b);
				break;
				
			case 3:
				System.out.println("multiplication = ");
				calculate(x,y,(a,b)->a*b);
				break;
				
			case 4:
				System.out.println("substraction = ");
				calculate(x,y,(a,b)->a/b);
				break;
			
			default:
				System.out.println("wrong choice.....");
			}
			
		}while(choice!=0);

	}

}
