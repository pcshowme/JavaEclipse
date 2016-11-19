

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// http://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner

		Scanner sc = new Scanner(System.in);
		int number;
		do {
		    System.out.println("Please enter a positive Integer!");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        sc.next(); // this is important!
		    }
		    number = sc.nextInt();
		} while (number <= 0);
		System.out.println("Thank you! Got " + number);
		
		System.out.println("Please enter a vowel, lowercase!");
		while (!sc.hasNext("[aeiou]")) {
		    System.out.println("That's not a vowel!");
		    sc.next();
		}
		String vowel = sc.next();
		System.out.println("Thank you! Got " + vowel);
		
	}
}