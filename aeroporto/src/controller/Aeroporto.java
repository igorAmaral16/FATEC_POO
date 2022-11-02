package controller;

public class Aeroporto {
	
	private String nome;
	private int codAeroporto;
	private boolean abertoFechado;
	
	public Aeroporto(String nome, int codAeroporto, boolean abertoFechado) {
		
		this.nome = nome;
		this.codAeroporto = codAeroporto;
		this.abertoFechado = abertoFechado;
	}
	
	public boolean estaAbertoFechado() {

		 if (this.abertoFechado == true) {
			
			System.out.println("Aeroporto aberto");
		} else {
			
			System.out.println("Aeroporto fechado");
		}
		 
		return this.abertoFechado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}