package homework9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		/*
		 * 3.	Kullanicidan; Dersin adi, Vize1 notu, Vize2 notu, Final notu, 3 adet de sozlu sinav notlarini alin. 
		 * Bu notlari asagidaki sartlara gore tek bir method’ ta varargs kullanarak donem sonu not ortalamasi olarak gosteriniz.
		 * Sartlar;
		 * I.	Vizelerin ortalamasinin %30’ u
		 * II.	Final notunun %50’ si
		 * III.	Sozlu sinavlarin ortalamasinin %20’ si
		 */

		Scanner scan = new Scanner(System.in);
		
		String dersAdi;
		int vize1, vize2, vize3, finalNotu, sozlu1,sozlu2,sozlu3;
		
		System.out.println("Lutfen notlari girilecek dersin adini yaziniz : ");
		dersAdi = scan.nextLine();
		System.out.println("Lutfen 1. Vize notunu giriniz : ");
		vize1 = scan.nextInt();
		System.out.println("Lutfen 2. Vize notunu giriniz : ");
		vize2 = scan.nextInt();
		System.out.println("Lutfen 3. Vize notunu giriniz : ");
		vize3 = scan.nextInt();
		System.out.println("Lutfen Final notunu giriniz : ");
		finalNotu = scan.nextInt();
		System.out.println("Lutfen 3 adet sozlu notu giriniz : ");
		sozlu1 = scan.nextInt();
		sozlu2 = scan.nextInt();
		sozlu3 = scan.nextInt();
		
		System.out.print(dersAdi+ " dersinin donem sonu not ortalamasi :  " );
		ortalamaHesapla(vize1,vize2,vize3,finalNotu,sozlu1,sozlu2,sozlu3);
		
	}
	public static void ortalamaHesapla(int... not) {
		
		for (int i:not) {
		}
		double vizeOrt = ((not[0]+not[1]+not[2])/3);
		double finl = (not[3]*0.5);
		double sozluOrt = ((not[4]+not[5]+not[6])/3);
		double genelOrt = ((vizeOrt*30)/100)+finl+((sozluOrt*20)/100);
		DecimalFormat sadeceIki = new DecimalFormat("###.###");
		
		System.out.println(sadeceIki.format(genelOrt));
		
	}

}
