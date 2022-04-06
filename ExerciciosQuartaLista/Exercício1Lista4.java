/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/
package br.com.lista.quarta;
import java.util.Scanner;
public class Exercício1Lista4 {

	public static void main(String[] args) {
	int x, m = 0;
	int[] Vetor = new int[5];
	Scanner leia = new Scanner(System.in);
	
	for (x=0; x<=4; x++)
	{
	System.out.println("Digite os pontos: ");
	Vetor[x] = leia.nextInt();
	if (x == 0){
	m = Vetor[0];
	}
	if(Vetor[x] > m) {
	m = Vetor[x];
	}
	
	}
	
	
	System.out.println("A maior pontuação foi: "+m);
	
	leia.close();

	}
	}
	
	


	
	
    
	
	
	
	
	


