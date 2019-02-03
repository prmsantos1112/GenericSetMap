package util;

import java.util.function.Function;

import entities.ProdutctFuntionInterface;

public class UpperCaseName implements Function <ProdutctFuntionInterface, String> {

	@Override
	public String apply(ProdutctFuntionInterface product) {
		return product.getName().toUpperCase();
	}

}
