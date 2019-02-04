package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProdutctFunction;
import services.ProductService;

public class ProgramFunctionInterface {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProdutctFunction> list = new ArrayList<>();
		
		list.add(new ProdutctFunction("Tv", 900.00));
		list.add(new ProdutctFunction("Computador", 1200.00));
		list.add(new ProdutctFunction("Cadeira", 400.00));
		list.add(new ProdutctFunction("Forno", 300.00));
		list.add(new ProdutctFunction("Condicionador de Ar", 1900.00));
		list.add(new ProdutctFunction("NoteBook", 1500.00));
		list.add(new ProdutctFunction("Tablet", 1300.00));
		
		ProductService prodServ = new ProductService();
		
		double sum = prodServ.filteredSum(list, product -> product.getPrice() < 100.0);
		// double sum = prodServ.filteredSum(list, product -> product.getName().charAt(0) == 'T');
			System.out.println("Sum = " + String.format("%.2f", sum));
		}
	}
