/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
package ExerciciosPrimeiraLista;
import java.util.Scanner;
public class TerceiroExercicio {

	public static void main(String[] args) {
	int segundos, horas, minutos, tempo	;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Qual � o tempo de dura��o do evento em segundos? ");
	tempo = leia.nextInt();
	
	horas = tempo/3600;
	minutos = (tempo - horas*3600) / 60;
	segundos = (tempo - horas*3600 - minutos*60);
	
	System.out.println("A dura��o do evento foi de: "+horas+" horas "+minutos+ " minutos " +segundos+ " segundos.");
	
	leia.close();
	
	}

}
