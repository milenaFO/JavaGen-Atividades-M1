/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
package lista2;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
	double N1, res;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite um n�mero: ");
	N1 = leia.nextDouble();
	
	if ( N1 % 2 == 0)
	{
	res = Math.sqrt(N1);
	System.out.println("A raiz quadrada de "+N1+ " � "+res);
	}
	if ( N1 % 2 != 0)
	{
	res = Math.pow(N1,2);
	System.out.println("A pot�ncia de "+N1+ " � "+res);
	leia.close();
	}
	}

}
