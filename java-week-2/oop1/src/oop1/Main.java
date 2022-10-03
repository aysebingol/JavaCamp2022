package oop1;

import org.omg.CORBA.portable.IndirectionException;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(3);
		product2.setImageUrl("image2.jpg");

		Product product3 = new Product();
		product3.setName("Kitcken Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image.jpg3");

		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println(product.getName());

			IndividualCustomer individualCustomer = new IndividualCustomer();
			individualCustomer.setId(1);
			individualCustomer.setPhone("454512");
			individualCustomer.setCustomerNumber("254787");
			individualCustomer.setFirstName("Engin");
			individualCustomer.setLastName("Demir");

			CorporateCustomer corporateCustomer = new CorporateCustomer();
			corporateCustomer.setId(2);
			corporateCustomer.setCompanyName("Kodlama.io");
			corporateCustomer.setPhone("54545");
			corporateCustomer.setTaxNumber("1111");
			corporateCustomer.setCustomerNumber("2545");

			Customer[] customers = { individualCustomer, corporateCustomer };
		}
	}
}