package homework8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework8_2 {
	
	

	public static void main(String[] args) {

		/* 
		 * 1)Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
		 */
		List<String> harfler = new ArrayList<>(Arrays.asList("A","C","E","F"));
		//harfListesi = Arrays.asList("A","C","E","F"); 
		System.out.println(harfler);
		System.out.println();
		
		
		/*
		 * 2)indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
		 * index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
		 * ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
		 */
		
		harfler.add("B");
		System.out.println(harfler);
		harfler.add(1, "L");
		System.out.println(harfler);
		System.out.println();
		
		
		/* 
		 * 3)set() methodu kullanarak, E’yi D yapiniz.
		 * ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
		 */
		
		harfler.set(3, "D");
		System.out.println(harfler);
		System.out.println();
		
		/* 
		 * 4)remove() methodu kullanarak, F’yi siliniz.
		 * ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
		 */
		
		harfler.remove(4);
		System.out.println(harfler);
		System.out.println();
		
		/* 
		 * 5)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
		 * ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
		 */
		
		Collections.sort(harfler);
		System.out.println(harfler);
		System.out.println();
		
		/* 
		 * 6)contains() methodu kullanarak, L’nin list’de var oldugunu ve 
		 * M’nin list’de var olmadigini dogrulayiniz.
		 */
		
		if (harfler.contains("L")) 
			System.out.println("'L' harfi listede mevcut");
			if (!harfler.contains("M"))
				System.out.println("'M' harfi listede mevcut degil");
			System.out.println();
		
		/* 
		 * 7)size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
		 */
			
		int listeElemanSayisi = harfler.size();
		System.out.println("Listedeki eleman sayisi: "+listeElemanSayisi);
		System.out.println();
		
		/* 
		 * 8)clear() methodu kullanarak, list’deki tum elemanlari siliniz.
		 */
		
		harfler.clear();
		System.out.println("'Clear' isleminden sonra istedeki yeni elemanlar: "+harfler);
		System.out.println();

	}

}
