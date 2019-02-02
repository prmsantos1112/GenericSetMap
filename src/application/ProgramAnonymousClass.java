package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.ProdutctDefaultMethod;

public class ProgramAnonymousClass {

	public static void main(String[] args) {
		
		List<ProdutctDefaultMethod> list = new ArrayList<>();
		
		list.add(new ProdutctDefaultMethod("Tv", 900.0));
		list.add(new ProdutctDefaultMethod("Computador", 1200.0));
		list.add(new ProdutctDefaultMethod("Cadeira", 400.0));
		list.add(new ProdutctDefaultMethod("Forno", 300.0));
		list.add(new ProdutctDefaultMethod("Condicionador de Ar", 1900.0));
		list.add(new ProdutctDefaultMethod("NoteBook", 1500.0));
		list.add(new ProdutctDefaultMethod("Tablet", 1300.0));
		
		Comparator<ProdutctDefaultMethod> comparator = new Comparator<ProdutctDefaultMethod>() {
			@Override
			public int compare(ProdutctDefaultMethod product_01, ProdutctDefaultMethod product_02) {
				return product_01.getName().toUpperCase().compareTo(product_02.getName().toUpperCase());
			}			
		};
		
		list.sort(comparator);
		
		for (ProdutctDefaultMethod produto : list) {
			System.out.println(produto);
		}
	}
}
