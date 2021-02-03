package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramListas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		System.out.println(list.size());
		//remove o elemento da posicao
		//list.remove(1);

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------");
		System.out.println("INDEX OF BOB: " + list.indexOf("Marco"));
		List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
