package services;

import java.util.List;
import java.util.function.Predicate;

import entities.ProdutctFunction;

public class ProductService {
	
	public double filteredSum(List<ProdutctFunction> list, Predicate<ProdutctFunction> criterio) {
		double sum = 0.0;
		for (ProdutctFunction product : list) {
			if (criterio.test(product)) {
				sum += product.getPrice();
			}
		}
		return sum;
		
	}
}
