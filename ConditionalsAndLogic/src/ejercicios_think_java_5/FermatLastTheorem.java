package ejercicios_think_java_5;

public class FermatLastTheorem {
	
	public static void  checkFermat(double a, double b, double c, double n) {
		
		double AB = Math.pow(a, n) + Math.pow(b, n);
		double CN = Math.pow(c, n);
		if(AB == CN) {
			
			System.out.println("Holy smokes, Fermat was wrong!");
			
		}
		else
		{
			System.out.println("No, that doesn’t work.");
		}
		
	}
	
	public static void main(String[] args) {
		
		 checkFermat(4.0,2.0,1.0,3.0);
		
	}

}
