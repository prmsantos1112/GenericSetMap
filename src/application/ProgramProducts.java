package application;

import java.util.HashSet;
import java.util.Set;

import entities.Products;

public class ProgramProducts {

	public static void main(String[] args) {
		
		Set<Products> set = new HashSet<>();
		
		set.add(new Products("TV", 900.0));
		set.add(new Products("Notebook", 1200.0));
		set.add(new Products("Computador", 1900.00));
		set.add(new Products("Cadeira", 200.0));
		set.add(new Products("Forno", 500.0));
		
		Products produtos = new Products("Notebook", 1200.0);
		
		System.out.println(set.contains(produtos));
			
		}
	}


