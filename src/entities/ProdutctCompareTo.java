package entities;

public class ProdutctCompareTo implements Comparable<ProdutctCompareTo> {
	
	private String name;
	private Double price;
	
	public ProdutctCompareTo() {
		
	}

	public ProdutctCompareTo(String name, Double price) {
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
		return "ProdutctCompareTo [name = " + name + ", price = " + price + "]";
	}

	@Override
	public int compareTo(ProdutctCompareTo prod_1) {		
		return name.toUpperCase().compareTo(prod_1.getName().toUpperCase());
	}
}
