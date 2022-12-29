package homework2;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double uzunKenar, kisaKenar, yukseklik, hacim;

		System.out.println("Dikdortgenler prizmasinin uzun kenarini giriniz.. (cm): ");
		uzunKenar = scan.nextDouble();
		System.out.println("Dikdortgenler prizmasinin kisa kenarini giriniz.. (cm): ");
		kisaKenar = scan.nextDouble();
		System.out.println("Dikdortgenler prizmasinin yuksekligini giriniz.. (cm): ");
		yukseklik = scan.nextDouble();

		hacim = kisaKenar * uzunKenar * yukseklik;

		System.out.println("Dikdortgenler prizmasinin hacmi..: " + hacim + " cm³'tur");

	}

}