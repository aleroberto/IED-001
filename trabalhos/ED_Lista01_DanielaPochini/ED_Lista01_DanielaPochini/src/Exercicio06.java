import java.util.Scanner;

/*6.	Dado um ângulo em graus, converter este valor para Radianos */

public class Exercicio06 {

	public static void main(String[] args) { 
		double graus, radiano;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor do ângulo: ");
		graus = entrada.nextDouble();
		radiano = (Math.PI * graus) / 180;
		System.out.println("A conversão de: " +graus+ "º para radiano é: " +radiano);
		entrada.close();
		
	}

}
