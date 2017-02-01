/* 11.	Faça um algoritmo para calcular  a série Fibonacci até 0 N-ésimo termo. 
	 A série tem a seguinte forma:  1,1,2,3,5,8,13,21,34,…  */

import java.util.Scanner;

public class Exercicio09 { 

	public static void main(String[] args) { 
		Scanner entrada = new Scanner (System.in);
		System.out.println("Quantidade de Termos:");
		int n = entrada.nextInt();
		int i=1;
		int c=0;
		int t=1;
		int x;
		//while
		System.out.println("com while");
		while (i<=n) {
			System.out.print(t + " ");
			x=t;
			t=t+c;
			c=x;
			i++;
		}
		System.out.println(" ");
		i=1;
		c=0;
		t=1;
		//do while
		System.out.println("com do - while");
		do { 
			System.out.print(t + " ");
			x=t;
			t=t+c;
			c=x;
			i++;
		} while (i<=n);  
		System.out.println(" ");
		//for
		System.out.println("com for");   
		c=0;
		t=1;
		for (i = 0; i<n; i++) {
			x=t;
			t=t+c;
			c=x; 
			System.out.print(t + " ");
		}   
		entrada.close();
	}

}