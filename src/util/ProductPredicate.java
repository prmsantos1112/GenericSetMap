package util;

import java.util.function.Predicate;

import entities.ProdutctDefaultMethod;

public class ProductPredicate implements Predicate<ProdutctDefaultMethod> {

	@Override
	public boolean test(ProdutctDefaultMethod product) { 
		return product.getPrice() >= 100.0;
	}
	
	

}
