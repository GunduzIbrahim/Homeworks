package homework2;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		double mile, km;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your trip's mile (decimal): ");
		mile = scan.nextDouble();
		km = mile * 1.6;
		System.out.println("Mileage equivalent of the value you entered : " + km);

	}

}