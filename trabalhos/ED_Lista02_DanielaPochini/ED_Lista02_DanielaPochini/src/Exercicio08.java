/*  8.	Faça um algoritmo para  somar os números pares < 1000 
	 e ao final imprimir o resultado. */

public class Exercicio08 {

	public static void main(String[] args) { 
		int i=1;
		int a=0;
		//while
		System.out.println("com while");
		while (i<1000) {
			i++;
			if ((i % 2) == 0) 
				a=a+i; 
		}			 
		System.out.println("O resultado final da soma é: " +a);
		System.out.println(" ");
		//do while
		System.out.println("com do - while");
		do { 
			i++;
			if ((i % 2) == 0) 
				a=a+i;  
		} while (i<1000);   
		System.out.println("O resultado final da soma é: " +a);

		System.out.println(" ");
		//for
		a=0;
		System.out.println("com for");  
		for (i = 1; i<=1000; i++) {
			if ((i % 2) == 0) 
				a=a+i;  
		}    
		System.out.print("O resultado final da soma é: "+a);
	}
}