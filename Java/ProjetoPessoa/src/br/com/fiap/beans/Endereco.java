package br.com.fiap.beans;

public class Endereco {
	//Variaveis
	private String logradouro;

	
	//Construtor vazio
	public Endereco() {
		super();
	}
	//Construtor cheio
	public Endereco(String logradouro) {
		super();
		this.logradouro = logradouro;
	}

	//Setters & Getters
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	

}
