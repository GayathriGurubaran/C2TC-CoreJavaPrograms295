package ClassAssignment2.entity;

public class MainProgram {

	public static void main(String[] args) {
		Product p1 = new Product(101, "Notebook", 35.50);
        Product p2 = new Product(102, "Pen", 10.00);
        Product p3 = new Product(103, "Pencil", 5.00);
        Product p4 = new Product(104, "Eraser", 3.50);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
      

	}

}
