package homework5;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * 5) Kullanicidan baslangic ve bitis degerlerini alin. 
		 * Baslangic degeri ve bitis degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen sayisal bir baslangic degeri giriniz..:");
		int basDeger = scan.nextInt();
		System.out.println("Lutfen sayisal bir bitis degeri giriniz..:");
		int sonDeger = scan.nextInt();
		
		System.out.print("\n"+basDeger);
		
		while (basDeger<=sonDeger) {
			int aradakiCiftler = basDeger;
			if (aradakiCiftler%2==0) {
			
				System.out.print("-"+aradakiCiftler);
				
			}
			basDeger++;
		}
		if (sonDeger%2!=0)
		System.out.print("-"+sonDeger);
		scan.close();
	}

}