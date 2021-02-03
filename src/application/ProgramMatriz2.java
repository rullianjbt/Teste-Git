package application;

import java.util.Scanner;

public class ProgramMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de linhas da matriz:");
		int n = scan.nextInt();

		System.out.println("Digite a quantidade de colunas da matriz:");
		int m = scan.nextInt();

		int[][] mat = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = scan.nextInt();
			}
		}

		System.out.println("Digite o número:");
		int num = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (mat[i][j] == num) {
					System.out.println("POSITION " + i + ", " + j);
					if (j > 0) {
						System.out.println("LEFT: " + mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("RIGHT: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					}
					if (i < mat.length - 1) {
						System.out.println("DOWN: " + mat[i + 1][j]);
					}
				}

			}
		}

		scan.close();

	}

}
