package util;

import java.util.function.Consumer;

import entities.ProdutctDefaultMethod;

public class PriceUpDateConsumer implements Consumer <ProdutctDefaultMethod> {

	@Override
	public void accept(ProdutctDefaultMethod product) {
		// product.setPrice(product.getPrice() * 1.1);
		
		product.setPrice((product.getPrice()) * 10 / 100 + product.getPrice());
		
	}
}
