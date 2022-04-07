/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal.*/

package br.com.generation.heranca;

public class Animal {
	//Atributos:
	private String nome;
	private int idade;
	private String Emitesom;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmitesom() {
		return Emitesom;
	}
	public void setEmitesom(String emitesom) {
		Emitesom = emitesom;
	}
	
	
	

}
