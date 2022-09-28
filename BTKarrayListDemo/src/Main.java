import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList sayilar = new ArrayList();
		// Arraylist oluşturursan içine int, string, double, char farketmeksizin her türlü değişkeni yollayabilirsin.
		sayilar.add(1);
		sayilar.add(10);
		sayilar.add("Ankara");
		
		System.out.println(sayilar.size());
		System.out.println(sayilar.get(1));
		System.out.println(sayilar.get(2));
		
		sayilar.set(2, 100);
		
		sayilar.remove(0);
		// remove komutuyla o indeksteki elemanı sileriz ve dizi sola doğru kayar.
		
		// sayilar.clear();
		// clear komutu bütün diziyi siler.
		System.out.println(sayilar.get(0));
		
		for (Object row : sayilar) {
			System.out.println(row);
		}
	}

}
