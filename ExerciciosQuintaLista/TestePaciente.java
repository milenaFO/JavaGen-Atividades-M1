package br.com.lista.quinta;

public class TestePaciente {

	public static void main(String[] args) {
	Paciente objetoPaciente = new Paciente ();
	Paciente objetoPaciente2 = new Paciente ();
	
	objetoPaciente.nome = "Vin�cius";
	objetoPaciente.sintomas = "Dor no p�";
	objetoPaciente.idade = 25;
	
	objetoPaciente2.nome = "Milena";
	objetoPaciente2.sintomas = "Dor de barriga";
	objetoPaciente2.idade = 25;
	
	System.out.println("Nome do/a paciente - " + objetoPaciente.nome);
	System.out.println("sintomas do/a paciente - " + objetoPaciente.sintomas);
	System.out.println("Idade do/a paciente - " + objetoPaciente.idade);
	objetoPaciente.observa��o();
	
	System.out.println("Nome do/a paciente - " + objetoPaciente2.nome);
	System.out.println("sintomas do/a paciente - " + objetoPaciente2.sintomas);
	System.out.println("Idade do/a paciente - " + objetoPaciente2.idade);
	objetoPaciente2.alta();
	}

}
