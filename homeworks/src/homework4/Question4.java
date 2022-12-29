package homework4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin.
			isim-soyisim : O*** K***** 
			kart no : **** **** **** 1234
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi giriniz..:");
		String ad = scan.nextLine();
		System.out.println("Lutfen soyadinizi giriniz..:");
		String soyAd = scan.nextLine();
		System.out.println("Lutfen 16 haneli kredi karti numaranizi 4 rakamda bir araya ',' koyarak giriniz..:");
		String kartNo = scan.nextLine();
		
		ad = ad.toUpperCase().substring(0);
		soyAd = soyAd.toUpperCase().substring(0);
		
		if (kartNo.substring(3).indexOf(",")==1) {
		
		String boslukluKartno = kartNo.replaceAll("\\W", " ");
		
		String gizliAd = ad.charAt(0)+ad.substring(1).replaceAll("\\S", "*");
		String gizliSoyad = soyAd.charAt(0)+soyAd.substring(1).replaceAll("\\S", "*");
		String gizliKartNo = boslukluKartno.substring(0, boslukluKartno.length()-4).replaceAll("\\S", "*")+boslukluKartno.substring(15);
		
		System.out.println("\nIsim-Soyisim...: " + gizliAd + " " + gizliSoyad);
		System.out.println("Kart No........: " + gizliKartNo);
		
		}
		else System.out.println("Girmis oldugunuz kart numarasinda 4 rakamda bir araya ',' koymadiniz...");
		
		scan.close();

	}

}