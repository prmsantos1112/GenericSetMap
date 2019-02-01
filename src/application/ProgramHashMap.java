package application;

import java.util.HashMap;
import java.util.Map;

import entities.ProductsMap;

public class ProgramHashMap {

	public static void main(String[] args) {
		
		Map<ProductsMap, Double> stock = new HashMap<>();
		
		ProductsMap product1 = new ProductsMap("Tv", 900.0);
		ProductsMap product2 = new ProductsMap("Computer", 1200.0);
		ProductsMap product3 = new ProductsMap("Forno", 480.0);
		ProductsMap product4 = new ProductsMap("Cadeira", 120.0);
		ProductsMap product5 = new ProductsMap("Mesa", 220.0);
		ProductsMap product6 = new ProductsMap("Geladeira", 2500.0);
		ProductsMap product7 = new ProductsMap("Ventilador", 189.0);
		ProductsMap product8 = new ProductsMap("Cama", 800.0);
		ProductsMap product9 = new ProductsMap("MicrOndas", 720.0);
		ProductsMap product10 = new ProductsMap("NoteBook", 1900.0);
		
		
		stock.put(product1, 600.0);
		stock.put(product2, 120.0);
		stock.put(product3, 50.0);
		stock.put(product4, 200.0);
		stock.put(product5, 100.0);
		stock.put(product6, 80.0);
		stock.put(product7, 160.0);
		stock.put(product8, 120.0);
		stock.put(product9, 200.0);
		stock.put(product10, 300.0);
		
		ProductsMap prdm = new ProductsMap("Tv", 900.0);
		ProductsMap prdm1 = new ProductsMap("MicrOndas", 730.0);
		ProductsMap prdm2 = new ProductsMap("Tv", 700.0);
		
		System.out.println("Contains 'prdm' key: " + stock.containsKey(prdm));
		System.out.println("Contains 'prdm' key: " + stock.containsKey(prdm1));
		System.out.println("Contains 'prdm' key: " + stock.containsKey(prdm2));

	}

}
