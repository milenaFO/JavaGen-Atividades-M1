/*7) Crie uma classe paciente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
package br.com.lista.quinta;

public class Paciente {
	
	//Atributos
	String nome;
	String sintomas;
	int idade;

	//M�todos
	void observa��o () {
	System.out.println("Paciente em observa��o...\n");
	}
	
	void alta () {
	System.out.println("Paciente teve alta...\n");
}
}