/*8.	Dados 3 valores inteiros, verificar se representam um tri�ngulo, 
		sua classifica��o quanto aos lados (eq�il�tero, is�sceles ou escaleno) e seu per�metro.
		Lembre-se que, se A, B e C s�o lados de um tri�ngulo se e somente se, 
		as medidas dos lados atendem � seguinte express�o: (A<B+C) e (C<A+B) e (B<A+C)
*/

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("lado a:");
		a = entrada.nextInt();
		System.out.println("lado b:");
		b = entrada.nextInt();
		System.out.println("lado c:");
		c = entrada.nextInt();
		if ((a<b+c) && (b<a+c) && (c<a+b)){
			System.out.print("� um triangulo");
			if ((a == b) && (b==c)) {
				System.out.println("� um equilatero");
			} else {
				if ((a==b) || (b == c) || (a==c) ) {
					System.out.println("isosceles");
				} else {
					System.out.println("escaleno");
				} 
			}
		} else{
			System.out.println("n�o � um triangulo!");
		} 

		entrada.close();
	}
	
}
