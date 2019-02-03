package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProdutctConsumerNonStatic;

public class ProgramUpDateComsumerNonStatic {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<ProdutctConsumerNonStatic> list = new ArrayList<>();

		list.add(new ProdutctConsumerNonStatic("Tv", 900.00));
		list.add(new ProdutctConsumerNonStatic("Computador", 1200.00));
		list.add(new ProdutctConsumerNonStatic("Cadeira", 400.00));
		list.add(new ProdutctConsumerNonStatic("Forno", 300.00));
		list.add(new ProdutctConsumerNonStatic("Condicionador de Ar", 1900.00));
		list.add(new ProdutctConsumerNonStatic("NoteBook", 1500.00));
		list.add(new ProdutctConsumerNonStatic("Tablet", 1300.50));
		
		list.forEach(ProdutctConsumerNonStatic::nonStaticPriceUpdateConsumer);
		
		list.forEach(System.out::println);
		
		// System.out.println(list);
	}

}
