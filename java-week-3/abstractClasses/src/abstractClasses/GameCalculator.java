package abstractClasses;

public abstract class GameCalculator {
	//abstract=kendi hesapla methodunu herkes istedi�i gibi override yaps�n
	public abstract void hesapla(); 
	
	//final=oldu�u gibi kullanma
	public final void gameOver() {
		System.out.println("oyun bitti");
	}
}
