package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProdutctDefaultMethod;

public class ProgramExpressLambdaInLine {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProdutctDefaultMethod> list = new ArrayList<>();
		
		list.add(new ProdutctDefaultMethod("Tv", 900.00)); 
		list.add(new ProdutctDefaultMethod("Mouse", 50.00)); 
		list.add(new ProdutctDefaultMethod("Tablet", 350.50)); 
		list.add(new ProdutctDefaultMethod("HD Case", 80.90));
		list.add(new ProdutctDefaultMethod("Computador", 1200.00));
		list.add(new ProdutctDefaultMethod("Cadeira", 400.00));
		list.add(new ProdutctDefaultMethod("Forno", 300.00));
		list.add(new ProdutctDefaultMethod("Condicionador de Ar", 1900.00));
		
		double min = 100.00;		

		list.removeIf(product -> product.getPrice() >= min);
		
		for (ProdutctDefaultMethod product : list) {
			System.out.println(product);
		}
	}

}
