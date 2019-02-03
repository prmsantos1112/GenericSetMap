package entities;

public class ProdutctFuntionInterfaceNonStaticUpperCase {
	
	private String name;
	private Double price;
	
	public ProdutctFuntionInterfaceNonStaticUpperCase() {
		
	}

	public ProdutctFuntionInterfaceNonStaticUpperCase(String name, Double price) {
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
	
	public static String staticUpperCaseName(ProdutctFuntionInterfaceNonStaticUpperCase product) {
		return product.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
	}

	@Override
	public String toString() {
		return "ProdutctDefaultMethod [name = " + name + ", price = " + price + "]";
	}

	
}
