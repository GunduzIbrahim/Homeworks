package homework8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework8_3 {

	public static void main(String[] args) {
		
		/*
		 * Soru 1:Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini
		 *  For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 */
		
		List<Integer> sayiListesi = new ArrayList<>(Arrays.asList(4,8,5,7,6));
		int carpim=1;
		for (int sayi:sayiListesi) {
			carpim = carpim*sayi;
		}
		System.out.println(""+sayiListesi+" dizisindeki elemanlarin carpimi : "+carpim);
		System.out.println();
		/*
		 * Soru 2:Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini 
		 * For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 */
		
		List<Integer> sayiListesi2 = new ArrayList<>(Arrays.asList(4,8,7,2));
		int karesi=1, toplam=0;
		for (int sayi:sayiListesi2) {
			karesi = sayi*sayi;
			toplam+=karesi;
		}
		System.out.println(""+sayiListesi2+" dizisindeki elemanlarin karelerinin toplami : "+toplam);
		System.out.println();
		/*
		 * Soru 3:iki String array olusturunuz ve bu array’lerdeki ortak elemanlari 
		 * For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		 * Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
		 */
		
		List<String> ogrenciSirasi = new ArrayList<>(Arrays.asList("kalem","defter","silgi","kitap","canta"));
		List<String> ogretmenMasasi = new ArrayList<>(Arrays.asList("ajanda","kitap","laptop","kalem"));
		List<String> ortakElemanlar = new ArrayList<>();
		
		
		for(String ogrenciGerecleri:ogrenciSirasi) {
			for (String ogretmenGerecleri:ogretmenMasasi) {
				
				if(ogrenciGerecleri==ogretmenGerecleri){
					ortakElemanlar.add(ogrenciGerecleri);
				}
			}
		}
		if (ortakElemanlar.isEmpty()==false) {
			System.out.println(""+ogrenciSirasi+" ve "+ogretmenMasasi+" listelerinin ortak elemanlari : "+ortakElemanlar);
		}
			else System.out.println(""+ogrenciSirasi+" ve "+ogretmenMasasi+" listelerinin ortak elemanlari yok!!!");
		
		System.out.println();
		
		/*
		 * Soru 4:Bir String olusturunuz, bu String’deki character’leri 
		 * for-each loop kullanarak yazdiriniz. ipucu: split()
		 */
		
		String ifade = "olmasaydi sonumuz boyle...";
		String ifadeKarakterleri []= ifade.split("");
		for(String character:ifadeKarakterleri) {
			char karakterler[]=character.toCharArray();
			System.out.print(Arrays.toString(karakterler));
		}
	}
}
