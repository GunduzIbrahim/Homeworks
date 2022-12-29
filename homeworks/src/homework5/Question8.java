package homework5;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		/*
		 * 8) Kullanicidan toplamak icin sayi isteyin ve 
		 * sayilarin toplami 500’e ulasincaya kadar sayi istemeye devam edin. 
		 * Toplam 500’e ulastiginda veya gectiginde 
		 * sayilarin toplami ve kac sayi girildigini yazdirin.(do while dongusu ile)
		 */
		
		Scanner scan = new Scanner (System.in);
		int sayiAdedi=0, sayiToplami=0, girilenSayi=0;
		do
		{
			System.out.println("Lutfen bir sayi girin..:");
			girilenSayi = scan.nextInt();
			
			sayiToplami+=girilenSayi;
			++sayiAdedi;
		
		}
		while(sayiToplami<500);
		
		System.out.println("Girilen sayi adedi...: "+sayiAdedi);
		System.out.println("Girilen sayilarin toplami: "+sayiToplami);
		scan.close();

	}

}