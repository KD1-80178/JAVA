package car_pooling;

import java.util.Scanner;

class Test
{
	int milesperday;
	float costPerGallon;
	int avgMilesperGallon;
	int parkingFeesPerDay;
	int tollsPerday;
	float drivingCostPerDay=0;
	
	Scanner sc=new Scanner(System.in);
	
	public Test() {
		
	}
	public Test(int milesperday, float costPerGallon, int parkingFeesPerDay, int tollsPerday , int avgMilesperGallon) {
		
		this.milesperday = milesperday;
		this.costPerGallon = costPerGallon;
		this.avgMilesperGallon = avgMilesperGallon;
		this.parkingFeesPerDay = parkingFeesPerDay;
		this.tollsPerday = tollsPerday;
	}
	void acceptData()
	{
		System.out.println("enter the data---------------");
		System.out.println("enter the miles per day = ");
		milesperday=sc.nextInt();
		System.out.println("enter the avg miles per gallon = ");
		avgMilesperGallon=sc.nextInt();
		System.out.println("enter the cost per gallon = ");
		costPerGallon=sc.nextInt();
		System.out.println("enter the parking fees per day = ");
		parkingFeesPerDay=sc.nextInt();
		System.out.println("enter the toll per day = ");
		tollsPerday=sc.nextInt();
	}
	void display()
	{
		System.out.println("Miles per day = "+milesperday);
		System.out.println("Avg. Miles per gallon = "+avgMilesperGallon);
		System.out.println("cost per gallon = "+costPerGallon);
		System.out.println("parking fees per day = "+parkingFeesPerDay);
		System.out.println("tolls per day = "+tollsPerday);
	}
	void drivingCost()
	{
		
		drivingCostPerDay=(this.milesperday/this.avgMilesperGallon)*this.costPerGallon+this.tollsPerday+this.parkingFeesPerDay;
		System.out.println("Driving cost per day = "+drivingCostPerDay);
	}
	 
}
public class Carpooling {

	public static void main(String[] args) {
		Test t1=new Test(50,2.5f,20,10,5);
		t1.display();
		t1.drivingCost();
		
		Test t2=new Test();
		t2.acceptData();
		t2.display();
		t2.drivingCost();		

	}

}
