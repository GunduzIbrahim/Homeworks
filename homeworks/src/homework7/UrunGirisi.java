package homework7;

import java.util.Arrays;
import java.util.Scanner;

public class UrunGirisi {
	
	static String urunler [] = new String[5];

	public static void main(String[] args) {
		
		/*
		 * 4) Iki farkli class olusturun. Birinci klasta kullanicidan; 
		 * bir alisveris sitesinden 5 adet urunu ucretsiz satin alabilme hakki kazandigini soyleyin ve 
		 * bu 5 urunu isteyin(main method icinden). Ikinci class’ da ise 
		 * bu urunleri bir array adi altinda listeleyen, nonstatic, 
		 * String array donuslu, 5 argumanli bir method olusturunuz.
		 * Birinci class’ ta method call uzerinden alacaginiz array verisinin elemanlarini tektek yazdirin. 
		 * Daha sonra bu arrayin icindeki elemanlari alfabetik siraya gore yazdirin. 
		 * Arrayin 3. Index’indeki elemani istediginiz bir urunle degistirin. 
		 * Degistirdiginiz urunun array icinde olup olmadigini sorgulayin, 
		 * eger urun arrayin icinde ise “degisiklik yaptiginiz urun listeye eklenmistir.” Ibaresini consol’a yazdirin. 
		 */
		
		Scanner scan = new Scanner (System.in);

		System.out.println("!!!...winnertechno.com sitesinden 5 adet ucretsiz teknoloji urun kazandiniz...!!!");
		System.out.println("Bes adet teknoloji urunu giriniz..: ");

		for (int i=0; i<5;i++) {
			
			urunler[i] = scan.nextLine();
			
		}
		System.out.println();
		
		UrunListele listele = new UrunListele();
		
		String liste[]= listele.urunListele();
		
		for (int i=0; i<5; i++) {
			
			System.out.println(liste[i]);
			
		}
		
		System.out.println();
		Arrays.sort(liste);
		System.out.println(Arrays.toString(liste));
		
		System.out.println();
		
		liste[3]="game console";
		
		System.out.println(Arrays.toString(liste));
		System.out.println();
		
		System.out.println((Arrays.binarySearch(liste, "game console")));
		if((Arrays.binarySearch(liste, "game console")<=4)) {
			
			System.out.println("Degisiklik yaptiginiz urun listeye eklenmistir.");			
			
		}
		scan.close();
	}

}
