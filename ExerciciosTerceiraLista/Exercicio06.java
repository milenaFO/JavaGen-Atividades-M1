/*6-	Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(*/
package br.com.repeticao.gen;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int n, m = 0, c = 0, i;
	double me;
	do {
	System.out.println("Escreva o número: ");
	n = leia.nextInt();
		
	if (n != 0 && n % 3 == 0) {
	m = m + n;
	c = c + 1;
	i = n;
	}
	i = n;
	}while(i!=0);
	me = m/c;
	System.out.println("A média dos números números múltiplos de 3 digitados é: "+me);
	leia.close();

	}

}
