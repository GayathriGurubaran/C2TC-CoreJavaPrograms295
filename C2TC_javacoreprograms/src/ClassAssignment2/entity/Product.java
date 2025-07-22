package ClassAssignment2.entity;

public class Product {
	public int productId;
    public String productName;
    public double price;

    public Product(int id, String name, double price) {
        this.productId = id;
        this.productName = name;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + productId + ", Name: " + productName + ", Price: ₹" + price);
}
}
