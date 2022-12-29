package homework3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		// 1- Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan java kodunu
		// yazalım.
		// Not: if else kullanalım…

		Scanner scan = new Scanner(System.in);

		int sayi1, sayi2, sayi3;

		System.out.println("Lutfen 3 adet tamsayi giriniz..: ");
		sayi1 = scan.nextInt();

		sayi2 = scan.nextInt();

		sayi3 = scan.nextInt();

		if (sayi1 >= sayi2 && sayi1 >= sayi3)

			System.out.println("Girilen tam sayilarin en buyugu..: " + sayi1);

		else if (sayi2 >= sayi1 && sayi2 >= sayi3)

			System.out.println("Girilen tam sayilarin en buyugu..: " + sayi2);

		else

			System.out.println("Girilen tam sayilarin en buyugu..: " + sayi3);

	}

}