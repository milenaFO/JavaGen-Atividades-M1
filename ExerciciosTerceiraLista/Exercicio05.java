/*5-	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.*/
package br.com.repeticao.gen;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int i = 1, n, c = 0; // i = chave de verifica��o do looping
	do {
	System.out.println("Escreva o n�mero: ");
	n = leia.nextInt();
	
	if (n != 0) {
	c = c + n;
	i = n;
	}
	i = n;
	}while(i!=0);
	System.out.println("A soma dos n�meros digitados �: "+c);
	leia.close();
	}

}
