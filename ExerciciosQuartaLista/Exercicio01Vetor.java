
/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
package br.com.vetor.matriz.gen;

import java.util.Scanner;

public class Exercicio01Vetor {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	int x, p, m = 0;
	int vetor[] = new int[5];
	
	for (x=0; x<5; x++) {
	System.out.println("Digite os pontos: ");
	p = leia.nextInt();
	vetor [x] = p;
	
	if (m < p) {
	m = p;
	}
	}
	System.out.println("A maior pontuação foi: "+m);
	leia.close();
	}

}
