package ExerciciosPrimeiraLista;
import java.util.Scanner;
public class SextoExercicio {

	public static void main(String[] args) {
	double X1, X2, Y1, Y2, P1, P2, D;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o valor de X1: ");
	X1 = leia.nextDouble();
	
	System.out.println("Digite o valor de X2: ");
	X2 = leia.nextDouble();
	
	System.out.println("Digite o valor de Y1: ");
	Y1 = leia.nextDouble();
	
	System.out.println("Digite o valor de Y2: ");
	Y2 = leia.nextDouble();
	
	P1 = Math.pow((X2-X1), 2);
	P2 = Math.pow((Y2-Y1), 2);
	D = Math.pow((P1 + P2), 0.5);
	
	System.out.println("A distância é igual a: "+D);
	leia.close();
	
	}

}
