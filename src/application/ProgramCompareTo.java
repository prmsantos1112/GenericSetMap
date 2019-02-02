package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.ProdutctCompareTo;

public class ProgramCompareTo {

	public static void main(String[] args) {
		
		List<ProdutctCompareTo> list = new ArrayList<>();
		
		list.add(new ProdutctCompareTo("Tv", 900.0));
		list.add(new ProdutctCompareTo("Computador", 1200.0));
		list.add(new ProdutctCompareTo("Cadeira", 400.0));
		list.add(new ProdutctCompareTo("Forno", 300.0));
		list.add(new ProdutctCompareTo("Condicionador de Ar", 1900.0));
		list.add(new ProdutctCompareTo("NoteBook", 1500.0));
		list.add(new ProdutctCompareTo("Tablet", 1300.0));
		
		Collections.sort(list);
		
		for (ProdutctCompareTo produto : list) {
			System.out.println(produto);
		}
		

	}

}
