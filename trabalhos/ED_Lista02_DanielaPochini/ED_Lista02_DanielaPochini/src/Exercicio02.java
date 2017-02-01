/* 2.	Mostrar a seguinte série: 1, 3, 5, 7,..., 99 */

public class Exercicio02 {

	public static void main(String[] args) { 
		int n=1;
		//while
		System.out.println("com while");
		while (n<=100) {
			System.out.print(n+ " ");
			n+=2;
		} 
		System.out.println(" ");
		//do while
		System.out.println("com do - while");
		n=1;
		do {
			System.out.print(n+ " ");
			n+=2;
		} while (n<=100);
		System.out.println(" ");
		//for
		System.out.println("com for");
		for (n = 1; n<=100; n+=2) {
			System.out.print(n + " ");

		}
	} 
}
