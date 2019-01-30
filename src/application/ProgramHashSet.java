package application;

import java.util.HashSet;
import java.util.Set;

public class ProgramHashSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();   // Implementação mais rápida; Não mantém ordem.
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Mesa");
		set.add("Coputador");
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
