//Ana class static olamaz.
public class ProductValidator {
	
	static {
		System.out.println("Static yapici blok calisti");
	}
	
	public ProductValidator() {
		System.out.println("Yapici blok calisti");
	}
	
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
	//Buna inner class denir. Static olabilir.
	public static class BaskaBirClass{
		public static void Sil() {
			
		}
	}
}
