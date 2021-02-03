package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		Product[] vect = new Product[n];

		for (int i = 0; i < n; i++) {
			scan.nextLine();
			String name = scan.nextLine();
			double price = scan.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}

		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE: %.2f%n", avg);
		scan.close();

	}

}
