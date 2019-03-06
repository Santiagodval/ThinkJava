package ejercicios_think_Java_3;

import java.util.Scanner;

public class GradosAFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float C, F;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Incert the celcious to convert: ");
		C = (int)in.nextInt();
		
		F = C * 9/5 + 32;
		
		System.out.println(F);
		
		in.close();

	}

}
