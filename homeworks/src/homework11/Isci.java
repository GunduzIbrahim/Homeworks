package homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Isci extends Muhasebe{
	
	public static void main(String[] args) {
		
		Isci isci1 = new Isci();
		isci1.id = isci1.idAtamaIsci();
		isci1.isim = "Muzaffer";
		isci1.soyisim = "TOZLU";
		isci1.adres = "Istanbul\\ Bagcilar";
		isci1.telefon = "0212 111 22 33";
		isci1.saatlikUcret = 45;
		isci1.maas = isci1.maasHesapla();
		
		Isci isci2 = new Isci();
		isci2.id = isci2.idAtamaIsci();
		isci2.isim = "Zehra";
		isci2.soyisim = "KAYALI";
		isci2.adres = "Istanbul\\ Zeytinburnu";
		isci2.telefon = "0212 222 33 44";
		isci2.saatlikUcret = 46;
		isci2.maas = isci2.maasHesapla();
		
		Isci isci3 = new Isci();
		isci3.id = isci3.idAtamaIsci();
		isci3.isim = "Ferdi";
		isci3.soyisim = "KULA";
		isci3.adres = "Istanbul\\ Bayrampasa";
		isci3.telefon = "0212 333 44 55";
		isci3.saatlikUcret = 44;
		isci3.maas = isci3.maasHesapla();
		
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
			System.out.println("Soyadi   : "+isciler.get(i).soyisim);
			System.out.println("Adresi   : "+isciler.get(i).adres);
			System.out.println("Telefonu : "+isciler.get(i).telefon);
			System.out.println("Maasi    : "+isciler.get(i).maas+" TL");
			System.out.println();
			
		}
	}
	
	
	

}
