package homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Memur extends Muhasebe {
	
	public Memur (int id, String isim, String soyIsim, String adres, String telefon, int saatlikUcret, String statu, int maas) {
		super(id, isim, soyIsim, adres, telefon, saatlikUcret, statu, maas);
		
	}

	public static void memurlar ()  {
		
		Muhasebe calisan = new Muhasebe();
		
		
		calisan.id = calisan.idAtamaMemur();
		calisan.isim = "Saffet";
		calisan.soyIsim = "ZORLU";
		calisan.adres = "Istanbul\\Besiktas";
		calisan.telefon = "0212 012 34 56";
		calisan.saatlikUcret = 75;
		calisan.statu = "Buro Sefi";
		calisan.maas = calisan.maasHesapla();
		Memur memur1 = new Memur(calisan.id, calisan.isim, calisan.soyIsim, calisan.adres, calisan.telefon, calisan.saatlikUcret,calisan.statu, calisan.maas);
		
		
		calisan.id = calisan.idAtamaMemur();
		calisan.isim = "Kayra";
		calisan.soyIsim = "COBANOGLU";
		calisan.adres = "Istanbul\\Kadikoy";
		calisan.telefon = "0216 032 10 01";
		calisan.saatlikUcret = 71;
		calisan.statu = "Buro Memuru";
		calisan.maas = calisan.maasHesapla();
		Memur memur2 = new Memur(calisan.id, calisan.isim, calisan.soyIsim, calisan.adres, calisan.telefon, calisan.saatlikUcret,calisan.statu, calisan.maas);

		
		
		calisan.id = calisan.idAtamaMemur();
		calisan.isim = "Iclal";
		calisan.soyIsim = "KARABAYIR";
		calisan.adres = "Istanbul\\Mecidiyekoy";
		calisan.telefon = "0212 789 99 88";
		calisan.saatlikUcret = 70;
		calisan.statu = "Asistan";
		calisan.maas = calisan.maasHesapla();
		Memur memur3 = new Memur(calisan.id, calisan.isim, calisan.soyIsim, calisan.adres, calisan.telefon, calisan.saatlikUcret,calisan.statu, calisan.maas);

		
		List<Memur> memurlar = new ArrayList<>(Arrays.asList(memur1,memur2,memur3));
				
//		for(Memur memur:memurlar) {
//			
//			System.out.println(memur.id+"\n"+memur.isim+"\n"+memur.soyisim+"\n");
//			.
//			.
//			.
//		}
		
		for (int i=0;i<memurlar.size();i++) {
			
			System.out.println((i+1)+".Memurun \n=========\nId no    : "+memurlar.get(i).id);
			System.out.println("Adi      : "+memurlar.get(i).isim);
			System.out.println("Soyadi   : "+memurlar.get(i).soyIsim);
			System.out.println("Adresi   : "+memurlar.get(i).adres);
			System.out.println("Telefonu : "+memurlar.get(i).telefon);
			System.out.println("Statusu  : "+memurlar.get(i).statu);
			System.out.println("Maasi    : "+memurlar.get(i).maas+" TL");
			System.out.println();
			
		}
		
		
		
	}
}
