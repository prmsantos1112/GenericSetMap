package application;

import java.util.ArrayList;
import java.util.List;

import entities.MyComparator;
import entities.ProdutctDefaultMethod;

public class ProgramDefaultMethod {

	public static void main(String[] args) {
		
		List<ProdutctDefaultMethod> list = new ArrayList<>();
		
		list.add(new ProdutctDefaultMethod("Tv", 900.0));
		list.add(new ProdutctDefaultMethod("Computador", 1200.0));
		list.add(new ProdutctDefaultMethod("Cadeira", 400.0));
		list.add(new ProdutctDefaultMethod("Forno", 300.0));
		list.add(new ProdutctDefaultMethod("Condicionador de Ar", 1900.0));
		list.add(new ProdutctDefaultMethod("NoteBook", 1500.0));
		list.add(new ProdutctDefaultMethod("Tablet", 1300.0));
		
		list.sort(new MyComparator());
		
		for (ProdutctDefaultMethod produto : list) {
			System.out.println(produto);
		}
	}
}
