package entities;

public class ProdutctConsumerNonStatic {
	
	private String name;
	private Double price;
	
	public ProdutctConsumerNonStatic() {
		
	}

	public ProdutctConsumerNonStatic(String name, Double price) {
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
	
	public void nonStaticPriceUpdateConsumer() {
		setPrice((getPrice()) * 10 / 100 + getPrice());
		// price = price * 1.1;
	}

	@Override
	public String toString() {
		return "ProdutctDefaultMethod [name = " + name + ", price = " + price + "]";
	}

	
}
