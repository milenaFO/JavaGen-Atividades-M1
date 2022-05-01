/*4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
package br.com.vetor.matriz.gen;
import java.util.Scanner;
public class Exercício04Matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matriz [][] = new int[3][3];	
		int x, y, t1 = 0, t2;
		
		for (x = 0; x<3; x++)
		{
		for (y = 0; y<3; y++)
		{
		System.out.println("Digite os valores: ");
		(matriz[x][y]) = leia.nextInt();
		t1 = t1 + matriz [x][y];
		}
		}
		t2 = matriz[0][0]+matriz[1][1]+matriz[2][2];
		
		System.out.println("A soma da diagonal da matriz é: "+t2+"\nA soma de todos os valores da matriz é: "+t1);
		
	}

}
