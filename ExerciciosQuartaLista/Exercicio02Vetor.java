/*2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/
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
		System.out.println("A m�dia foi: "+media+ "\nO maior n�mero foi: "+m+ "\nO maior n�mero apareceu "+contagem+" vezes. ");
		}

}
