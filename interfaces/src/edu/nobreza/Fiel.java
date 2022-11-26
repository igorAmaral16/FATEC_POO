package edu.nobreza;

public interface Fiel {
	
	static void rezar() {
		System.out.println();
	}
}


   class Bispo extends Padre implements Fiel{
	   void rezar() {
		   System.out.println("Rezando!");
	   }
}
