import java.util.Scanner;

/*6.	Dado um �ngulo em graus, converter este valor para Radianos */

public class Exercicio06 {

	public static void main(String[] args) { 
		double graus, radiano;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor do �ngulo: ");
		graus = entrada.nextDouble();
		radiano = (Math.PI * graus) / 180;
		System.out.println("A convers�o de: " +graus+ "� para radiano �: " +radiano);
		entrada.close();
		
	}

}
