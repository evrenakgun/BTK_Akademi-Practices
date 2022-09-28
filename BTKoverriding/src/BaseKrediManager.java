
public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}

/*
 * public final double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	Bu şekilde final kullanarak oluşturulan metotlara override yapılamaz.
 */
