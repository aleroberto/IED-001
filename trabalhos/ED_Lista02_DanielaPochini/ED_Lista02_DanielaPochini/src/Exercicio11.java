	/* 
	 11.	Calcular e mostrar o valor de Y = X+2X+3X+4X+5X+…+20X, sendo X obtido via teclado. 
	 */

import java.util.Scanner;

public class Exercicio11 {
 
	public static void main(String[] args) { 
		Scanner entrada = new Scanner (System.in);
		int i=1;
		int y=0;
		int x;
		System.out.println("Digite o valor de X: ");
		x = entrada.nextInt();
		//while
		System.out.println("com while");
			while (i<20) {
				y=y+x*i;
				i++;
			}
		System.out.println("O resultado final é "+y);
		entrada.close();
		System.out.println(" ");
		//do while
		i=1;
		y=0;
		System.out.println("com do - while");
		do { 
			y=y+x*i;
			i++; 
		} while (i<20);   
		System.out.println("O resultado final é "+y);
		System.out.println(" ");
		//for
		System.out.println("com for");  
		y=0;
		for (i = 1; i<20; i++) { 
			y=y+x*i;
		}
		System.out.println("O resultado final é "+y);
	}

}
