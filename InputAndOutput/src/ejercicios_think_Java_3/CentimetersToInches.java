package ejercicios_think_Java_3;

//----------------------------------

import java.util.Scanner;

public class CentimetersToInches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inch;
		double cm; 
		final double cmPerInch = 2.54;
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many inches? ");
		inch = in.nextInt();

		cm = inch * cmPerInch;
		System.out.print(inch + " in = ");
		System.out.println(cm + " cm");
			
		
		int feet, inches, remainder;
		final double CM_PER_INCH = 2.54;
		final int IN_PER_FOOT = 12;
			
		// prompt the user and get the value
		System.out.print("Exactly how many cm? ");
		cm = in.nextDouble();
			
		// convert and output the result
		inches = (int) (cm / CM_PER_INCH);
		feet = inches / IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;
		System.out.printf("%.2f cm = %d ft, %d in\n", //fijate que los %f(loat) y %d(ouble) se reemplazan con la variable correspondiente de más adelante, acordate que \n es un salto de linea 
		cm, feet, remainder);
		in.close();
	}

}
