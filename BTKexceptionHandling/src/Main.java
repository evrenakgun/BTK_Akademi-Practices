
public class Main {

	public static void main(String[] args) {
		
		try {
			int[] sayilar = { 1, 2, 3 };
			System.out.println(sayilar[5]);
		} /*
			catch (ArrayIndexOutOfBoundsException e) {
			// -e ifadesi random bir ifade onun yerine başka bir ifade de yazılabilir.
			// -try bloğu içine yazdığımız kodda sayilar kümesinin 5. indisinde eleman
			// yoktur. Çünkü dizi 3 elemanlıdır.
			System.out.println("Hata olustu: array");
			
			// - Normalde bu kodu çalıştırdığımızda out of bonds hatası alırız. Ama
			// try-catch bloğu içerisine yazarsak catch komutu ile kod çalışır ve alınan
			// hatayı e değişkenine atar.
			System.out.println(e);
		}*/
		catch (StringIndexOutOfBoundsException e) {
			// Birden fazla catch kullanılabilir.
			// "ArrayIndexOutOfBoundsException" ve "StringIndexOutOfBoundsException" yazarsak
			// sadece bu hataları kapsayacağı için diğer hatalarda java çalışmaz.
			System.out.println("Hata olustu: string");
			System.out.println(e);
		}catch (Exception e) {
			// Sadece "Exception" yazarsak bütün exception hatalarını kapsar.
			// Bu yüzden hangi hatayı aldığımızı görebilmek için loglarız.
			System.out.println("Loglandi: " + e);
		}
		
		finally {
			// finally bloğuna yazılan her şey her zaman çalışır.
			// try da çalışsa sonradan finally çalışır. catch de çalışsa ardından finally çalışır.
			System.out.println("Bu blok her turlu calisir");
		}
		
		
	}

}
