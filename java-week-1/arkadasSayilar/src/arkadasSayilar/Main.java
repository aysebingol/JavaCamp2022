package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		int a = 222;
		int b = 284;
		int toplam = 0;
		int toplam1 = 0;

		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				toplam = toplam + i;
			}
		}
		if (toplam == b) {
			System.out.println("arkadaþ sayýlardýr");
		} else {
			System.out.println("deðildir");
		}

		System.out.println("-----------------");

		for (int j = 1; j < a; j++) {
			if (b % j == 0) {
				toplam1 = toplam1 + j;
			}
		}
		if (toplam1 == a) {
			System.out.println("arkadaþ sayýlardýr");
		} else {
			System.out.println("deðildir");
		}

	}

}
