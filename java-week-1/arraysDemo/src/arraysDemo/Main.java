package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Ayþe";
		String ogrenci3 = "Salih";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("----------------");

		String[] ogrenciler = new String[2];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Ayþe";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}

		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
