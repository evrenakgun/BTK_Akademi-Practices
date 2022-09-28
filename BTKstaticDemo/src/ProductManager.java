
public class ProductManager {
	public void add(Product product) {
		//Bir metotu static yaptığımızda class ismiyle direkt olarak çağırabiliriz.
		//Bknz.: ProductValidator.isValid(product)
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}
		
		else {
			System.out.println("Urun bilgileri gecersizdir.");
		}
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
	}
}
