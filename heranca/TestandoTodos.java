package br.com.generation.heranca;

public class TestandoTodos {

	public static void main(String[] args) {
	
	Cachorro Cachorro = new Cachorro ();
	Cavalo Cavalo = new Cavalo ();
	Preguiça Preguiça = new Preguiça ();
	
	Cachorro.setNome ("Rogério.");
	Cachorro.setIdade (2);
	Cachorro.setEmitesom ("O cachorro emite som (AUAU).");
	Cachorro.setCorre ("O cachorro corre.");
	
	System.out.println("Nome do cachorro: " +Cachorro.getNome());
	System.out.println("Idade: " +Cachorro.getIdade());
	System.out.println(Cachorro.getEmitesom());
	System.out.println(Cachorro.getCorre());
	
	Cavalo.setNome ("Marlon.");
	Cavalo.setIdade (5);
	Cavalo.setEmitesom ("O cavalo emite som (IIIIRRÍ).");
	Cavalo.setCorre ("O cavalo corre.");

	System.out.println("\nNome do cavalo: " +Cavalo.getNome());
	System.out.println("Idade: " +Cavalo.getIdade());
	System.out.println(Cavalo.getEmitesom());
	System.out.println(Cavalo.getCorre());
	
	Preguiça.setNome ("Amélie.");
	Preguiça.setIdade (18);
	Preguiça.setEmitesom ("A cavalo emite som (ZZZZzzZZZ).");
	Preguiça.setSobeEmArvores ("A preguiça sobe em árvores");
	
	System.out.println("\nNome da preguiça: " +Preguiça.getNome());
	System.out.println("Idade: " +Preguiça.getIdade());
	System.out.println(Preguiça.getEmitesom());
	System.out.println(Preguiça.getSobeEmArvores());
	
	
	}

}
