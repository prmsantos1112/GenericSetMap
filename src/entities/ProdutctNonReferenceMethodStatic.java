package entities;

public class ProdutctNonReferenceMethodStatic {
	
	private String name;
	private Double price;
	
	public ProdutctNonReferenceMethodStatic() {
		
	}

	public ProdutctNonReferenceMethodStatic(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//public static boolean staticProductPredicate(ProdutctNonReferenceMethodStatic product) {
	//	return product.getPrice() >= 100.0;
		
	// }
	
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}


	@Override
	public String toString() {
		return "ProdutctDefaultMethod [name = " + name + ", price = " + price + "]";
	}

	
}
