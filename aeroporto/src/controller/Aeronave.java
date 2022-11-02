package controller;

public class Aeronave {
	
	private int nmrCalda;
	private int qtdPassageiros;
	private String nome;
	
	
	public Aeronave(int nmrCalda, String nome, int qtdPassageiros) {

		this.nmrCalda = nmrCalda;
		this.setNome(nome);
		this.qtdPassageiros = qtdPassageiros;
		
	}
	
	public void decolar() {
		
		System.out.println("Estou decolando");
	}

	public int getNmrCalda() {
		return nmrCalda;
	}

	public void setNmrCalda(int nmrCalda) {
		this.nmrCalda = nmrCalda;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}