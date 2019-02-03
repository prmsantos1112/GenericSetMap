package entities;

public class ProdutctFuntionInterfaceStaticUpperCase {
	
	private String name;
	private Double price;
	
	public ProdutctFuntionInterfaceStaticUpperCase() {
		
	}

	public ProdutctFuntionInterfaceStaticUpperCase(String name, Double price) {
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
	
	public static String staticUpperCaseName(ProdutctFuntionInterfaceStaticUpperCase product) {
		return product.getName().toUpperCase();
	}

	@Override
	public String toString() {
		return "ProdutctDefaultMethod [name = " + name + ", price = " + price + "]";
	}

	
}
