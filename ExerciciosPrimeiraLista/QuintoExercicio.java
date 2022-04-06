/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/
package ExerciciosPrimeiraLista;
import java.util.Scanner;

public class QuintoExercicio {

	public static void main(String[] args) {
	int N1, N2, N3, M;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite sua primeira nota: ");
	N1 = leia.nextInt();
	
	System.out.println("Digite sua segunda nota: ");
	N2 = leia.nextInt();
	
	System.out.println("Digite sua terceira nota: ");
	N3 = leia.nextInt();
	
	M = ((N1*2) + (N2*3) + (N3*5))/(2+3+5);
	
	System.out.println("A média do aluno é de: "+M);
	leia.close();
	}

}
