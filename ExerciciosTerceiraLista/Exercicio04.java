/*4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma regi�o. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema 
que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

�	o n�mero de pessoas calmas; nCalma
�	o n�mero de mulheres nervosas; nmNervo
�	o n�mero de homens agressivos; nhAgr
�	o n�mero de outros calmos; noCalmo
�	o n�mero de pessoas nervosas com mais de 40 anos; npNervo 
�	o n�mero de pessoas calmas com menos de 18 anos. npCalma

*/
package br.com.repeticao.gen;

import java.util.Scanner;

public class Exercicio04 {

public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
int c = 0, idade, sexo, opcao;
int nCalma = 0, nmNervo = 0, nhAgr = 0, noCalmo = 0, npNervo = 0, npCalma = 0;

while (c < 150) {
System.out.println("Digite a idade: ");
idade = leia.nextInt();

System.out.println("Digite o sexo (1-feminino / 2-masculino / 3-Outros): ");
sexo = leia.nextInt();

System.out.println("Digite uma das op��es (1, se a pessoa � calma; 2, se a pessoa � nervosa e 3, se a pessoa � agressiva): ");
opcao = leia.nextInt();

if (opcao == 1) {
	nCalma = nCalma +1;
}
if (sexo == 1 && opcao == 2) {
	nmNervo = nmNervo +1;
}
if (sexo == 2 && opcao == 3) {
	nhAgr = nhAgr +1;
}
if (sexo == 3 && opcao == 1) {
	noCalmo = noCalmo +1;
}
if (opcao == 2 && idade > 40) {
	npNervo = npNervo +1;
}
if (opcao == 1 && idade < 18) {
	npCalma = npCalma +1;
}
c = c + 1;
}
System.out.println("O n�mero de pessoas calmas: "+nCalma);
System.out.println("\nO n�mero de mulheres nervosas: "+nmNervo);
System.out.println("\nO n�mero de homens agressivos: "+nhAgr);
System.out.println("\nO n�mero de outros calmos: "+noCalmo);
System.out.println("\nO n�mero de pessoas nervosas com mais de 40 anos: "+npNervo);
System.out.println("\nO n�mero de pessoas calmas com menos de 18 anos: "+npCalma);
leia.close();
	}

}
