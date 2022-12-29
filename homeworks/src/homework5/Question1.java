package homework5;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {

		/*
		 * 1)Kullanicidan e mail hesabini girmesini isteyiniz. 
		 * Bu e mail’ i olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara gore e mail kontrolu yapiniz. 
		 * -@ isareti icermiyorsa “gecersiz email” yazdirin
		 * -@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin
		 * -@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz” yazdirin.
		 */
		Scanner scan = new Scanner(System.in);
		 
		for(;;)
		{
		System.out.println("Lutfen e-mail hesabinizi giriniz..:");
		String girilenMail = scan.nextLine();
		
		eMail(girilenMail);
		
		if (girilenMail.endsWith("@gmail.com")) 
			break;
		}
	}
	public static String eMail (String mailGir) {

		if (!mailGir.contains("@")) 
			System.out.println("Gecersiz email..\n");
		else if (!mailGir.contains("@gmail")) 
			System.out.println("Lutfen gmail adresinizi girin..\n");
		else if (!mailGir.endsWith("@gmail.com")) 
			System.out.println("Yazimda bir sorun var, maili kontrol ediniz..\n");
		else System.out.println("Giris basarili..\n");
		
		return mailGir;
	}

}