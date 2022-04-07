package br.com.generation.heranca;

public class TestandoTodos {

	public static void main(String[] args) {
	
	Cachorro Cachorro = new Cachorro ();
	Cavalo Cavalo = new Cavalo ();
	Pregui�a Pregui�a = new Pregui�a ();
	
	Cachorro.setNome ("Rog�rio.");
	Cachorro.setIdade (2);
	Cachorro.setEmitesom ("O cachorro emite som (AUAU).");
	Cachorro.setCorre ("O cachorro corre.");
	
	System.out.println("Nome do cachorro: " +Cachorro.getNome());
	System.out.println("Idade: " +Cachorro.getIdade());
	System.out.println(Cachorro.getEmitesom());
	System.out.println(Cachorro.getCorre());
	
	Cavalo.setNome ("Marlon.");
	Cavalo.setIdade (5);
	Cavalo.setEmitesom ("O cavalo emite som (IIIIRR�).");
	Cavalo.setCorre ("O cavalo corre.");

	System.out.println("\nNome do cavalo: " +Cavalo.getNome());
	System.out.println("Idade: " +Cavalo.getIdade());
	System.out.println(Cavalo.getEmitesom());
	System.out.println(Cavalo.getCorre());
	
	Pregui�a.setNome ("Am�lie.");
	Pregui�a.setIdade (18);
	Pregui�a.setEmitesom ("A cavalo emite som (ZZZZzzZZZ).");
	Pregui�a.setSobeEmArvores ("A pregui�a sobe em �rvores");
	
	System.out.println("\nNome da pregui�a: " +Pregui�a.getNome());
	System.out.println("Idade: " +Pregui�a.getIdade());
	System.out.println(Pregui�a.getEmitesom());
	System.out.println(Pregui�a.getSobeEmArvores());
	
	
	}

}
