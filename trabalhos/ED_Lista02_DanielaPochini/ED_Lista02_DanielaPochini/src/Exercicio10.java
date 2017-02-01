/*
	 10.	Calcular e mostrar  o fatorial de um número inteiro qualquer. 
 */

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) { 
		Scanner entrada = new Scanner (System.in);
		int fat=1;
		int cont=1;
		int n;
		System.out.println("Digite um número :");
		n = entrada.nextInt();
		//while
		System.out.println("com while");
		while (cont<=n) {
			fat=fat*cont;
			cont++; 
			System.out.print(+n+"! = "+fat);
		}
		System.out.println(" ");
		//do while
		fat=1;
		cont=1;
		System.out.println("com do - while");
		do { 
			fat=fat*cont;
			cont++;  
			System.out.print(+n+"! = "+fat);
		} while (cont<=n);   
		
		System.out.println(" ");
		//for
		System.out.println("com for"); 
		fat=1; 
		for (cont = 1; cont<=n; cont++) {
			fat=fat*cont; 
			System.out.print(+n+"! = "+fat);
		}    
		entrada.close();
	} 
}
