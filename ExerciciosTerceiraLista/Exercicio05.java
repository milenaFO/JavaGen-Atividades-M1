/*5-	Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.*/
package br.com.repeticao.gen;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int i = 1, n, c = 0; // i = chave de verificação do looping
	do {
	System.out.println("Escreva o número: ");
	n = leia.nextInt();
	
	if (n != 0) {
	c = c + n;
	i = n;
	}
	i = n;
	}while(i!=0);
	System.out.println("A soma dos números digitados é: "+c);
	leia.close();
	}

}
