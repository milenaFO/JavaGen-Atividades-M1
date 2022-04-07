package br.com.lista.quinta;

public class TesteFuncionário {

	public static void main(String[] args) {
	
	Funcionário objetoFuncionário = new Funcionário ();
	Funcionário objetoFuncionário2 = new Funcionário ();
	Funcionário objetoFuncionário3 = new Funcionário ();
	
	objetoFuncionário.nome = "Ravena";
	objetoFuncionário.Área = "Suporte";
	objetoFuncionário.idade = 21;
	
	objetoFuncionário2.nome = "Latrel";
	objetoFuncionário2.Área = "Educação";
	objetoFuncionário2.idade = 18;
	
	objetoFuncionário3.nome = "Estelar";
	objetoFuncionário3.Área = "Cientista";
	objetoFuncionário3.idade = 19;
	
	System.out.println("Nome do/a funcionário/a/e - " + objetoFuncionário.nome);
	System.out.println("Área do/a funcionário/a/e - " + objetoFuncionário.Área);
	System.out.println("Idade do/a funcionário/a/e - " + objetoFuncionário.idade);
	objetoFuncionário.almoçando();
	
	System.out.println("Nome do/a funcionário/a/e - " + objetoFuncionário2.nome);
	System.out.println("Área do/a funcionário/a/e - " + objetoFuncionário2.Área);
	System.out.println("Idade do/a funcionário/a/e - " + objetoFuncionário2.idade);
	objetoFuncionário2.trabalhando();
	
	System.out.println("Nome do/a funcionário/a/e - " + objetoFuncionário3.nome);
	System.out.println("Área do/a funcionário/a/e - " + objetoFuncionário3.Área);
	System.out.println("Idade do/a funcionário/a/e - " + objetoFuncionário3.idade);
	objetoFuncionário.trabalhando();
	
	

	}

}
