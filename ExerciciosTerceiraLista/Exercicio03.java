/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
package br.com.repeticao.gen;

import java.util.Scanner;

public class Exercicio03 {
public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
int c = 0, idade, menor21 = 0, maior50 = 0;

while (c != -99) {
System.out.println("Digite a idade: ");
idade = leia.nextInt();
c = idade;
if (idade > 0 && idade <=21) {
menor21 = menor21 +1;
}
if (idade >= 50) {
maior50 = maior50 +1;
}
}
System.out.println("Menores de 21: "+menor21+ "\nMaiores de 50: "+maior50);
leia.close();
}
}
