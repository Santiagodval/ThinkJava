package ejercicios_think_java_5;

public class Baffle {
	
		public static void baffle(String blimp) {
			System.out.println(blimp);//5
			zippo("ping", -5);//6
		}
		
		public static void zippo(String quince, int flag) {
			if (flag < 0) {//2
			
				System.out.println(quince + " zoop");//7
			
			} else {
		
				System.out.println("ik");//3
				baffle(quince);//4
				System.out.println("boo-wa-ha-ha");//8
				
			}
		
		}
		
		public static void main(String[] args) {
			
			zippo("rattle", 13); //1
		
		}
		

}
