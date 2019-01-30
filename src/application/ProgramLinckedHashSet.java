package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramLinckedHashSet {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();   // Implementação mais rápida; Não mantém ordem.
		
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
		
		set.remove("Tablet");
		set.removeIf(x -> x.charAt(0) == 'T');
		set.removeIf(x -> x.length() >= 5);
		
		
		System.out.println(set.contains("Notebook"));
		System.out.println();
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
