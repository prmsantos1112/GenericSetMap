package entities;

import java.util.Comparator;

public class MyComparator implements Comparator<ProdutctDefaultMethod>{

	@Override
	public int compare(ProdutctDefaultMethod product_01, ProdutctDefaultMethod product_02) {		
		return product_01.getName().toUpperCase().compareTo(product_02.getName().toUpperCase());
	}

}
