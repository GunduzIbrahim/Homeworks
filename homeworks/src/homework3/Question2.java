package homework3;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * 2- Kullanıcıdan bir gün girmesini isteyelim. a. Eger girilen gun hafta sonu
		 * ise tekrar kontrol edelim Cumartesi ise Cumartesi ve hafta sonu, Pazar ise
		 * Pazar ve hafta sonu yazdıralım. b. Degil ise gün hafta ici yazdıralım. 1.
		 * Note: equals ile karsilastiralim 2. Nested ternary kullanalım…
		 * 
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		String girilenGun;

		System.out.println("Lutfen kucuk harflerle bir gun yaziniz...:");
		girilenGun = scan.nextLine();

		String mesaj = girilenGun.equals("cumartesi") || girilenGun.equals("pazar")
				? (girilenGun.equals("cumartesi") ? "Cumartesi ve hafta sonu" : "Pazar ve hafta sonu")
				: ("gun hafta ici");
		System.out.println("Girilen gun, " + mesaj);

		scan.close();

	}

}