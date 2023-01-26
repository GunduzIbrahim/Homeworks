package homework15;

import java.util.Scanner;

public class MainOtomobil {
	
	/*
	 * 2) Yukaridaki interface ve class’ i methodlariyla birlikte uygulayin.
	 * (abstract method veya concrete method olmasi durumu soruyu cozme biciminize gore 
	 * sizin tercihinize birakilmistir). Kullaniciya su sorulari yoneltin ve kullanicinin 
	 * tercihine gore otomobil olusturun:
	 * Otomobiliniz elektrik motorlu mu yoksa benzin motorlu mu olsun?
	 * Otomobiliniz Otomatik vitesli mi yoksa duz vitesli mi olsun?
	 * Opsiyonel olan secenekleri tek tek sorun.
	 * Standard ozellikler her aracta olacak.
	 * 3 farkli arac olusturulacak, olusturulan her araca farkli 17 haneli bir sasi numarasi 
	 * tanimlanacak ve bu numara bir method kullanilarak olusturulacaktir.
	 */
	
	public static long aracSasiNo;
	public static String kasa;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		OtomobilOlustur otomobil1 = new OtomobilOlustur();
		OtomobilOlustur otomobil2 = new OtomobilOlustur();
		OtomobilOlustur otomobil3 = new OtomobilOlustur();
		OtomobilOlustur otomobil[]= {otomobil1, otomobil2, otomobil3};
		
		
		int i=0;
		while (i<=2) {
		System.out.println((i+1)+". otomobilin kasa secimi ? (sedan/spor)");
		kasa = scan.nextLine();
			
		switch(kasa) {
		case "sedan":
			otomobil[i].sedanArac();
			break;
		case "spor" :
			otomobil[i].sporArac();
			break;
		default: System.out.println("Gecersiz giris yaptiniz..!");
		}
		i++;
		}
	}
	
	public static long sasiNo() {
		long min = 10000000000000000L;
		long max = 99999999999999999L;
		long randomSasi = (long)Math.floor(Math.random() * (max - min + 1) + min);
		aracSasiNo = randomSasi;
		return aracSasiNo;
	}
}
