package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "bug�n hava �ok g�zel.";
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 4));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		/*
		 * System.out.println("eleman say�s� :" + mesaj.length());
		 * System.out.println("5.karakter :" + mesaj.charAt(4));
		 * System.out.println(mesaj.concat("ya�as�n"));
		 * System.out.println(mesaj.startsWith("b"));
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf("av"));
		 * System.out.println(mesaj.lastIndexOf("a"));
		 */

		// System.out.println(mesaj.replace(' ','-'));

	}

}
