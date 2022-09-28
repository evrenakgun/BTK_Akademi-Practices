import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	// throws ekle ki diğer kullanan kişi bunu try-catch içerisine alması
	// gerektiğini bilsin.

	public static void main(String[] args) throws IOException{
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(new FileReader("D:\\Evren\\Java Projelerim\\BTKreadingFileDemo\\src\\sayilar.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				total += Integer.valueOf(line);
			}
			System.out.println("Toplam: " + total);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
	}
}
