/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/
package lista2;
import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
	int I;
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite a idade para saber a categoria: ");
	I = leia.nextInt();
	
	if (I >= 18)
	{
	System.out.println("Categoria adulto");
	}
	if (I >= 10 && I <= 14)
	{
	System.out.println("Categoria infantil");
	}
	else if (I >= 15 && I <= 17)
	{
	System.out.println("Categoria juvenil");
	}
	else if (I < 10)
	{
	System.out.println("Idade inválida!");
	leia.close();
	}
	}
	
}
