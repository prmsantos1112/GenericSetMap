package entities;

public class ProductFilterSortedMapReduce {
	
	private String name;
	private Double price;	
	
	public ProductFilterSortedMapReduce(String name, Double price) {
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
		return "ProductFilterSortedMapReduce [name = " + name + ", " + String.format("%.2f", price) +"]";
	}	

}
