package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {
	
	//Variaveis
	private String razaoSocial;
	private String cnpj;
	
	//Metodo vazio
	public PessoaJuridica() {
		super();
	}

	//Metodo cheio
	public PessoaJuridica(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	//Metodo cheio com herança
	public PessoaJuridica(String nome, String email, int idade, double renda, String razaoSocial, String cnpj) {
		super(nome, email, idade, renda);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	//Setters & Gettters
	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	//Sobre Escrita
	public String identificador() {
		return "Pj";
	}
	
}
