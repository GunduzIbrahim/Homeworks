package homework10;


import java.util.Arrays;
import java.util.Scanner;

public class AracSorgu {

	public static void main(String[] args) {
		
		/*
		 * 				Plaka Tanima Sistemi
		 * 1.	Karayollarinda bulunan mobesa kameralarinin mevcut araclarda ki plakalari okuyup bize arac hakkinda bilgi vermesini isteyen bir program tasarliyoruz.
		 * 2.	Kameradan okuma kismini kullanicidan plaka alarak simule – test edecegiz.
		 * 3.	Kullanici bir arac plakasi girdigi zaman veritabaninda olan ozellikleri bir class ta yaziniz.(Plaka bilgisi, isim-soysisim, arac markasi, adres, arac durumu, vs gibi bilgiler) 
		 * 4.	3. Maddede belirtilen ozelliklerde 10 tane nesne uretiniz ve bunlari bir dizi veya listede saklayiniz.
		 * 5.	Kullanicidan alacagimiz plakayi mevcut plakalarla kiyaslayiniz ve supheli-calinti araclari ekranda yazdiriniz.
		 * 
		 * 						Bu odevin hedefleri 
		 * 1.	Classlari kullanarak nesne uretmek,
		 * 2.	Getter ve setter yapilarini kullanabilmek,
		 * 3.	Dizi ve liste yapilarini kullanabilmek,
		 * 4.	for dongulerini kullanabilmek,
		 * 5.	if-else yapilarini kullanabilmek.
		 */
		
		Scanner scan = new Scanner (System.in);
		
		AracTescil arac1 = new AracTescil();
		AracTescil arac2 = new AracTescil();
		AracTescil arac3 = new AracTescil();
		AracTescil arac4 = new AracTescil();
		AracTescil arac5 = new AracTescil();
		AracTescil arac6 = new AracTescil();
		AracTescil arac7 = new AracTescil();
		AracTescil arac8 = new AracTescil();
		AracTescil arac9 = new AracTescil();
		AracTescil arac10 = new AracTescil();
		
		AracTescil arac[]= {arac1,arac2,arac3,arac4,arac5,arac6,arac7,arac8,arac9,arac10};
		
		arac1.setPlaka("34GR4289");
		arac1.setRuhsatTarihi(2012);
		arac1.setRuhsatSahibi("Ibrahim GUNDUZ");
		arac1.setAracMarkasi("Opel");
		arac1.setAracTipi("Otomobil");
		arac1.setAracRengi("Simsek Gri");
		arac1.setAracTescilDurumu("Trafikte");
		arac1.setAracTescilYeri("Istanbul-Kucukcekmece");
		
		arac2.setPlaka("41EC4584");
		arac2.setRuhsatTarihi(2008);
		arac2.setRuhsatSahibi("Mehmet KARASU");
		arac2.setAracMarkasi("Nissan");
		arac2.setAracTipi("Kamyonet");
		arac2.setAracRengi("Siyah");
		arac2.setAracTescilDurumu("!!!CALINTI-KAYIP!!!");
		arac2.setAracTescilYeri("Kocaeli-Izmit");
	
		arac3.setPlaka("06HTR6589");
		arac3.setRuhsatTarihi(2020);
		arac3.setRuhsatSahibi("Mustafa YILMAZ");
		arac3.setAracMarkasi("Toyota");
		arac3.setAracTipi("Otomobil");
		arac3.setAracRengi("Beyaz");
		arac3.setAracTescilDurumu("Trafikte");
		arac3.setAracTescilYeri("Ankara-Golbasi");
	
		arac4.setPlaka("65TK456");
		arac4.setRuhsatTarihi(2019);
		arac4.setRuhsatSahibi("Mehdi SELAMSIZ");
		arac4.setAracMarkasi("Ford");
		arac4.setAracTipi("Kamyonet");
		arac4.setAracRengi("Kirmizi");
		arac4.setAracTescilDurumu("Trafikte");
		arac4.setAracTescilYeri("Van-Ipekyolu");
		
		arac5.setPlaka("35YK4857");
		arac5.setRuhsatTarihi(2000);
		arac5.setRuhsatSahibi("Serdar KAPUSUZ");
		arac5.setAracMarkasi("Ford");
		arac5.setAracTipi("Otomobil");
		arac5.setAracRengi("Mavi");
		arac5.setAracTescilDurumu("!!!TRAFIKTEN MEN!!!");
		arac5.setAracTescilYeri("Izmir-Bornova");
		
		arac6.setPlaka("24KTY458");
		arac6.setRuhsatTarihi(2022);
		arac6.setRuhsatSahibi("Kemal TUFEKCI");
		arac6.setAracMarkasi("Pevgeot");
		arac6.setAracTipi("Otomobil");
		arac6.setAracRengi("Yesil");
		arac6.setAracTescilDurumu("Trafikte");
		arac6.setAracTescilYeri("Erzincan-Refahiye");
		
		arac7.setPlaka("17USL697");
		arac7.setRuhsatTarihi(2015);
		arac7.setRuhsatSahibi("Kiraz DURSUN");
		arac7.setAracMarkasi("VolksWagen");
		arac7.setAracTipi("Kamyonet");
		arac7.setAracRengi("Beyaz");
		arac7.setAracTescilDurumu("Trafikte");
		arac7.setAracTescilYeri("Çanakkale-Çan");
		
		arac8.setPlaka("61LNE985");
		arac8.setRuhsatTarihi(2020);
		arac8.setRuhsatSahibi("Kazim AYYILDIZ");
		arac8.setAracMarkasi("Seat");
		arac8.setAracTipi("Otomobil");
		arac8.setAracRengi("Gri");
		arac8.setAracTescilDurumu("Trafikte");
		arac8.setAracTescilYeri("Trabzon-Tonya");
	
		arac9.setPlaka("54NMR548");
		arac9.setRuhsatTarihi(2013);
		arac9.setRuhsatSahibi("Merve KULAKSIZ");
		arac9.setAracMarkasi("Ranault");
		arac9.setAracTipi("Otomobil");
		arac9.setAracRengi("Beyaz");
		arac9.setAracTescilDurumu("Trafikte");
		arac9.setAracTescilYeri("Sakarya-Serdivan");
		
		arac10.setPlaka("02DR542");
		arac10.setRuhsatTarihi(2023);
		arac10.setRuhsatSahibi("Mustafa YILMAZ");
		arac10.setAracMarkasi("Fiat");
		arac10.setAracTipi("Otomobil");
		arac10.setAracRengi("Kirmizi");
		arac10.setAracTescilDurumu("Trafikte");
		arac10.setAracTescilYeri("Adiyaman-Kahta");
		
		System.out.println("Lutfen sorgulamak istediginiz plakayi giriniz (or:12AB3456):");
		String girilenPlaka = scan.nextLine();
		girilenPlaka = girilenPlaka.toUpperCase();
		String sorgulanan="";
		
		//@SuppressWarnings("unlikely-arg-type")
		boolean eslesme=Arrays.asList(arac).contains(girilenPlaka);
		
		for (int i=0; i<10;i++) {
			
			if(arac[i].getPlaka().toString().equals(girilenPlaka)) {
				sorgulanan = ("==="+arac[i].getAracTescilDurumu().toString()+"===\n\n"
										+"Tescil Íli    : "+arac[i].getAracTescilYeri().toString()+"\n"
										+"Ruhsat Sahibi : "+arac[i].getRuhsatSahibi().toString()+"\n"
										+"Ruhsat Yili   : "+arac[i].getRuhsatTarihi()+"\n"
										+"Arac Markasi  : "+arac[i].getAracMarkasi().toString()+"\n"
										+"Arac Tipi     : "+arac[i].getAracTipi().toString()+"\n"
										+"Arac Rengi    : "+arac[i].getAracRengi().toString());
				eslesme=true;
				break;
			}
		}
		if (eslesme) {
			System.out.println("\n"+girilenPlaka+" plakali aracin durumu..:  \n\n"+sorgulanan);
			
		}
		else
	
		System.out.println("Girilen plaka veri tabaninda bulunamadi !!!");
		
		scan.close();

	}

}
