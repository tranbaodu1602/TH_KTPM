package entity;

public class Order {
	private String orderId;
	private String name;
	private double price;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(String orderId, String name, double price) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.price = price;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
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

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
