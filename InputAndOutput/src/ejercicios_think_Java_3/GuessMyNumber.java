package ejercicios_think_Java_3;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int guesed;
		
		// pick a random number
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1 and 100\r\n" + 
				"(including both). Can you guess what it is?");
		
		System.out.print("Type a number: ");
		guesed = in.nextInt();
		
		System.out.printf("Your guess is: %d\n", guesed);
		
		System.out.printf("The number I was thinking of is: %d\n", number);
		
		System.out.printf("You where of by: %d\n", number - guesed);
		
		in.close();
	}
}
