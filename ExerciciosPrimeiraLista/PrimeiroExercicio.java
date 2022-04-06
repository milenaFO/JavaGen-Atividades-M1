/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

package ExerciciosPrimeiraLista;
import java.util.Scanner;
public class PrimeiroExercicio {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, res;
		
		System.out.println("Digite sua idade em anos: ");
		anos = leia.nextInt();
		
		System.out.println("Digite os meses: ");
		meses = leia.nextInt();
		
		System.out.println("Digite os dias: ");
		dias = leia.nextInt();
		
		res = ((anos*365)+(meses*30)+dias);
		System.out.println("Você viveu aproximadamente este número de dias: "+res);
		leia.close();
		
	}

}
