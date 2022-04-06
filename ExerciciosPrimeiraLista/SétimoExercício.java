package ExerciciosPrimeiraLista;
import java.util.Scanner;
public class SétimoExercício {

	public static void main(String[] args) {
	double A, B, C, D, E, F, X, Y;
	
	Scanner leia = new Scanner(System.in);
	System.out.println("Digite o valor de A: ");
	A = leia.nextDouble();
	
	System.out.println("Digite o valor de B: ");
	B = leia.nextDouble();
	
	System.out.println("Digite o valor de C: ");
	C = leia.nextDouble();
	
	System.out.println("Digite o valor de D: ");
	D = leia.nextDouble();
	
	System.out.println("Digite o valor de E: ");
	E = leia.nextDouble();
	
	System.out.println("Digite o valor de F: ");
	F = leia.nextDouble();
	
	X = ((C*E)-(B*F)) / ((A*E) - (B*D));

	Y = ((A*F) - (C*D)) / ((A*E) - (B*D));

	System.out.println("O valor de X é: "+X+ "\nO valor de Y é: "+Y);
	leia.close();
	
	}

}
