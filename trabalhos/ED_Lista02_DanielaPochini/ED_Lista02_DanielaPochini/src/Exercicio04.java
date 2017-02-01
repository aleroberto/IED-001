/* 4.	Calcular  e mostrar 
 * o resultado da seguinte série: 1+2+3+...+50.  */

public class Exercicio04 {
	public static void main(String[] args) { 
		int i=1;
		int a=0;
		//while
		System.out.println("com while");
		while (i<=50) {
			System.out.print(a+ " ");
			a=a+i;
			i++;
		}
		System.out.println(" ");
		//do while
		i=1;
		a=0;
		System.out.println("com do - while");
		do {
			System.out.print(a+ " ");
			a=a+i;
			i++;
		} while (i<=50);
		System.out.println(" ");
		//for
		System.out.println("com for"); 
		a=0;
		for (i = 0; i<50; i++) {
			a=a+i;
			System.out.print(a + " ");  

		}
	}
}
