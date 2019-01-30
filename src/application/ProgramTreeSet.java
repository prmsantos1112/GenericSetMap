package application;

import java.util.Set;
import java.util.TreeSet;

public class ProgramTreeSet {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();   // Implementação mais rápida; Não mantém ordem.
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Mesa");
		set.add("Computador");
		set.add("Cadeira");
		set.add("Geladeira");
		set.add("Copo");
		set.add("MicrOndas");
		set.add("Forno");
		set.add("Lavadora");
		
		
		System.out.println(set.contains("Notebook"));
		System.out.println();
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
