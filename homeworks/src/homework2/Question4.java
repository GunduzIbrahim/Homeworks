package homework2;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long second, hour;

		System.out.println("Please enter your weekly working hours : ");
		hour = scan.nextLong();
		second = hour * 3600;
		System.out.println("Your weekly working time of " + hour + " hours is : " + second + " seconds");

	}

}