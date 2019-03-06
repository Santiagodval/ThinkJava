package ejercicios_think_java_5;

public class BeersOnTheWall {
	
	public static void song(byte bottles) {
		
		if(bottles > 0) {
			
		firstVerse(bottles);
		secondVerse(bottles);
		tirthVerse(bottles);
		bottles--;
		firstVerse(bottles);
		
		song((byte) (bottles));
		}
		else {
			System.out.printf("No bottles of beer on the wall,\r\n" + 
					"no bottles of beer,\r\n" + 
					"ya’ can’t take one down, ya’ can’t pass it around,\r\n" + 
					"’cause there are no more bottles of beer on the wall!");	
		}
		
	}
	
	public static void firstVerse(byte bottles) {
		
			System.out.println(bottles + " bottles of beer on the wall,");
			
			
	}
	
	public static void secondVerse(byte bottles) {		
		
			System.out.println(bottles + " bottles of beer");		
			
					
	}
	
	public static void tirthVerse(byte bottles) {						
			
			System.out.println("ya’ take one down, ya’ pass it around,");			
					
	}
	
	public static void forthVerse(byte bottles) {
		
		System.out.println(bottles + " bottles of beer on the wall,");
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		byte bottles = 99;		
		song(bottles);
		
	}


}
