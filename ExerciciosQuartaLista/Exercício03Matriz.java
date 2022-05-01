/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/
package br.com.vetor.matriz.gen;

import java.util.Random;

public class Exercício03Matriz {

	public static void main(String[] args) {
		
int n1[][] = new int[4][6];
int n2[][] = new int[4][6];
int m1[][] = new int[4][6];
int m2[][] = new int[4][6];
int x, y;
Random gerador = new Random();


for (x = 0; x<4; x++)
{
for (y = 0; y<6; y++)
{
	n1 [x][y] = (gerador.nextInt(20));	
	}
}

for (x = 0; x<4; x++)
{
for (y = 0; y<6; y++)
{
n2 [x][y] = (gerador.nextInt(20));
}
}

//a)
for (x = 0; x<4; x++)
{
for (y = 0; y<6; y++)
{
	m1 [x][y] = n1 [x][y] + n2 [x][y];
}
}

//b
for (x = 0; x<4; x++)
{
for (y = 0; y<6; y++)
{
	m2 [x][y] = n1 [x][y] - n2 [x][y];
}
}

System.out.println("Matriz m1");
System.out.println(m1[0][0]+"|"+m1[0][1]+"|"+m1[0][2]+"|"+m1[0][3]+"|"+m1[0][4]+"|"+m1[0][5]+"|");
System.out.println(m1[1][0]+"|"+m1[1][1]+"|"+m1[1][2]+"|"+m1[1][3]+"|"+m1[1][4]+"|"+m1[1][5]+"|");
System.out.println(m1[2][0]+"|"+m1[2][1]+"|"+m1[2][2]+"|"+m1[2][3]+"|"+m1[2][4]+"|"+m1[2][5]+"|");
System.out.println(m1[3][0]+"|"+m1[3][1]+"|"+m1[3][2]+"|"+m1[3][3]+"|"+m1[3][4]+"|"+m1[3][5]+"|"+"\n");

System.out.println("Matriz m2");
System.out.println(m2[0][0]+"|"+m2[0][1]+"|"+m2[0][2]+"|"+m2[0][3]+"|"+m2[0][4]+"|"+m2[0][5]+"|");
System.out.println(m2[1][0]+"|"+m2[1][1]+"|"+m2[1][2]+"|"+m2[1][3]+"|"+m2[1][4]+"|"+m2[1][5]+"|");
System.out.println(m2[2][0]+"|"+m2[2][1]+"|"+m2[2][2]+"|"+m2[2][3]+"|"+m2[2][4]+"|"+m2[2][5]+"|");
System.out.println(m2[3][0]+"|"+m2[3][1]+"|"+m2[3][2]+"|"+m2[3][3]+"|"+m2[3][4]+"|"+m2[3][5]+"|"+"\n");

System.out.println("Matriz n1");
System.out.println(n1[0][0]+"|"+n1[0][1]+"|"+n1[0][2]+"|"+n1[0][3]+"|"+n1[0][4]+"|"+n1[0][5]+"|");
System.out.println(n1[1][0]+"|"+n1[1][1]+"|"+n1[1][2]+"|"+n1[1][3]+"|"+n1[1][4]+"|"+n1[1][5]+"|");
System.out.println(n1[2][0]+"|"+n1[2][1]+"|"+n1[2][2]+"|"+n1[2][3]+"|"+n1[2][4]+"|"+n1[2][5]+"|");
System.out.println(n1[3][0]+"|"+n1[3][1]+"|"+n1[3][2]+"|"+n1[3][3]+"|"+n1[3][4]+"|"+n1[3][5]+"|"+"\n");

System.out.println("Matriz n2");
System.out.println(n2[0][0]+"|"+n2[0][1]+"|"+m2[0][2]+"|"+n2[0][3]+"|"+n2[0][4]+"|"+n2[0][5]+"|");
System.out.println(n2[1][0]+"|"+n2[1][1]+"|"+m2[1][2]+"|"+n2[1][3]+"|"+n2[1][4]+"|"+n2[1][5]+"|");
System.out.println(n2[2][0]+"|"+n2[2][1]+"|"+m2[2][2]+"|"+n2[2][3]+"|"+n2[2][4]+"|"+n2[2][5]+"|");
System.out.println(n2[3][0]+"|"+n2[3][1]+"|"+m2[3][2]+"|"+n2[3][3]+"|"+n2[3][4]+"|"+n2[3][5]+"|"+"\n");
}
}


