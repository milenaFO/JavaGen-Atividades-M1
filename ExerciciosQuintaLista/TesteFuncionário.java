package br.com.lista.quinta;

public class TesteFuncion�rio {

	public static void main(String[] args) {
	
	Funcion�rio objetoFuncion�rio = new Funcion�rio ();
	Funcion�rio objetoFuncion�rio2 = new Funcion�rio ();
	Funcion�rio objetoFuncion�rio3 = new Funcion�rio ();
	
	objetoFuncion�rio.nome = "Ravena";
	objetoFuncion�rio.�rea = "Suporte";
	objetoFuncion�rio.idade = 21;
	
	objetoFuncion�rio2.nome = "Latrel";
	objetoFuncion�rio2.�rea = "Educa��o";
	objetoFuncion�rio2.idade = 18;
	
	objetoFuncion�rio3.nome = "Estelar";
	objetoFuncion�rio3.�rea = "Cientista";
	objetoFuncion�rio3.idade = 19;
	
	System.out.println("Nome do/a funcion�rio/a/e - " + objetoFuncion�rio.nome);
	System.out.println("�rea do/a funcion�rio/a/e - " + objetoFuncion�rio.�rea);
	System.out.println("Idade do/a funcion�rio/a/e - " + objetoFuncion�rio.idade);
	objetoFuncion�rio.almo�ando();
	
	System.out.println("Nome do/a funcion�rio/a/e - " + objetoFuncion�rio2.nome);
	System.out.println("�rea do/a funcion�rio/a/e - " + objetoFuncion�rio2.�rea);
	System.out.println("Idade do/a funcion�rio/a/e - " + objetoFuncion�rio2.idade);
	objetoFuncion�rio2.trabalhando();
	
	System.out.println("Nome do/a funcion�rio/a/e - " + objetoFuncion�rio3.nome);
	System.out.println("�rea do/a funcion�rio/a/e - " + objetoFuncion�rio3.�rea);
	System.out.println("Idade do/a funcion�rio/a/e - " + objetoFuncion�rio3.idade);
	objetoFuncion�rio.trabalhando();
	
	

	}

}
