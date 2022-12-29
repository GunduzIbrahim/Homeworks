package homework6;

import java.util.Scanner;

public class Question1 {
	
	public static void main (String[] args) {
		
		/*
		 * 1.	E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri olduguna bakiniz. 
		 * 		Bir tane class olusturarak bu ozellikleri kullanan 15 tane urun hazirlayiniz. 
		 * 		(5 tanesi kullanicidan veri alinarak , 
		 * 		5 tanesi parametreli constructor kullanilarak, 
		 * 		5 tanesi bos constructor kullanilarak olmali)
		 */
		
		
		//========================================================
		//Kullanicidan veri alinarak urun olusturma.
		
		Scanner scan = new Scanner(System.in);
		
		Bisiklet bisiklet1 = new Bisiklet();
		Bisiklet bisiklet2 = new Bisiklet();
		Bisiklet bisiklet3 = new Bisiklet();
		Bisiklet bisiklet4 = new Bisiklet();
		Bisiklet bisiklet5 = new Bisiklet();
			
		System.out.println("Bisikletin markasini giriniz..:");
		bisiklet1.marka=scan.nextLine();
		System.out.println("Bisikletin Id'sini giriniz..");
		bisiklet1.id=scan.nextInt();
		scan.nextLine();
		System.out.println("Bisikletin tipini (elektrikli/erkek vb.) giriniz..:");
		bisiklet1.tipi=scan.nextLine();
		System.out.println("Bisikletin rengini giriniz..:");
		bisiklet1.renk=scan.nextLine();
		System.out.println("Bisikletin teker capini giriniz..");
		bisiklet1.tekerCapi=scan.nextInt();
		System.out.println("Bisikletin uretim yilini giriniz..");
		bisiklet1.uretimYili=scan.nextInt();
		System.out.println("Bisikletin fiyatini giriniz..");
		bisiklet1.fiyat=scan.nextDouble();
			
		System.out.println("\nBisikletin Markasi : "+bisiklet1.marka);
		System.out.println("Bisikletin Id'si : "+bisiklet1.id);
		System.out.println("Bisikletin tipi : "+bisiklet1.tipi);
		System.out.println("Bisikletin rengi : "+bisiklet1.renk);
		System.out.println("Bisikletin teker capi : "+bisiklet1.tekerCapi);
		System.out.println("Bisikletin uretim yili : "+bisiklet1.uretimYili);	
		System.out.println("Bisikletin fiyati : "+bisiklet1.fiyat+" €");
		
		//bisiklet2...bisiklet5 ayni sekilde..
		
		
			
		//========================================================
		//Parametreli Contructor olusturularak urun olusturma.
			
		Bisiklet bisiklet6= new Bisiklet("Batavus",6,"elektrikli/kadin","mavi", 28, 2020, 680);
		Bisiklet bisiklet7 = new Bisiklet("Gazelle",7,"kadin","kirmizi", 26, 2021, 683);
		Bisiklet bisiklet8 = new Bisiklet("Pegasus",8,"elektrikli/erkek","mavi", 28, 2022, 1280);
		Bisiklet bisiklet9 = new Bisiklet("Morena Premium",9,"erkek","gri", 28, 2010, 265);
		Bisiklet bisiklet10 = new Bisiklet("Jan Janssen",10,"elektrikli/kadin","beyaz", 28, 2018, 460);
		
		System.out.println("\nBisikletin Markasi : "+bisiklet6.marka);
		System.out.println("Bisikletin Id'si : "+bisiklet6.id);
		System.out.println("Bisikletin tipi : "+bisiklet6.tipi);
		System.out.println("Bisikletin rengi : "+bisiklet6.renk);
		System.out.println("Bisikletin teker capi : "+bisiklet6.tekerCapi);
		System.out.println("Bisikletin uretim yili : "+bisiklet6.uretimYili);	
		System.out.println("Bisikletin fiyati : "+bisiklet6.fiyat+" €");
		
		//bisiklet7...bisiklet10 ayni sekilde..
		
		
		
		//========================================================
		//Bos Constructor kullanarak urun olusturma.
		
		Bisiklet bisiklet11 = new Bisiklet();
		Bisiklet bisiklet12 = new Bisiklet();
		Bisiklet bisiklet13 = new Bisiklet();
		Bisiklet bisiklet14 = new Bisiklet();
		Bisiklet bisiklet15 = new Bisiklet();
		
		bisiklet11.marka="Babboe Big";
		bisiklet11.id = 12;
		bisiklet11.tipi="elektrikli/kadin";
		bisiklet11.renk="siyah/gri";
		bisiklet11.tekerCapi=26;
		bisiklet11.uretimYili=2022;
		bisiklet11.fiyat=2850;
		
		System.out.println("\nBisikletin Markasi : "+bisiklet11.marka);
		System.out.println("Bisikletin Id'si : "+bisiklet11.id);
		System.out.println("Bisikletin tipi : "+bisiklet11.tipi);
		System.out.println("Bisikletin rengi : "+bisiklet11.renk);
		System.out.println("Bisikletin teker capi : "+bisiklet11.tekerCapi);
		System.out.println("Bisikletin uretim yili : "+bisiklet11.uretimYili);	
		System.out.println("Bisikletin fiyati : "+bisiklet11.fiyat+" €");
		
		//bisiklet12...bisiklet15 ayni sekilde..
		
		
	}

}