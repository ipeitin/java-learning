package entities;

public class Employee {
	
	public String name;
	public double grossSalary, tax;

	public double netSalary() {
		tax /= 100;
		return grossSalary - (grossSalary * tax);
		
	}
	
	public void increaseSalary(double percentage) {
		percentage /= 100;
		grossSalary = grossSalary * percentage + grossSalary;
		
	}
	
	/*
	public String toString() {
		return "Salary"
				+ netSalary();
	}
	*/
}
