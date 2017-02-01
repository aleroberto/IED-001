/* 6.	Calcular o valor A elevado a um expoente B. 
 * Os valores A e B deverão ser obtidos via teclado. Não usar Math.  */

import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i=1;
		int a,b;
		int p=1; 
		System.out.println("digite a base de A: ");
		a=entrada.nextInt();
		System.out.println("digite o expoente B: ");
		b=entrada.nextInt();
		//while
		System.out.println("com while");
		while(i<=b){
			p=p*a;
			i++;
		} 
		System.out.println(a+" elevado a "+b+" = "+p);
		System.out.println(" ");
		//do while
		i=1;
		p=1;
		System.out.println("com do - while");
		do {
			i++;
			p=p*a;
		} while (i<=b); 
		System.out.println(a+" elevado a "+b+" = "+p);

		System.out.println(" ");
		//for
		System.out.println("com for"); 
		p=1; 
		for (i = 1; i<=b; i++) {
			p=p*a; 
		}  
		System.out.print(a+ " elevado a "+b+" = "+p); 
		entrada.close();
	}
}