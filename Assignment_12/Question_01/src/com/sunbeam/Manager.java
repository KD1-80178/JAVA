package com.sunbeam;

public class Manager implements Employee{
	private double basicSalary;
	private double dearAllowance;
	
	public double getSal() {
		return this.basicSalary+this.dearAllowance;
	}
	 @Override
	public double calIncentives()
	{
		return this.basicSalary*0.2;
	}
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(double basicSalary, double dearAllowance) {
		super();
		this.basicSalary = basicSalary;
		this.dearAllowance = dearAllowance;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getDearAllowance() {
		return dearAllowance;
	}
	public void setDearAllowance(double dearAllowance) {
		this.dearAllowance = dearAllowance;
	}
	@Override
	public String toString() {
		return "Manager [basicSalary=" + basicSalary + ", dearAllowance=" + dearAllowance + "]";
	}
	
	

}
