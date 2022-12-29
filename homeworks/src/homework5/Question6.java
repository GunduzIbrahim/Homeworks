package homework5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		/*
		 * 6) Kullanicidan bir sayi alin 
		 * ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini 
		 * ekranda yazdirin.(while dongusu ile)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz..:");
		int girilenSayi = scan.nextInt();
		System.out.println("");
		
		int tamBolen = 1, bolenAdedi=0;
		
		while (tamBolen<=girilenSayi) {
			
			if(girilenSayi%tamBolen==0) {
				System.out.print(""+tamBolen+" ");
				bolenAdedi++;
			}
			tamBolen++;
		}
		System.out.println("\nGirmis oldugunuz " + girilenSayi + " sayisinin tam bolenleri "+bolenAdedi+" tanedir...");
		scan.close();
	}

}