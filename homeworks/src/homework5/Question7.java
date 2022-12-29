package homework5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		/*7) Kullanicidan toplamak uzere pozitif sayilar isteyin, 
		 * islemi bitirmek icin 0’a basmasini soyleyin. 
		 * Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini 
		 * ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile)
		 */
		Scanner scan = new Scanner (System.in);
		int sayiAdedi=0, sayiToplami=0, girilenSayi=0;
		
		System.out.println("Toplami yapilacak pozitif sayi girin (sonuc icin 0'a basin)..:");
		
		do
		{
			
			girilenSayi = scan.nextInt();
			if (girilenSayi<0)
				System.out.println("Negatif sayi girdiniz...");
			else {
			sayiToplami+=girilenSayi;
			sayiAdedi++;
			}
		
		}
		while(girilenSayi!=0);
		
		System.out.println("Girilen sayi adedi...: "+(sayiAdedi-1));
		System.out.println("Girilen sayilarin toplami: "+sayiToplami);
		scan.close();
	}
	
		

}