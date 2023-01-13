package homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Isci extends Muhasebe{
	
	public Isci (int id, String isim, String soyIsim, String adres, String telefon, int saatlikUcret, String statu, int maas) {
		super(id, isim, soyIsim, adres, telefon, saatlikUcret, statu, maas);
		
	}
	
	public static void main(String[] args) {
		
		Muhasebe calisan = new Muhasebe();
		
		
		calisan.id = calisan.idAtamaIsci();
		calisan.isim = "Muzaffer";
		calisan.soyIsim = "TOZLU";
		calisan.adres = "Istanbul\\ Bagcilar";
		calisan.telefon = "0212 111 22 33";
		calisan.saatlikUcret = 45;
		calisan.statu = "Ustabasi";
		calisan.maas = calisan.maasHesapla();
		Isci isci1 = new Isci(calisan.id, calisan.isim, calisan.soyIsim, calisan.adres, calisan.telefon, calisan.saatlikUcret, calisan.statu, calisan.maas);

		
		
		calisan.id = calisan.idAtamaIsci();
		calisan.isim = "Zehra";
		calisan.soyIsim = "KAYALI";
		calisan.adres = "Istanbul\\ Zeytinburnu";
		calisan.telefon = "0212 222 33 44";
		calisan.saatlikUcret = 46;
		calisan.statu = "Teknisyen";
		calisan.maas = calisan.maasHesapla();
		Isci isci2 = new Isci(calisan.id, calisan.isim, calisan.soyIsim, calisan.adres, calisan.telefon, calisan.saatlikUcret, calisan.statu, calisan.maas);

		

		calisan.id = calisan.idAtamaIsci();
		calisan.isim = "Ferdi";
		calisan.soyIsim = "KULA";
		calisan.adres = "Istanbul\\ Bayrampasa";
		calisan.telefon = "0212 333 44 55";
		calisan.saatlikUcret = 44;
		calisan.statu = "Bakimci";
		calisan.maas = calisan.maasHesapla();
		Isci isci3 = new Isci(calisan.id, calisan.isim, calisan.soyIsim, calisan.adres, calisan.telefon, calisan.saatlikUcret, calisan.statu, calisan.maas);

		
		Memur.memurlar();
		
		List<Isci> isciler = new ArrayList<>(Arrays.asList(isci1,isci2,isci3));
		
//		for(Isci isci:isciler) {
//			
//			System.out.println(isci.id+"\n"+isci.isim+"\n"+isci.soyisim+"\n");
//				.
//				.
//				.
//		}
		
		for (int i=0;i<isciler.size();i++) {
			
			System.out.println((i+1)+".Iscinin \n=========\nId no    : "+isciler.get(i).id);
			System.out.println("Adi      : "+isciler.get(i).isim);
			System.out.println("Soyadi   : "+isciler.get(i).soyIsim);
			System.out.println("Adresi   : "+isciler.get(i).adres);
			System.out.println("Telefonu : "+isciler.get(i).telefon);
			System.out.println("Statusu  : "+isciler.get(i).statu);
			System.out.println("Maasi    : "+isciler.get(i).maas+" TL");
			System.out.println();
			
		}
	}
	
}
