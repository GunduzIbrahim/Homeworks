package homework4;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		/*
		 * Soru 2) Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor” 
		 * - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor” 
		 * - ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir isim giriniz..:");
		String girilenIsim = scan.nextLine();
		
		if (girilenIsim.contains("a")) {
			
			System.out.println("Girdiginiz isim a harfi iceriyor");
				
		}
		else if (girilenIsim.contains("Z")) {
			
			System.out.println("Girdiginiz isim Z harfi iceriyor");
			
		}
		
		else System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
		
		scan.close();

	}

}