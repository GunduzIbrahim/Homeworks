package homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
		
		Memur memur1 = new Memur();
		memur1.id = memur1.idAtamaMemur();
		memur1.isim = "Saffet";
		memur1.soyisim = "ZORLU";
		memur1.adres = "Istanbul\\Besiktas";
		memur1.telefon = "0212 012 34 56";
		memur1.saatlikUcret = 72;
		memur1.maas = memur1.maasHesapla();
		
		Memur memur2 = new Memur();
		memur2.id = memur2.idAtamaMemur();
		memur2.isim = "Kayra";
		memur2.soyisim = "COBANOGLU";
		memur2.adres = "Istanbul\\Kadikoy";
		memur2.telefon = "0216 032 10 01";
		memur2.saatlikUcret = 70;
		memur2.maas = memur2.maasHesapla();
		
		Memur memur3 = new Memur();
		memur3.id = memur3.idAtamaMemur();
		memur3.isim = "Iclal";
		memur3.soyisim = "KARABAYIR";
		memur3.adres = "Istanbul\\Mecidiyekoy";
		memur3.telefon = "0212 789 99 88";
		memur3.saatlikUcret = 73;
		memur3.maas = memur3.maasHesapla();
		
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
			System.out.println("Soyadi   : "+memurlar.get(i).soyisim);
			System.out.println("Adresi   : "+memurlar.get(i).adres);
			System.out.println("Telefonu : "+memurlar.get(i).telefon);
			System.out.println("Maasi    : "+memurlar.get(i).maas+" TL");
			System.out.println();
			
		}
	}
}
