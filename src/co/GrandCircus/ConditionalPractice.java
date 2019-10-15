package co.GrandCircus;

import java.util.Scanner;

public class ConditionalPractice {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter an integer between 1 and 100");
		int number = scnr.nextInt();

		if (number % 2 != 0 && number > 60) {
			System.out.println("Odd and over 60");
		} else if (number % 2 == 0 && number > 60) {
			System.out.println("Even " + number);
		} else if (number % 2 == 0 && (number >= 26 && number <= 60)) {
			System.out.println("Even");
		} else if (number % 2 == 0 && (number >= 2 && number < 25)) {
			System.out.println("Even and less than 25");
		} else {
			System.out.println(number + "Odd");
		}
		
		scnr.close();
	}

}
