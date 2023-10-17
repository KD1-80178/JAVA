package com.circle;

import com.circle.Circle;
import com.circle.CircleDiaNonNegative;
import com.circle.Point2D;


public class CircleTest {

	public static void main(String[] args) {
		{
		 	Circle c=new Circle();
		 	try {
				c.acceptData();
			} catch (CircleDiaNonNegative e) 
		 	{
				e.printStackTrace();
			}
		 	c.displayData();
	  
		}


	}

}
