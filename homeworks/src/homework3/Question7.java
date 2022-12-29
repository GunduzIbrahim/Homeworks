package homework3;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		/*
		 * Kullanıcıdan 4 basamakli birsayi girmesini isteyin. Girdiği sayi 5’e
		 * bölünüyorsa son rakamını control edin. Sonrakamı 0 ise ekrana “5’e bölünen
		 * çift sayı” yazdırın. Sonrakamı 0 değilise “5’e bölünen tek sayı” yazdırın.
		 * Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın. (Nested
		 * Ternary kullanalim)
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
		long girilenSayi = scan.nextLong();

		String mesaj = ((girilenSayi > -10000) && (girilenSayi < 10000))
						? (((((girilenSayi % 10) == 0) || (((girilenSayi % 10) == 5) || (girilenSayi % 10) == -5))
								? (((girilenSayi % 5 == 0) && (girilenSayi % 10 == 0)) ? "5'e bolunen cift sayi"
										: "5'e bolunen tek sayi")
								: "Tekrar deneyiniz..."))
						: "4 basamakli sayi girmediniz...";
		System.out.println(mesaj);

//		byte sonRakam = (byte) (girilenSayi % 10);
//
//		if (girilenSayi > -10000 && girilenSayi < 10000) {
//
//			String mesaj = (girilenSayi % 5 == 0) ? ((sonRakam == 0) ? "5'e bolunen cift sayi" : "5'e bolunen tek sayi")
//					: "Tekrar deneyin..";
//			System.out.println(mesaj);
//		}
//
//		else
//			System.out.println("4 basamakli sayi girisi yapmadiniz...");
		

	}

}