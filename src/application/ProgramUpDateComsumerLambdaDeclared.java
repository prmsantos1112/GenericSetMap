package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.ProdutctDefaultMethod;

public class ProgramUpDateComsumerLambdaDeclared {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProdutctDefaultMethod> list = new ArrayList<>();

		list.add(new ProdutctDefaultMethod("Tv", 900.00));
		list.add(new ProdutctDefaultMethod("Computador", 1200.00));
		list.add(new ProdutctDefaultMethod("Cadeira", 400.00));
		list.add(new ProdutctDefaultMethod("Forno", 300.00));
		list.add(new ProdutctDefaultMethod("Condicionador de Ar", 1900.00));
		list.add(new ProdutctDefaultMethod("NoteBook", 1500.00));
		list.add(new ProdutctDefaultMethod("Tablet", 1300.50));
		
		//double factor = 10 / 100;
		// double factor = 1.1;
		
		Consumer<ProdutctDefaultMethod> consumer = product -> {			
			// product.setPrice(product.getPrice() * factor);
			
			product.setPrice(product.getPrice() * 10 / 100 + product.getPrice());
			
		};
		
		list.forEach(consumer);		
		list.forEach(System.out::println);
		
		// System.out.println(list);
	}
}
