//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
package lista2;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		int N1 ,  N2 ,  N3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		N1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		N2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		N3 = leia.nextInt();
		
		if (N1 > N2 && N1> N3) {
		if (N2 > N3) {
		System.out.println("A ordem crescente dos n�meros � "+N3+ ", " +N2+ ", "+N1+ "." );
		}
		if (N2 < N3) {
		System.out.println("A ordem crescente dos n�meros � "+N2+ ", " +N3+ ", "+N1+ "." );
			}
		}
		
		if (N2 > N1 && N2 > N3) {
		if (N1 > N3) {
		System.out.println("A ordem crescente dos n�meros � "+N3+ ", " +N1+ ", "+N2+ "." );
		}
		if (N1 < N3) {
		System.out.println("A ordem crescente dos n�meros � "+N1+ ", " +N3+ ", "+N2+ "." );
			}
		}
		
		
		if (N3 > N1 && N3 > N2) {
		if (N1 > N2) {
		System.out.println("A ordem crescente dos n�meros � "+N2+ ", " +N1+ ", "+N3+ "." );
		}
		if (N2 > N1) {
		System.out.println("A ordem crescente dos n�meros � "+N1+ ", " +N2+ ", "+N3+ "." );
		leia.close();
	}

}
}
}
