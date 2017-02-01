/* 7.	Ler um valor x qualquer, calcular e mostrar o resultado da expressão:
 			Y = (x+1)+(x+2)+(x+3)+(x+4)+(x+5)+…(x+100).
 */

import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite o valor de X:");
		int x = entrada.nextInt();
		int i=1;
		int y=x;
		//while
		System.out.println("com while");
		while (i<100){
			y=y+i;
			i++;
		} 
		System.out.print("O resultado final é: "+y);

		System.out.println(" ");
		//do while
		i=1; 
		y=x;
		System.out.println("com do - while");
		do { 
			y=y+i;
			i++; 
		} while (i<100);   
		System.out.print("O resultado final é: "+y);

		System.out.println(" ");
		//for
		System.out.println("com for");  
		y=x;
		for (i = 1; i<100; i++) {
			y=y+i;
		}    
		System.out.print("O resultado final é: "+y);

		entrada.close();
	}
}