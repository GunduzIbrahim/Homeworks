package homework9;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		/*
		 * 4.	Kullanicidan adini, soy adini isteyin ve onu “Hosgeldin Ad Soyad” seklinde selamlayin. 
		 * Tc kimlik numarasini talep edin ve kullaniciya tc’ sinin 1. , 4. ve 9. rakamlarini gosterip onaylatin.
		 * 16 haneli kredi kardi numarasini isteyip ekranda son dort hanesi gorunecek sekilde yazdirin
		 * (**** ****  **** 5434) .
		 * Tum islemleri StringBuilder kullanarak yapiniz. Bu programin en basinda zamani alin ve 
		 * islemler tamamlaninca tekrar zaman alin ve arada gecen sureyi ekrana 
		 * “Islemler ….. surede tamamlandi.” Ibaresini gosterip programi tamamlayin.
		 */
		long baslangic = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
		StringBuilder selamlama = new StringBuilder("Hosgeldin ");
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz..: ");
		String ad = scan.nextLine();
		selamlama.append(ad);
		System.out.println(selamlama);
		System.out.println();
		StringBuilder tc = new StringBuilder(11);
		System.out.println("Lutfen TC kimlik numaranizi giriniz..: ");
		tc.append(scan.nextLine());
		String girilenTc = tc.toString();
		
		System.out.println("TC Kimlik numaranizin 1., 4. ve 9. rakamlari sirasiyla : "
									+tc.charAt(0)+" "+tc.charAt(3)+" "+tc.charAt(8)+ " dir.");
		for(;;) {
		System.out.println("Onayliyor musunuz (e\\h) ?"); 
		char onay = scan.next().charAt(0);
		
		switch (onay) {
		case 'e': System.out.println("Islem onaylandi..");
		break;
		case 'h': {
			System.out.println("Islem onaylanmadi \nTC Kimlik numaranizi tekrar giriniz..");
			Question4.tcGir(girilenTc);
			break;
		}
		default:System.out.println("Hatali giris yaptiniz..");
		
		}if (onay=='e') break;
		
		}
		System.out.println();
		kartNoGir();
		long bitis = System.currentTimeMillis();
		long gecenSure = (bitis-baslangic);
		System.out.println("Bu programda islemler " +((double)gecenSure)/1000+" saniyede gerceklesti.." );
		scan.close();

	}
	
	public static String tcGir(String tcGir) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder tc = new StringBuilder(11);
		tc.append(scan.nextLine());
		tcGir = tc.toString();
		
		return tcGir;
		
	}
	
	public static void kartNoGir() {
		
		Scanner scan = new Scanner(System.in);
		
		StringBuilder kartNo = new StringBuilder();
		System.out.println("Lutfen 16 haneli kredi karti numaranizi giriniz..: ");
		kartNo.append(scan.nextLine());
		String yeniKartNo = (kartNo.substring(0,12).replaceAll("\\S", "*")+kartNo.substring(12));
		StringBuilder gizliKartNo = new StringBuilder();
		gizliKartNo.append(yeniKartNo);
		gizliKartNo.insert(4, " ");gizliKartNo.insert(9, " ");gizliKartNo.insert(14, " ");
		System.out.println("\nKart Numaraniz..:");
		System.out.println(gizliKartNo);
		scan.close();
		
	}

}
