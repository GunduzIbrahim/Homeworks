package homework3;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 100 uzerinden notunu isteyin. Not’u harf sistemine cevirip
		 * yazdirin. 50’den kucukse “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin
		 * uzerinde ise “A”.(If, else if, else kullanalim)
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen sinav notunuzu 100 uzerinden giriniz..");

		byte sinavNotu = scan.nextByte();

		if (sinavNotu >= 0 && sinavNotu <= 100) {

			if (sinavNotu < 50)
				System.out.println("D");
			else if (sinavNotu >= 50 && sinavNotu < 60)
				System.out.println("C");
			else if (sinavNotu >= 60 && sinavNotu < 80)
				System.out.println("B");
			else
				System.out.println("A");
		}

		else
			System.out.println("Hatali not girisi yaptiniz...");

	}

}