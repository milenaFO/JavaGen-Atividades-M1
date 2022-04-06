/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
package lista2;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
	double N1, res;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	N1 = leia.nextDouble();
	
	if ( N1 % 2 == 0)
	{
	res = Math.sqrt(N1);
	System.out.println("A raiz quadrada de "+N1+ " é "+res);
	}
	if ( N1 % 2 != 0)
	{
	res = Math.pow(N1,2);
	System.out.println("A potência de "+N1+ " é "+res);
	leia.close();
	}
	}

}
