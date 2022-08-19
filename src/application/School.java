package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class School {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Enter the NAME, GRADE 1, GRADE 2, GRADE 3 \nNAME: ");
		student.name = sc.nextLine();
		System.out.print("\nGRADE 1: ");
		student.grade1 = sc.nextDouble();
		System.out.print("GRADE 2: ");
		student.grade2 = sc.nextDouble();
		System.out.print("GRADE 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.printf("\nGRADE FINAL: %.2f", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingPoints());
		}
			else {
			System.out.println("\n\nPASS");
			
			}
		
		sc.close();
	}
}
