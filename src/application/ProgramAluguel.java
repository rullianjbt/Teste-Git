package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class ProgramAluguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("How many room will be rented? ");
		int n = scan.nextInt();

		
		Rent vect[] = new Rent[10];

		for (int i = 0; i < n; i++) {
			scan.nextLine();
			System.out.println("RENT #" + (i + 1));
			System.out.println("DIGITE O NOME:");
			String name = scan.nextLine();
			System.out.println("DIGITE O EMAIL:");
			String email = scan.nextLine();
			System.out.println("DIGITE O QUARTO:");
			int room = scan.nextInt();

			vect[room] = new Rent(name, email);

		}

		for (int i = 0; i < 10; i++) {
			if (vect[i]!=null) {
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}

	}

}
