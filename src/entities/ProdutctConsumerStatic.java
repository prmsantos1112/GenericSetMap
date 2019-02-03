package entities;

public class ProdutctConsumerStatic {
	
	private String name;
	private Double price;
	
	public ProdutctConsumerStatic() {
		
	}

	public ProdutctConsumerStatic(String name, Double price) {
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
	
	public static void staticPriceUpdateConsumer(ProdutctDefaultMethod product) {
		product.setPrice((product.getPrice()) * 10 / 100 + product.getPrice());
	}

	@Override
	public String toString() {
		return "ProdutctDefaultMethod [name = " + name + ", price = " + price + "]";
	}

	
}
