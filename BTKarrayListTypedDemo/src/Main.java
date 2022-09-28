import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// < > işaretleri arasına veri tipi yazarak yeni bir obje oluşturursak sadece o veri tipinde liste oluştururuz.
		ArrayList<String> sehirler = new ArrayList<String>();
		ArrayList<Integer> sayilar = new ArrayList<Integer>();
		
		sehirler.add("Ankara");
		sehirler.add("İstanbul");
		sehirler.add("Izmir");
		sehirler.add("Aydin");
		
		sayilar.add(23);
		sayilar.add(15);
		sayilar.add(5);
		sayilar.add(7);
		
		sehirler.remove("İstanbul");
		Collections.sort(sehirler);
		Collections.sort(sayilar);
		
		Collections.reverse(sayilar);
		
		for (String sehir : sehirler) {
			System.out.println(sehir);
		}
		
		for (Integer sayi : sayilar) {
			System.out.println(sayi);
		}
	}

}
