package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.ProdutctFuntionInterface;

public class ProgramDefaultMethodLambdaInLineUpperCase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProdutctFuntionInterface> list = new ArrayList<>();
		
		list.add(new ProdutctFuntionInterface("Tv", 900.0));
		list.add(new ProdutctFuntionInterface("Computador", 1200.0));
		list.add(new ProdutctFuntionInterface("Cadeira", 400.0));
		list.add(new ProdutctFuntionInterface("Forno", 300.0));
		list.add(new ProdutctFuntionInterface("Condicionador de Ar", 1900.0));
		list.add(new ProdutctFuntionInterface("NoteBook", 1500.0));
		list.add(new ProdutctFuntionInterface("Tablet", 1300.0));
				
		List<String> names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
