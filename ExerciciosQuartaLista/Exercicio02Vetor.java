/*2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/
package br.com.vetor.matriz.gen;

import java.util.Random;


public class Exercicio02Vetor {

	public static void main(String[] args) {
	
	int lancamentos[] = new int[10];
	int x, t = 0, m = 0, contagem = 0;
	double media;
	Random gerador = new Random();
	
	for (x=0; x<10; x++)
	{
		lancamentos[x] = (gerador.nextInt(1, 10));
		t = t + lancamentos [x];
		
		if  (m < lancamentos [x])
		{
		m = lancamentos [x];
		}
	}
	for (x = 0; x<10; x++)
	{
		if (lancamentos [x] == m)
	{
		contagem = contagem + 1;
	}
	}
		media = t/10;
		System.out.println("A média foi: "+media+ "\nO maior número foi: "+m+ "\nO maior número apareceu "+contagem+" vezes. ");
		}

}
