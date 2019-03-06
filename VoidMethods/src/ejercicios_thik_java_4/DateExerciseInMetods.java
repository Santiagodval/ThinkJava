package ejercicios_thik_java_4;

public class DateExerciseInMetods {
	
	public static void printAmerican(String day, String month, short date, short year) {
		
		System.out.println("American format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		
	}
	
	public static void printEuropean(String day, String month, short date, short year) {
		
		System.out.println("European format:");
		System.out.println(day + " " + date + " " + month + " " + year);

		
	}
	
	public static void main(String[] args) {
		
		String day = "Sunday", month = "March";
		short date = 4, year = 2019;
		
		printAmerican(day,month,date,year);
		printEuropean(day,month,date,year);
		
	}

}
