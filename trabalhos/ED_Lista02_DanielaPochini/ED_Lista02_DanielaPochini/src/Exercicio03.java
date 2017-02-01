/* 3.	Mostrar a seguinte série: 1, 2, 3,...,N  */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) { 
		int n;
		int i=1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de N"); 
		n = entrada.nextInt();
		//while
		System.out.println("com while");
		while (i<=n) {
			System.out.print(i+ " ");
			i++;
		}   
		System.out.println(" ");
		//do while
		System.out.println("com do - while");
		i=1;
		do {  
			System.out.print(i+ " ");
			i++;
		} while (i<=n);
		System.out.println(" ");
		//for
		System.out.println("com for");
		for (i=1; i<=n; i++) {
			System.out.print(i+ " ");

		}
		entrada.close();
	}
}
