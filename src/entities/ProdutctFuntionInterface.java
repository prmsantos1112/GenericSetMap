package entities;

public class ProdutctFuntionInterface {
	
	private String name;
	private Double price;
	
	public ProdutctFuntionInterface() {
		
	}

	public ProdutctFuntionInterface(String name, Double price) {
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

	@Override
	public String toString() {
		return "ProdutctDefaultMethod [name = " + name + ", price = " + price + "]";
	}

	
}
