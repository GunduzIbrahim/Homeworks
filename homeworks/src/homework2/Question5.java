package homework2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double side, perimeter, area;
		
		System.out.println("Please enter the side of square (cm): ");
		side = scan.nextDouble();
		perimeter = side * 4;
		area = side * side;
		System.out.println("Perimeter of square is : " + perimeter + " cm" + " \nArea of square is : " + area+ " cm");
		

	}
}