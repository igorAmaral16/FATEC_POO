package controller;

public class Pessoa {
	
	private String nome = "";
	private int CPF;
	private int RG;
	
	
	public Pessoa (String nome, int CPF, int RG) {
		
		this.nome = nome;
		this.CPF = CPF;
		this.RG = RG;
		
	}
	
	public void entrarNoAviao() {
		
		System.out.println("O passageiro " + this.getNome() + " esta entrando no aviao");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}