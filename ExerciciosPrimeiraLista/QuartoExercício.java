package ExerciciosPrimeiraLista;
import java.util.Scanner;
public class QuartoExerc�cio {

	public static void main(String[] args) {
	int A, B, C, D, R, S;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o primeiro n�mero: ");
	A = leia.nextInt();
	
	System.out.println("Digite o segundo n�mero: ");
	B = leia.nextInt();
	
	System.out.println("Digite o terceiro n�mero: ");
	C = leia.nextInt();
	
	R = (A + B)^2;
			
	S = (B + C)^2;

	D = (R + S) / 2;
	
	System.out.println("O valor de R �: '"+R+ "'\nO valor de S �: '"+S+ "'\nO valor de D � '" +D+"'.");
	leia.close();
	}

}
