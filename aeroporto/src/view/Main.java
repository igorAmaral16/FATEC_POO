package view;

import controller.Aeronave;
import controller.Aeroporto;
import controller.Passageiro;
import controller.Piloto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Piloto p1 = new Piloto("Igor", 12345, 54321, 1111, 900.0);
		//Piloto p2 = new Piloto("Joaozinho", 54321, 12345, 2222, 900.0);
		
		Aeronave a1 = new Aeronave(123, "\"Aviaozinho do Igor\"", 10);
		//Aeronave a2 = new Aeronave(123, "\"Aviaozinho do Joaozinho\"", 15);
		
		Passageiro pa1 = new Passageiro("Mariazinha", 12211, 121212, 23, "Classe A", true);
		//Passageiro pa2 = new Passageiro("Cleitinho", 12211, 121212, 23, "Classe A", true);
		
		Aeroporto ae1 = new Aeroporto("Congonhas", 001, true);
		//Aeroporto ae2 = new Aeroporto("Guarulhos", 002, true);
		
		System.out.println("Os passageiros " + pa1.getNome() 
		+ " pegaram o aviao " + a1.getNome() 
		+ " \ncom o numero de calda: " + a1.getNmrCalda()
		+ " \nQuem esta pilotando esse aviao, eh o: " + p1.getNome()
		+ " \ncom " + a1.getQtdPassageiros() + " passageiros abordo"
		+ " no aeroporto " + ae1.getNome()
		+ " " + ae1.estaAbertoFechado());
	}

}