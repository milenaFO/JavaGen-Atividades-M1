/*1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	int N1 ,  N2 ,  N3;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o primeiro n�mero inteiro: ");
	N1 = leia.nextInt();
	
	System.out.println("Digite o segundo n�mero inteiro: ");
	N2 = leia.nextInt();
	
	System.out.println("Digite o terceiro n�mero inteiro: ");
	N3 = leia.nextInt();
	
	if (N1 > N2 && N1> N3) {
	System.out.println("O n�mero "+N1+ " � o maior");

	}
	if (N2 > N1 && N2 > N3) {
	System.out.println("O n�mero "+N2+ " � o maior");
}
	if (N3 > N1 && N3 > N2) {
		System.out.println("O n�mero "+N3+ " � o maior");
		leia.close();
}
	}
}

