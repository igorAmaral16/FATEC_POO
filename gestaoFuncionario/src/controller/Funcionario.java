package controller;

import java.util.Date;

public class Funcionario {
	
private long id;
private String nome;
private String matricula;
private Date admissao;
private Date demissao;
private float salario;
private String horario;


//---------------------------------------------------------------------------------
public long getId() {
	return this.id;
}

public void setId(long valor) {
	this.id = valor;
}

public String getNome() {
	return this.nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getMatricula() {
	return this.matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public Date getAdmissao() {
	return this.admissao;
}

public void setAdmissao(Date admissao) {
	this.admissao = admissao;
}

public Date getDemissao() {
	return this.demissao;
}

public void setDemissao(Date demissao) {
	this.demissao = demissao;
}

public float getSalario() {
	return this.salario;
}

public void setSalario(float salario) {
	this.salario = salario;
}

public String getHorario() {
	return this.horario;
}

public void setHorario(String horario) {
	this.horario = horario;
}
//-------------------------------------------------------------------------------------

void exibir() {
	System.out.println("Dados do Funcionario(a) \n" + toString());
	
}

public String toString() { 
	return "RA: " + this.getMatricula() + 
			"\tNome: " + this.getNome() + 
			"\tAdmissao: " + this.getAdmissao() +
			"\tDemissao: " + this.getDemissao() +
			"\tSalario: " + this.getSalario() +
			"\tHorario: " + this.getHorario();
}



}

