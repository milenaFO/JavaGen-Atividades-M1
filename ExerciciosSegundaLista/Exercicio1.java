/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	int N1 ,  N2 ,  N3;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o primeiro número inteiro: ");
	N1 = leia.nextInt();
	
	System.out.println("Digite o segundo número inteiro: ");
	N2 = leia.nextInt();
	
	System.out.println("Digite o terceiro número inteiro: ");
	N3 = leia.nextInt();
	
	if (N1 > N2 && N1> N3) {
	System.out.println("O número "+N1+ " é o maior");

	}
	if (N2 > N1 && N2 > N3) {
	System.out.println("O número "+N2+ " é o maior");
}
	if (N3 > N1 && N3 > N2) {
		System.out.println("O número "+N3+ " é o maior");
		leia.close();
}
	}
}

