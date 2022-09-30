package intro;

public class Main {

	public static void main(String[] args) {

		int vade = 12;

		double dolarDun = 18.20;
		double dolarBugun = 18.20;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		String[] krediler = { "hýzlý kredi", "emekli", "maaþýný alanlar" };
		System.out.println(krediler[0]);

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);

		}

	}

}
