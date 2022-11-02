package controller;

public class Passageiro extends Pessoa{
	
	private int nmrPoltrona;
	private String classe;
	private boolean passagem;

	public Passageiro(String nome, int CPF, int RG, int nmrPoltrona, String classe, boolean passagem) {
		super(nome, CPF, RG);
		// TODO Auto-generated constructor stub
		
		this.nmrPoltrona = nmrPoltrona;
		this.classe = classe;
		this.passagem = passagem;
		
		
	}
	
	public void sentarNaPoltrona() {
		System.out.println("Estou sentando na poltrona");
	}

}