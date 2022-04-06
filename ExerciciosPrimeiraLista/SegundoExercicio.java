/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
package ExerciciosPrimeiraLista;
import java.util.Scanner;
public class SegundoExercicio {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dias, dia, meses, ano;
		
		System.out.println("Digite os dias: ");
		dias = leia.nextInt();
		
		ano = dias / 365;
		meses = ((dias -(ano * 365)) / 30);
		dia = ((dias -(ano * 365)) % 30);
		
		System.out.println("Você viveu aproximadamente: " +ano+ " anos, " +meses+ " meses e " +dia+ " dias.");
		leia.close();
		
	}

}
