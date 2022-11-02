package controller;

public class Piloto extends Pessoa {
	
	private int nmrIdent;
	private boolean licensa;
	private double salario;

	public Piloto(String nome, int CPF, int RG, int nrmIdent, double salario) {
		super(nome, CPF, RG);
		// TODO Auto-generated constructor stub
		
		this.nmrIdent = nmrIdent;
		this.licensa = licensa;
		this.salario = salario;
		
		}
	
	public void pilotar() {
		
		System.out.println("O piloto " + this.getNome() + "Esta pilotando o aviao");

	} 

}