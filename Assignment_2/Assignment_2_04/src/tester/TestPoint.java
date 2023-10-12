package tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		Point2D point1=new Point2D(10,15);
		Point2D point2=new Point2D(8,19);
		
		Point2D point3=new Point2D(10,15);

		System.out.println("Co-ordinate details--------------");
		System.out.println(point1.getDetails());
		System.out.println(point2.getDetails());
		System.out.println();
		
		System.out.println("point1 Is equal to point2 = "+point1.isEqual(point2));
		System.out.println("point1 Is equal to point3 = "+point1.isEqual(point3));
		System.out.println();
		
		System.out.println("Distance between point1 and point2 = "+point1.calculateDistance(point2));
		System.out.println("Distance between point1 and point3 = "+point1.calculateDistance(point3));
	}

}
