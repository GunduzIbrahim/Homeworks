package homework11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*							Personel
 * 								|
 * 							Muhasebe
 * 								|
 * 							---------
 * 							|		|	
 * 						  Memur	  Isci
 * 
 *  
 *  2) Yukaridaki hiyerarsik duzene gore multi-level inheritance classlarini olusturunuz.
 *  •	Personel classina class seviyesinde id,isim,soyisim,address ve telefon datalaarinin deklerasyonunu yapin. 
 * 		Id atamasi, idAtama() methodunda olusturacaginiz programla yapilacak olup her calisana farkli bir id verilecektir. 
 * 		Id’ ler 6 basamakli bir sayi olarak tanimlanacaktir.  
 *  •	Muhasebe classina saatlikUcret, statu ve maas datalarinin deklerasyonunu yapin. maasHesapla() methodu olusturun.
 *  	Maas hesaplamak icin (maas=saatlikUcret*8*30) formulunu kullanin. 
 *  	Formuldeki 8 rakami gunluk calisma saatini, 30 ise bir aydaki otuz is gununu temsil etmektedir.	
 *  •	Parent (Super) classlardaki veriable’ lari kullanarak Isci classindan 3 adet isci olusturun. 
 *  	Olusturulan iscilerin tum bilgilerini array liste aktarin ve daha sonra consol’ a yazdirin.
 *  •	Parent (Super) classlardaki veriable’ lari kullanarak Memur classindan 3 adet memur olusturun. 
 *  	Olusturulan memurlarin tum bilgilerini array liste aktarin ve daha sonra consol’ a yazdirin.

 *  
 */



public class Personel {
	
	public int id;
	public String isim;
	public String soyisim;
	public String adres;
	public String telefon;
	public static int idAtaMemur=123456;
	public static int idAtaIsci=456789;
	
	public int idAtamaMemur() {
		
//		int randomNumber;
//		Random random = new Random();
//		randomNumber = random.nextInt(899999) + 100000;
//		idAta=randomNumber;
		this.id=idAtaMemur;
		idAtaMemur++;
		return id;
	}
public int idAtamaIsci() {
		
//		int randomNumber;
//		Random random = new Random();
//		randomNumber = random.nextInt(899999) + 100000;
//		idAta=randomNumber;
		this.id=idAtaIsci;
		idAtaIsci++;
		return id;
	}
}

	
	

