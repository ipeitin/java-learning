package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Company {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Enter employee's name and salary and the tax :\nNAME: ");
		employee.name = sc.nextLine();
		System.out.print("GROSSSALARY: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("TAX: ");
		employee.tax = sc.nextDouble();
		System.out.println("REAL SALARY: " + employee.netSalary());
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("NEW GROSSSALARY: " + employee.grossSalary);
		
		
		sc.close();
	}

}
