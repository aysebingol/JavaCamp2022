package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok g�zel : Ge�tiniz");
			break;
		case 'C':
			System.out.println("iyi : Ge�tiniz");
			break;
		case 'D':
			System.out.println("fena de�il : Ge�tiniz");
			break;
		case 'F':
			System.out.println("maalesef : kald�n�z");
			break;
		default:
			System.out.println("ge�ersiz not girdiniz");
		}
	}

}
