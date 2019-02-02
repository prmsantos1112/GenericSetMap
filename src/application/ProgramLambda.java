package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.ProdutctDefaultMethod;

public class ProgramLambda {

	public static void main(String[] args) {
		
		List<ProdutctDefaultMethod> list = new ArrayList<>();
		
		list.add(new ProdutctDefaultMethod("Tv", 900.0));
		list.add(new ProdutctDefaultMethod("Computador", 1200.0));
		list.add(new ProdutctDefaultMethod("Cadeira", 400.0));
		list.add(new ProdutctDefaultMethod("Forno", 300.0));
		list.add(new ProdutctDefaultMethod("Condicionador de Ar", 1900.0));
		list.add(new ProdutctDefaultMethod("NoteBook", 1500.0));
		list.add(new ProdutctDefaultMethod("Tablet", 1300.0));
		
		// arrow function; Função Flecha.
		// Comparator<ProdutctDefaultMethod> comparator = (product_01, product_02) -> {
			// return product_01.getName().toUpperCase().compareTo(product_02.getName().toUpperCase());
		
		// Comparator<ProdutctDefaultMethod> comparator = (product_01, product_02) -> product_01.getName().toUpperCase().compareTo(product_02.getName().toUpperCase());	
		
		// Comparator definido com sintaxe de Expressão Lambda;
		
		list.sort((product_01, product_02) -> product_01.getName().toUpperCase().compareTo(product_02.getName().toUpperCase()));
		
		for (ProdutctDefaultMethod produto : list) {
			System.out.println(produto);
		}
	}
}
