
public abstract class GameCalculator {
	public abstract void hesapla();
	// Bir metotu abstract yaparak başka classlarda hesapla metotunu kullanmaya ve override etmeye mecbur bırakır.
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
