package abstractClasses;

public abstract class GameCalculator {
	//abstract=kendi hesapla methodunu herkes istediði gibi override yapsýn
	public abstract void hesapla(); 
	
	//final=olduðu gibi kullanma
	public final void gameOver() {
		System.out.println("oyun bitti");
	}
}
