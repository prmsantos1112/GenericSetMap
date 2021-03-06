package entities;

public class ProdutctReferenceMethodStatic {
	
	private String name;
	private Double price;
	
	public ProdutctReferenceMethodStatic() {
		
	}

	public ProdutctReferenceMethodStatic(String name, Double price) {
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
	
	public static boolean staticProductPredicate(ProdutctReferenceMethodStatic product) {
		return product.getPrice() >= 100.0;
		
	}

	@Override
	public String toString() {
		return "ProdutctDefaultMethod [name = " + name + ", price = " + price + "]";
	}

	
}
