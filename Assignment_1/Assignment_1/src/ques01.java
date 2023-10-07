import java.util.Scanner;

public class ques01 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number=  ");
		num=sc.nextInt();
		
		System.out.println("Number" +num+"equivalent to binary = "+Integer.toBinaryString(num));
		System.out.println("Number" +num+"equivalent to octal = "+Integer.toOctalString(num));
		System.out.println("Number" +num+"equivalent to hexadecimal = "+Integer.toHexString(num));

	}

}
