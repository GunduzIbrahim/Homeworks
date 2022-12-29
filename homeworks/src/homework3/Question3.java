package homework3;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
		 * baslayan gun isimlerini yazdirin. Ornek ilkHarf=P output = “Pazar, Pazartesi
		 * veya Persembe” ilkHarf=S output = “Sali” (switch case default ile yapalim)
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen haftanın günlerinden birinin ilk harfini küçük harfle giriniz...");
		char ilkHarf = scan.next().charAt(0);

		switch (ilkHarf) {

		case 'p':
			System.out.println("Bu harfle başlayan günler...: Pazar, Pazartesi veya Perşembe");
			break;
		case 's':
			System.out.println("Bu harfle başlayan gün...: Salı");
			break;
		case 'c':
			System.out.println("Bu harfle başlayan günler...: Cuma, Cumartesi");
			break;
		case 'ç':
			System.out.println("Bu harfle başlayan gün...: Çarşamba");
			break;
		default:
			System.out.println("Hatalı giriş yaptınız...");

		}
		scan.close();

	}

}