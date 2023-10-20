package sunbeam;

public class Clerk implements Employee
{
	private double salary;

	public Clerk() {
		super();
	}

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Clerk [salary=" + salary + "]";
	}

	@Override
	public double getSal() {
		return this.salary;
	}
	
	
	
}
