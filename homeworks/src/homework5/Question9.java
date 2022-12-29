package homework5;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {

		/*
		 * 9- Kullanicidan pozitif bir rakam girmesini isteyin ve 
		 * girilen rakama gore carpim tablosu olusturun. 
		 * Ornek,kullanici 3 girerse,
			1 2 3
			2 4 6
			3 6 9
			(ic ice for ile) [Zor seviye – Yapamazsaniz onemli deil.]
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir rakam giriniz...(0-9)");
		int girilenRakam = scan.nextInt();
		
		if (girilenRakam>=0 && girilenRakam<=9) {
			
			for (int i=1;i<=girilenRakam;i++) {
				
				for(int j=1;j<=girilenRakam;j++) {
					
					System.out.print(i*j+"\t");
				}
				System.out.println();
			}
		}
		else System.out.println("Rakam girmediniz..!");
		scan.close();
	}
}