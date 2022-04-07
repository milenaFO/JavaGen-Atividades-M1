/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package br.com.lista.quinta;

public class Paciente {
	
	//Atributos
	String nome;
	String sintomas;
	int idade;

	//Métodos
	void observação () {
	System.out.println("Paciente em observação...\n");
	}
	
	void alta () {
	System.out.println("Paciente teve alta...\n");
}
}