package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of points to point");
	int numPoints=sc.nextInt();
	
	Point2D[] points = new Point2D[numPoints];
	for(int i=0;i<numPoints;i++)
	{
		System.out.println("enter the x and y co ordinates");
		int x=sc.nextInt();
		int y=sc.nextInt();
		points[i]=new Point2D(x,y);
	}
	}

}
