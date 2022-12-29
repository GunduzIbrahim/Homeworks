package homework4;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		/*
		 * Aşağıdaki sorunun zorluk seviyesi yüksektir. Kısmi çözümlerde kabul edilir. 
			Soru 5) Kullanicidan bir sifre girmesini isteyin. 
			Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, 
			sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin. 
			- Ilk harf buyuk harf olmali 
			- Son harf kucuk harf olmali 
			- Sifre bosluk icermemeli 
			- Sifre uzunlugu en az 8 karakter olmali
		 */
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Lutfen bir sifre giriniz..:");
		String girilenSifre = scan.nextLine();

		
		if ((girilenSifre.length()>=8) && 
				(! girilenSifre.contains(" ")) && 
				(girilenSifre.startsWith(girilenSifre.toUpperCase().substring(0, 1))) &&
				 (girilenSifre.endsWith(girilenSifre.toLowerCase().substring(girilenSifre.length()-1)))){
			
						System.out.println("Sifre basari ile tanimlandi..");
					}
		
		else System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin..");
		
		scan.close();
	}

}