package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite a quantidade de funcionários:");
		int n = scan.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("EMP ##" + (i + 1));
			System.out.println("Digite o ID");
			Integer id = scan.nextInt();
			System.out.println("Digite o nome:");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("Digite o salário:");
			Double salary = scan.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}

		System.out.println("Digite o ID do funcionário cujo salario sera alterado");
		int id = scan.nextInt();

		int buscaID = position(list, id);

		if (buscaID == -1) {
			System.out.println("ID NAO EXISTE, ABORTANDO...");
		} else {
			System.out.println("Digite a porcentagem de aumento");
			double porcentagem = scan.nextDouble();
			list.get(buscaID).increaseSalary(porcentagem);
		}

		System.out.println("List of employees: ");
		for (Employee x : list) {

			System.out.println(x.getId() + ", " + x.getName() + ", " + String.format("%.2f", x.getSalary()));

		}

		scan.close();

	}

	public static int position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}

}
