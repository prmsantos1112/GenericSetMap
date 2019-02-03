package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.ProdutctFuntionInterfaceStaticUpperCase;

public class ProgramDefaultMethodStaticUpperCase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProdutctFuntionInterfaceStaticUpperCase> list = new ArrayList<>();
		
		list.add(new ProdutctFuntionInterfaceStaticUpperCase("Tv", 900.0));
		list.add(new ProdutctFuntionInterfaceStaticUpperCase("Computador", 1200.0));
		list.add(new ProdutctFuntionInterfaceStaticUpperCase("Cadeira", 400.0));
		list.add(new ProdutctFuntionInterfaceStaticUpperCase("Forno", 300.0));
		list.add(new ProdutctFuntionInterfaceStaticUpperCase("Condicionador de Ar", 1900.0));
		list.add(new ProdutctFuntionInterfaceStaticUpperCase("NoteBook", 1500.0));
		list.add(new ProdutctFuntionInterfaceStaticUpperCase("Tablet", 1300.0));
		
		List<String> names = list.stream().map(ProdutctFuntionInterfaceStaticUpperCase::staticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
