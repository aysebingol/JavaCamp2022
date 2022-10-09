package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("static");
	}
	
	public ProductValidator() {
		System.out.println("yapýcý");
	}
	
	
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void bisey() {

	}
	/*//inner class
		public static class BaskaClass{
			public static void Sil() {
				
			}
		}
		*/
}
