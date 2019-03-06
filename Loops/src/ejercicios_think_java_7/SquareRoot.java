package ejercicios_think_java_7;

import java.lang.Math;

public class SquareRoot {
	
	public static void aproximatedScuareRoot(double x, double a) {
		
		
		while(x < (Math.sqrt(a)) - 0.0001 || x > (Math.sqrt(a)) + 0.0001) {
			
			x = (x + a/x) / 2;
			
		}
		
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		double x = 6, a = 64;
		
		aproximatedScuareRoot(x, a);
			
	}

}