/*4-	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema 
que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)

•	o número de pessoas calmas; nCalma
•	o número de mulheres nervosas; nmNervo
•	o número de homens agressivos; nhAgr
•	o número de outros calmos; noCalmo
•	o número de pessoas nervosas com mais de 40 anos; npNervo 
•	o número de pessoas calmas com menos de 18 anos. npCalma

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

System.out.println("Digite uma das opções (1, se a pessoa é calma; 2, se a pessoa é nervosa e 3, se a pessoa é agressiva): ");
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
System.out.println("O número de pessoas calmas: "+nCalma);
System.out.println("\nO número de mulheres nervosas: "+nmNervo);
System.out.println("\nO número de homens agressivos: "+nhAgr);
System.out.println("\nO número de outros calmos: "+noCalmo);
System.out.println("\nO número de pessoas nervosas com mais de 40 anos: "+npNervo);
System.out.println("\nO número de pessoas calmas com menos de 18 anos: "+npCalma);
leia.close();
	}

}
