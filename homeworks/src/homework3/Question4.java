package homework3;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
		 * gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
		 * “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin. (switch case
		 * default ile yapalim)
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lütfen haftanın günlerinden birini küçük harflerle giriniz...");
		String girilenGun = scan.nextLine();

		switch (girilenGun) {

		case "cuma":
			System.out.println("Muslumanlar icin kutsal gun.");
			break;
		case "cumartesi":
			System.out.println("Yahudiler icin kutsal gun.");
			break;
		case "pazar":
			System.out.println("Hristiyanlar icin kutsal gun.");
			break;
		default:
			System.out.println("Cuma, Cumartesi ya da Pazar haricinde bir gun girdiniz...");

		}
		scan.close();

	}

}