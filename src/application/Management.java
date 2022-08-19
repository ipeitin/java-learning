package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Management {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product product;
		
		System.out.println("Enter product data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		product.setPrice(1200);
		System.out.println("Updated price: " + product.getPrice());
		
		System.out.println("\nProduct data: " + product); 
		
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addStock(quantity);

		System.out.println("\nUpdated product data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeStock(quantity);
		
		System.out.println("\nUpdated product data: " + product);
		
		sc.close();
		
	}
}
