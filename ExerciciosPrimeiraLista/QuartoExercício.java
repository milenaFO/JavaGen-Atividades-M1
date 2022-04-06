package ExerciciosPrimeiraLista;
import java.util.Scanner;
public class QuartoExercício {

	public static void main(String[] args) {
	int A, B, C, D, R, S;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o primeiro número: ");
	A = leia.nextInt();
	
	System.out.println("Digite o segundo número: ");
	B = leia.nextInt();
	
	System.out.println("Digite o terceiro número: ");
	C = leia.nextInt();
	
	R = (A + B)^2;
			
	S = (B + C)^2;

	D = (R + S) / 2;
	
	System.out.println("O valor de R é: '"+R+ "'\nO valor de S é: '"+S+ "'\nO valor de D é '" +D+"'.");
	leia.close();
	}

}
