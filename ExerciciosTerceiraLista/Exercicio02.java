/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
package br.com.repeticao.gen;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	int c, n, par, impar;
	Scanner leia = new Scanner(System.in);
	
	par = 0;
	impar = 0;
	
	for(c = 1; c <= 10; c++) { //contador
	System.out.println("Digite o número: ");
	n = leia.nextInt();
	
	if (n % 2 == 0) {
	par = par +1;
	}
	else {
	impar = impar +1;
	}
	}

	System.out.println("Números pares: "+par+ "\nNúmeros ímpares: "+impar);
	leia.close();

	}
}
