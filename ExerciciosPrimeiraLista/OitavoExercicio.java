/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/
package ExerciciosPrimeiraLista;
import java.util.Scanner;
public class OitavoExercicio {

	public static void main(String[] args) {
	
	double CF, PD, I, CC;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Qual é o custo de fábrica do carro? ");
	CF = leia.nextDouble();
	
	PD = (CF*0.28);
	I =  (CF*0.45);
	CC = CF + I + PD;
	
	System.out.println("O custo de fábrica do carro é de: R$: "+CF+ "\nO custo ao consumidor é de: R$"+CC);
	leia.close();
	
	}

}
