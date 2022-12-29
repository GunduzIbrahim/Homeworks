package homework3;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
		 * olmadigini yazdirin. (D, d, 3, ~, @, !, ...) (ip ucu: ascii tablosu)
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen klavyeden tek bir karakter giriniz.. ");
		char girilenKarakter = scan.next().charAt(0);

		byte asciiDegeri = (byte) girilenKarakter;

		if ((asciiDegeri >= 65) && (asciiDegeri <= 90) || ((asciiDegeri >= 97) && (asciiDegeri <= 122)))

			System.out.println("Girmis oldugunuz karakter bir harftir...");

		else

			System.out.println("Girmis oldugunuz karakter harf degildir..");

	}

}