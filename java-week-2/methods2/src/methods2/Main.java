package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Hava g�zel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 5, 7);
		System.out.println(toplam);

	}

	public static void ekle() {

	}

	public static void sil() {

	}

	public static void guncelle() {

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
