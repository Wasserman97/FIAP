package br.com.fiap.beans;

public class PessoaFisica extends Pessoa {
	
	//Variaveis
	private String rg;
	private String cpf;
	
	//construtor vazio
	public PessoaFisica() {
		super();
	}
//Construtor cheio
	public PessoaFisica(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}
	
	//Metodo construtor cheio com herança
public PessoaFisica(String nome, String email, int idade, double renda, String rg, String cpf) {
	super(nome, email, idade, renda);
	this.rg = rg;
	this.cpf = cpf;
}
	//Setters & Getters
public String getRg() {
	return rg;
}
public void setRg(String rg) {
	this.rg = rg;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}

//Sobre Escrita
public String identificador() {
	return "Pf";
}
	
}
