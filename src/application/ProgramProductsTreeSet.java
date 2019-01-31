package application;

import java.util.Set;
import java.util.TreeSet;

import entities.ProductsTreeSet;



public class ProgramProductsTreeSet {

	public static void main(String[] args) {
		
		Set<ProductsTreeSet> set = new TreeSet<>();
		
		set.add(new ProductsTreeSet("TV", 900.0));
		set.add(new ProductsTreeSet("Notebook", 1200.0));
		set.add(new ProductsTreeSet("Computador", 1900.0));
		set.add(new ProductsTreeSet("Cadeira", 200.0));
		set.add(new ProductsTreeSet("Mesa", 400.0));
		set.add(new ProductsTreeSet("Ventilador", 189.0));
		set.add(new ProductsTreeSet("Monitor", 100.0));
		set.add(new ProductsTreeSet("Teclado", 30.0));
		set.add(new ProductsTreeSet("Mouse", 50.0));
		
		for (ProductsTreeSet products : set)		
		System.out.println(products);
			
		}
	}


