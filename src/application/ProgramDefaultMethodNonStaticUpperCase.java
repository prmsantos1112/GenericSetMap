package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.ProdutctFuntionInterfaceNonStaticUpperCase;

public class ProgramDefaultMethodNonStaticUpperCase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<ProdutctFuntionInterfaceNonStaticUpperCase> list = new ArrayList<>();
		
		list.add(new ProdutctFuntionInterfaceNonStaticUpperCase("Tv", 900.0));
		list.add(new ProdutctFuntionInterfaceNonStaticUpperCase("Computador", 1200.0));
		list.add(new ProdutctFuntionInterfaceNonStaticUpperCase("Cadeira", 400.0));
		list.add(new ProdutctFuntionInterfaceNonStaticUpperCase("Forno", 300.0));
		list.add(new ProdutctFuntionInterfaceNonStaticUpperCase("Condicionador de Ar", 1900.0));
		list.add(new ProdutctFuntionInterfaceNonStaticUpperCase("NoteBook", 1500.0));
		list.add(new ProdutctFuntionInterfaceNonStaticUpperCase("Tablet", 1300.0));
		
		List<String> names = list.stream().map(ProdutctFuntionInterfaceNonStaticUpperCase::nonStaticUpperCaseName).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}
