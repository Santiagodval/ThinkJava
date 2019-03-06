package ejercicios_think_Java_3;

import java.util.Scanner;

public class ConvertSecondsToHMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int segundos, horas, minutos;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Insert seconds: ");
		segundos = in.nextInt();
		
		horas = segundos / 3600;
		System.out.printf("%d hora/s \n",horas);
		
		segundos = segundos % 3600;
		minutos = segundos / 60;
		System.out.printf("%d minuto/s \n",minutos);
		
		segundos = segundos % 60;
		
		System.out.printf("%d segundo/s",segundos);
		
		in.close();
	}

}
