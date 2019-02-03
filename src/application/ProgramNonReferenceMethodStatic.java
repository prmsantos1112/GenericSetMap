package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProdutctNonReferenceMethodStatic;

public class ProgramNonReferenceMethodStatic {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProdutctNonReferenceMethodStatic> list = new ArrayList<>();
		
		list.add(new ProdutctNonReferenceMethodStatic("Tv", 900.00)); 
		list.add(new ProdutctNonReferenceMethodStatic("Mouse", 50.00)); 
		list.add(new ProdutctNonReferenceMethodStatic("Tablet", 350.50)); 
		list.add(new ProdutctNonReferenceMethodStatic("HD Case", 80.90));
		list.add(new ProdutctNonReferenceMethodStatic("Computador", 1200.00));
		list.add(new ProdutctNonReferenceMethodStatic("Cadeira", 400.00));
		list.add(new ProdutctNonReferenceMethodStatic("Forno", 300.00));
		list.add(new ProdutctNonReferenceMethodStatic("Condicionador de Ar", 1900.00));

		list.removeIf(ProdutctNonReferenceMethodStatic :: nonStaticProductPredicate);
		
		for (ProdutctNonReferenceMethodStatic product : list) {
			System.out.println(product);
		}
	}

}
