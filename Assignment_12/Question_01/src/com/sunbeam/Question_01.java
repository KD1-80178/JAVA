package com.sunbeam;

interface Employee
{
	double getSal();
	default double calIncentives()
	{
		return 0.0;
	}
	
	static double calcTotalIncome(Employee arr[])
	{
		double totalSalary=0;
		for (Employee employee : arr) {
			totalSalary+=employee.getSal()+employee.calIncentives();
		}
		return totalSalary;
	}
}

public class Question_01 {

	public static void main(String[] args) {
		
		Employee[] arr=new Employee[3];
		arr[0]=new Manager(5000, 500);
		arr[1]=new Labor(100,465);
		arr[2]=new Clerk(5000);
		
		double totalSalary=Employee.calcTotalIncome(arr);
		System.out.println("Total salary = " +totalSalary);
		

	}

}
