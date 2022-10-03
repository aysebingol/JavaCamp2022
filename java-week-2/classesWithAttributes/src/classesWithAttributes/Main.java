package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// Product product = new Product(1,"Laptop","Asus",3000,2);

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Ausu Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}
}
