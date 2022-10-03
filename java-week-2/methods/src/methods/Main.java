package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	public static void sayiBulmaca() {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		/*
		 * if (varMi) { mesajVer(aranacak); } else { System.out.println("yok:"
		 * +aranacak); } }
		 * 
		 * public static void mesajVer(int aranacak) { System.out.println("var:"
		 * +aranacak );
		 * 
		 * }
		 * 
		 */
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayi mevcut";
			mesajVer(mesaj);

		} else {
			System.out.println("yok:" + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}