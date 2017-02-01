/* 5.	Calcular e mostrar o seguinte produto: 1.2.3.4.5  */

public class Exercicio05 {

	public static void main(String[] args) {
		int a=1;
		int i=1; 
		//while
		System.out.println("com while");
		while (i<=5) {
			a=a*i;
			i++;
			System.out.print(a + " ");	
		}

		System.out.println(" ");
		//do while
		a=1;
		i=1;
		System.out.println("com do - while");
		do { 
			System.out.print(a + " ");
			i++;
			a=a*i;
		} while (i<=5);  

		System.out.println(" ");
		//for
		System.out.println("com for"); 
		a=1; 
		for (i = 1; i<=5; i++) {
			a=a*i;
			System.out.print(a + " ");
		}   
	}
}