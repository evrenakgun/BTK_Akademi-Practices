// built-in: "x"te yazılmış. "Java"da yazılmış.

import java.util.Scanner;


/*
 Bu şekilde paketteki bütün classları tek tek import etmemiz gerekir.
import matematik.DortIslem;
import matematik.Logaritma;
 Bunun yerine alttaki import seçeneğini kullanırız:
 Yıldız koyarak matematik paketindeki bütün classları import et demiş oluruz.
*/
import matematik.*;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Adiniz: ");
		String isim = scanner.nextLine();
		
		System.out.println("Merhaba " + isim);
		
		DortIslem dortIslem = new DortIslem();
		dortIslem.topla(3, 4);
		
		Logaritma logaritma = new Logaritma();
		logaritma.logaritmaHesapla();
	}

}
