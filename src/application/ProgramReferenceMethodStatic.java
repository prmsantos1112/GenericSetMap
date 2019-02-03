package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProdutctReferenceMethodStatic;

public class ProgramReferenceMethodStatic {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProdutctReferenceMethodStatic> list = new ArrayList<>();
		
		list.add(new ProdutctReferenceMethodStatic("Tv", 900.00)); 
		list.add(new ProdutctReferenceMethodStatic("Mouse", 50.00)); 
		list.add(new ProdutctReferenceMethodStatic("Tablet", 350.50)); 
		list.add(new ProdutctReferenceMethodStatic("HD Case", 80.90));
		list.add(new ProdutctReferenceMethodStatic("Computador", 1200.00));
		list.add(new ProdutctReferenceMethodStatic("Cadeira", 400.00));
		list.add(new ProdutctReferenceMethodStatic("Forno", 300.00));
		list.add(new ProdutctReferenceMethodStatic("Condicionador de Ar", 1900.00));

		list.removeIf(ProdutctReferenceMethodStatic :: staticProductPredicate);
		
		for (ProdutctReferenceMethodStatic product : list) {
			System.out.println(product);
		}
	}

}
