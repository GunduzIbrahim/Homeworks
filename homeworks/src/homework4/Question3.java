package homework4;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		/*
		 * Soru 3) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi giriniz..:");
		String ad = scan.nextLine();
		System.out.println("Lutfen soyadinizi giriniz..:");
		String soyAd = scan.nextLine();
		
		int adUzunlugu = ad.length();
		int soyadUzunlugu = soyAd.length();
		
		if (adUzunlugu>soyadUzunlugu) System.out.println("Adiniz soyadinizdan daha uzun..");
		else if (adUzunlugu<soyadUzunlugu) System.out.println("Soydiniz adinizdan daha uzun..");
		else System.out.println("Adinizin harfleri soyadinizin harflerine esit..");
		scan.close();
		
	}

}