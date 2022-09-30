package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 2;
		boolean asalMý = true;

		if (sayi == 1) {
			System.out.println("1 asal deðil");
			return;
		}

		if (sayi < 2) {
			System.out.println("geçersiz sayi");
		}

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asalMý = false;
			}
		}
		if (asalMý) {
			System.out.println("sayi asaldýr");
		} else {
			System.out.println("sayi asal deðil");
		}

	}

}
