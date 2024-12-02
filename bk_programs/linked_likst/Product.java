package sales;

import java.util.Objects;

public class Product {
	// int id;
	private String name;
	private double price;
	private int stock;

	public Product() {
	}

	public Product(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

//	@Override
//	public boolean equals(Object p1) {
////		Object o;
////		o.equals(o) //for understanding
//		
//		
//		if (this.name.equals(((Product) p1).getName())) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
		// return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		// if (this.name.equals(other.name)) {
		if (this.getPrice() == other.getPrice() && this.getName().equals(other.getName())) {

			return true;
		}
		return false;
		// return Objects.equals(name, other.name)
		// && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) &&
		// stock == other.stock;

	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

//
	@Override // annotation
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}

}
