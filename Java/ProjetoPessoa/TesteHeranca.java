package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteHeranca {
	
	//Metodo Static
	
	//String
	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
		
	}
	//int
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	//Double
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	

	public static void main(String[] args) {
		
		// Instanciar objetos
		
		//String nome, String email, int idade, double renda, String razaoSocial, String cnpj
		PessoaJuridica objPj = new PessoaJuridica(texto("Digite o nome da empresa"),
												texto("Digite o email da empresa"),
												inteiro("Digite o tempo da empresa"),
												real("Digite a receita mensal da empresa"),
												texto("Digite a razão social da empresa"),
												texto("Digite o cnpj da empresa"));
		
		// String nome, String email, int idade, double renda, String rg, String cpf
		PessoaFisica objPf = new PessoaFisica (texto("Digite o nome"),
												texto("Digite o email"),
												inteiro("DIgite a idade"),
												real("Digite a sua renda"),
												texto("Digite o seu rg"),
												texto("Digie o seu cpf"));
		
		// String Logradouro
		Endereco objEndereco = new Endereco(texto("Digite o seu endereço"));
		
		//SAIDAS
		
		System.out.println("INFORMAÇÕES PESSOA JURIDICA");
		System.out.println("Nome: " + objPj.getNome()+
				"\nEmail: " + objPj.getEmail() +
				"\nIdade: " + objPj.getIdade() +
				"\nReceita Mensal: " +objPj.getRenda() +
				"\nRazão Social: " + objPj.getRazaoSocial() +
				"\nCNPJ: " + objPj.getCnpj()+
				"\nIdentificador: " + objPj.identificador());
		
		System.out.println("\nINFORMAÇÕES PESSOA FISICA");
		System.out.println("Nome: " + objPf.getNome() +
				"\nEmail:" + objPf.getEmail() +
				"\nIdade: " + objPf.getIdade() +
				"\nRenda: " + objPf.getRenda() +
				"\nRg: " + objPf.getRg() +
				"\nCPF: " + objPf.getCpf()+
				"\nIdentificador: " + objPf.identificador());
		
		System.out.println("Logradouro: " + objEndereco.getLogradouro());
	}

}
