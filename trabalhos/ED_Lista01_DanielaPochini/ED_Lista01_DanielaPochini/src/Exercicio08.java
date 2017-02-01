/*8.	Dados 3 valores inteiros, verificar se representam um triângulo, 
		sua classificação quanto aos lados (eqüilátero, isósceles ou escaleno) e seu perímetro.
		Lembre-se que, se A, B e C são lados de um triângulo se e somente se, 
		as medidas dos lados atendem à seguinte expressão: (A<B+C) e (C<A+B) e (B<A+C)
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
			System.out.print("é um triangulo");
			if ((a == b) && (b==c)) {
				System.out.println("é um equilatero");
			} else {
				if ((a==b) || (b == c) || (a==c) ) {
					System.out.println("isosceles");
				} else {
					System.out.println("escaleno");
				} 
			}
		} else{
			System.out.println("não é um triangulo!");
		} 

		entrada.close();
	}
	
}
