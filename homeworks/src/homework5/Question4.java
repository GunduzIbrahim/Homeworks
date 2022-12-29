package homework5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		/*
		 * 4) Kullanıcıdan aldıgınız 5 basamaklı sayının 
		 * rakamlarının toplamını yazdıran programi for döngüsü ile yazınız.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen 5 basamakli bir sayi giriniz..:");
		int girilenSayi = scan.nextInt();
		
		if ((girilenSayi<100000)&&(girilenSayi>=10000) || (girilenSayi>-100000)&&(girilenSayi<=-10000))
		{
		int rakamToplami =0;
		int donenSayi = girilenSayi;
		for( ;donenSayi!=0; ){
			
			rakamToplami += donenSayi % 10;
			donenSayi /= 10;
		}	
		if (rakamToplami<0) {
			rakamToplami *=-1;
		}
		System.out.println("Girmis oldugunuz "+girilenSayi+" sayisinin rakamlari toplami : " +rakamToplami);
		}
		else System.out.println("5 basamakli sayi girmediniz..");
		scan.close();

	}
	
}