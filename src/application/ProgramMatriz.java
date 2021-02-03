package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("DIGITE A ORDEM DA MATRIZ: ");

		int n = scan.nextInt();
		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = scan.nextInt();
			}
		}

		System.out.println("MAIN DIAGONAL:");

		for (int i = 0; i < n; i++) {
			System.out.println(mat[i][i] + ", ");
		}

		System.out.println();

		int negativeNumbers = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					negativeNumbers ++;
				}
			}
		}
		
		System.out.println("Negative numbers: "+negativeNumbers);

		scan.close();
	}

}
