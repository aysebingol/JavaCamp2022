package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 2;
		boolean asalM� = true;

		if (sayi == 1) {
			System.out.println("1 asal de�il");
			return;
		}

		if (sayi < 2) {
			System.out.println("ge�ersiz sayi");
		}

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				asalM� = false;
			}
		}
		if (asalM�) {
			System.out.println("sayi asald�r");
		} else {
			System.out.println("sayi asal de�il");
		}

	}

}
