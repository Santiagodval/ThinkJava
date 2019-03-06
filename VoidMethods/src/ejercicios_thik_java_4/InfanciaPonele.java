package ejercicios_thik_java_4;

import java.util.Scanner;

public class InfanciaPonele {
	
	public static void zool(int number, String pet, String street) {
		
		System.out.println("El " + (number - 2) +" me gusta más");
		System.out.println(pet + " es la mejor mascosa para ti para mi.");
		System.out.println(street + "con más baches que la cara del pity.");
		
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int number;
		String pet, street;
		
		System.out.printf("Type your super number: ");
		number = in.nextInt();
		in.nextLine();
		System.out.printf("\nType the name of your pet: ");
		pet = in.nextLine();
		
		System.out.printf("\nType the name of the street where you grow up: ");
		street = in.nextLine();
		
		zool(number, pet, street);
		
		in.close();
	}

}
