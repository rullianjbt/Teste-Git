package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n = scan.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite a altura");
			vect[i] = scan.nextDouble();
		}

		double sum = 0;

		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}

		double avg = sum / n;

		System.out.printf("AVERAGE HEIGHT: %.2f%n", +avg);

		scan.close();
	}

}
