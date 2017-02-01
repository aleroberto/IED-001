/* 1.	Mostrar a seguinte série: 1, 2, 3, ...,50 */

public class Exercicio01 {

	public static void main(String[] args) { 
		//while
		int n =1;
		while (n<=50) {
			System.out.print(n+ " ");
			n++;  
		} 
		//do while
		n=1;
		do {
			System.out.println(n);
			n+=1;
		} while (n<=50);
		//for 
		for(n=1; n<=50; n++){
			System.out.println(n);
		}
	} 
}
