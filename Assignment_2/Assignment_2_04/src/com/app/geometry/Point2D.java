package com.app.geometry;

public class Point2D {

		int x_axis;
		int y_axis;
		
		public Point2D() {
			
		}

		public Point2D(int x_axis, int y_axis) {
			
			this.x_axis = x_axis;
			this.y_axis = y_axis;
		}

		public int getX_axis() {
			return x_axis;
		}

		public int getY_axis() {
			return y_axis;
		}
		
		public String getDetails()
		{
			return "x_axis= "+this.x_axis+", y_axis= "+y_axis;
		}
		
		public boolean isEqual(Point2D point)
		{
			return this.x_axis==point.x_axis && this.y_axis==point.y_axis;
		}
		
		public double calculateDistance(Point2D point)
		{
			double distance=Math.sqrt(Math.pow((this.x_axis-point.x_axis), 2)+Math.pow((this.y_axis-point.y_axis), 2));
			return distance;
		}
		
	}

		
	


