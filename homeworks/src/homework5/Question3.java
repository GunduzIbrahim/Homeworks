package homework5;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		/*
		 * 3) Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin. 
		 * integer donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun. 
		 * Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin. 
		 * Islemin sonucunu main method’ dan verilen komutla yazdirin.
		 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Ussu alinacak taban sayiyi giriniz...: ");
		int tabanSayisi = scan.nextInt();

		System.out.println("Taban sayiya uygulanacak kuvveti giriniz..: ");
		int kuvvetSayisi = scan.nextInt();
		
		System.out.println(tabanSayisi+" uzeri "+kuvvetSayisi+" isleminin sonucu...: "+ usHesapla(tabanSayisi,kuvvetSayisi));
		scan.close();

	}
	
	public static int usHesapla (int tabanSayisi, int kuvvetSayisi) {
		
		
		int islemSonucu = 0;

		if ((kuvvetSayisi>0) && (tabanSayisi!=0)){
			int sayac=1;
			for(int i=0;i<kuvvetSayisi;i++){
				sayac = sayac * tabanSayisi;
				islemSonucu=sayac;
			}
		}
		else if ((kuvvetSayisi<0) && (tabanSayisi==0)) System.out.println("Bu islem tanimsizdir..");
		else if ((kuvvetSayisi==0) && (tabanSayisi==0)) System.out.println("Bu islem belirsizdir..");
		else if ((tabanSayisi==1) && (kuvvetSayisi!=0)) System.out.println(tabanSayisi+" uzeri "+kuvvetSayisi+" isleminin sonucu (1)'dir.");
		else if ((tabanSayisi!=0) && (kuvvetSayisi==0)) System.out.println(tabanSayisi+" uzeri "+kuvvetSayisi+" isleminin sonucu (1)'dir.");
		else if ((kuvvetSayisi>0) && (tabanSayisi==0)) System.out.println(tabanSayisi+" uzeri "+kuvvetSayisi+" isleminin sonucu (0)'dir.");
		else System.out.println("Kuvvet sayisi (0)'dan kucuk olamaz..");

		return islemSonucu;
	}
	

}