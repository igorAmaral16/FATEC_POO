package view;

import controller.Carro;
import controller.Celular;
import controller.Pessoa;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Pessoa  p1 = new Pessoa();
		Pessoa	p2 = new Pessoa();
		
		Celular c1 = new Celular();
		Celular	c2 = new Celular();
		
		Carro  ca1 = new Carro();
		Carro  ca2 = new Carro();
		
		p1.nome = "Igor";
		p1.altu = 1.80;
		p1.cor	= "Moreno";
		p1.peso = 75;
		p1.RG	= "12345678";
		
		p2.nome = "Fernanda";
		p2.altu = 1.65;
		p2.cor	= "Moreno";
		p2.peso = 68;
		p2.RG	= "12345677";
		
		
		c1.cor 		  = "Azul";
		c1.expessura  = 1.23;
		c1.marca 	  = "Samsung";
		c1.memoria	  = 64;
		c1.tamanhoTela= 7;
		
		c2.cor 		  = "Rosa";
		c2.expessura  = 1.50;
		c2.marca 	  = "Samsung";
		c2.memoria	  = 23;
		c2.tamanhoTela= 6.5;
		
		ca1.cor   	  = "roxo";
		ca1.marca 	  = "BMW";
		ca1.modelo	  = "R3";
		ca1.nmrChassi = 12345678;
		ca1.qtdPortas = 4;
		
		ca2.cor   	  = "Azul";
		ca2.marca 	  = "Fiat";
		ca2.modelo	  = "Touro";
		ca2.nmrChassi = 12345677;
		ca2.qtdPortas = 4;
		
		System.out.println("Meu nome  " + p1.nome + " e minha altura � " + p1.altu + " e eu ");
		p1.andar();
		System.out.println("Meu celular � " + c1.cor + " com " + c1.expessura + " de expessura" + " e eu");
		c1.ligar();
		System.out.println("Meu carrro � um " + ca1.marca + " com a cor " + ca1.cor + " e ele ");
		ca1.andar();
		
		System.out.println("\n\n");
		
		System.out.println("Meu nome  " + p2.nome + " e minha altura � " + p2.altu + " e eu ");
		p2.andar();
		System.out.println("Meu celular � " + c2.cor + " com " + c2.expessura + " de expessura" + " e eu");
		c2.ligar();
		System.out.println("Meu carrro � um " + ca2.marca + " com a cor " + ca2.cor + " e ele ");
		ca2.andar();
		
	}

}
