package exercises_2;

public class Time_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float hour = 14F, minute = 34F, second = 44F;
		float SegMN = ((hour * 3600) + (minute * 60) + (second));
		
		System.out.println("Pasaron " + SegMN + " segundos desde la media noche");
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		
		System.out.println("Faltan " + (86400 - SegMN) + " segundos hasta la media noche");
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		
		System.out.print("Paso un ");
		System.out.printf("%2.2f",((((SegMN)) / 86400) * 100)); 
		System.out.println("% del dia");
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		
		float hourA = 16F, minuteA = 44F, secondA = 25F;
		float SegMNA = ((hourA * 3600) + (minuteA * 60) + (secondA));
		
		System.out.println("Pasaron " + (SegMNA - SegMN) + " segundos desde que empecé el ejercicio, ponele");
		
	}

}
















