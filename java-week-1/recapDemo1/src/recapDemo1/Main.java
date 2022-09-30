package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1, sayi2, sayi3;
		sayi1 = 70;
		sayi2 = 50;
		sayi3 = 100;

		String mesaj = "En büyük :";
		int max = sayi1;

		if (max < sayi2) {
			max = sayi2;
		}
		if (max < sayi3) {
			max = sayi3;
		}
		System.out.println(mesaj + max);

		/*
		 * String mesaj = "En büyük sayi : ";
		 * 
		 * if (sayi1>sayi2 && sayi2>sayi3) { System.out.println(mesaj + sayi1); }else
		 * if(sayi2>sayi1 && sayi1>sayi3) { System.out.println(mesaj + sayi2); }else {
		 * System.out.println(mesaj + sayi3); }
		 */

	}

}
