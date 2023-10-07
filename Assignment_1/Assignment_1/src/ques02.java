import java.util.Scanner;

public class ques02 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1 = ");
		
		
		if (sc.hasNextDouble()!=sc.hasNextInt()) 
		{ 			
			double num1=sc.nextDouble();
			System.out.println("Enter the num2 = ");
			if (sc.hasNextDouble()!=sc.hasNextInt()) 
			{
			double num2=sc.nextDouble();
			
			double avg=(num1+num2)/2;
			System.out.println("avg of double values = "+avg);
			}
			else
				System.out.println("entered value for num2 is not double..");
			
        } 
		else
			System.out.println("entered value for num1 is not double..");
	
	}
}
