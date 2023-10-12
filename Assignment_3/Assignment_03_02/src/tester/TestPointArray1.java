package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of points to plot :");
			Point2D[]  p = new Point2D[(sc.nextInt())];
			
			for (int i = 0;i<p.length;i++)
			{
				p[i] = new Point2D();
			}
			
			for (int i = 0;i<p.length;i++)
			{
				p[i].acceptCo_ordinates();
			}
			
			int choice;
			do 
			{	System.out.println("********************************");
				System.out.println("1. Display details of specific point ");
				System.out.println("2. Display details of all point ");
				System.out.println("3. Display distance between two points ");
				System.out.println("4. Exit ");
				System.out.print("Enter your choice : ");
				choice = sc.nextInt();	
				
				switch(choice)
				{
				case 1 : int c;  
					     System.out.print("Enter index to view details of specific points : ");
						 c = sc.nextInt();
						 p[c].displayCo_ordinates();
						 break;
						 
				case 2 : System.out.println("******All points******");
					 		for(int i=0;i<p.length;i++)
							{
								p[i].displayCo_ordinates();
							}
					 		break;
					 		
				case 3 : System.out.print("Enter two indexes to find distance between two points ");
				         int a = sc.nextInt();
				         int b = sc.nextInt();
				         if(a < p.length && b< p.length)
				         {
				         if(p[a].isEqual(p[b]))
				         {
				        	 System.out.println("Both the points are at same position");
				         }
				         else 
				         {
				        	 p[a].calculateDistance(p[b]);
				         }
				         }
				         else 
				         {
				        	 System.out.println("Invalid indexes");
				         }
				         break;
				}
			    }while(choice !=0);
			
			
			
			
		}
	}