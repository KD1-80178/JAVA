package Assignment_2_question_2;

public class Employee {
	String firstName;
	String lastName;
	double salary;
	
	public Employee() {
		this.firstName = "Nivedita";
		this.lastName = "Patil";
		this.salary = 15000.0;		
	}
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	void display()
	{
		System.out.println("Employee Details-------------------");
		if(salary>0)
		{
		System.out.println("Employee details = "+this.firstName+","+this.lastName+","+this.salary);
		System.out.println("Employees annual salary before raise = "+this.salary*12);
		}
		else
		System.out.println("Employee details = "+firstName+","+lastName+","+"NA");
	}
	void raiseInSalary()
	{
		if(salary>0)
		{
		this.salary+=salary*0.1;
		System.out.println("After the raise in salary----------");
		System.out.println("Employees annual salary = "+this.salary*12);
		}
		else
		System.out.println("Employee details = "+firstName+","+lastName+","+"NA");	
	}
	

}
