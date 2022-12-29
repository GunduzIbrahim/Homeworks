package homework2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String name, lastName;

		System.out.println("Lutfen adinizi girin : ");
		name = scan.nextLine();
		System.out.println("Lutfen soyadinizi girin : ");
		lastName = scan.nextLine();
		System.out.println("\nIsminiz : " + name + "\nSoyisminiz : " + lastName	+ "\nKursumuza katiliminiz alinmistir, tesekkur ederiz");
		
		/*
		System.out.println("\nIsminiz : " + name);
		System.out.println("Soyisminiz : " + lastName);
		System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz");
		*/
		
	}

}