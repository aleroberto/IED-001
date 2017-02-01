import java.util.Scanner;

/*7.	Dado uma temperatura em graus Celsius, converter para graus Farenheit*/

public class Exercicio07 {

	public static void main(String[] args) { 
		double c, f;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a temperatura em Celsius: ");
		c = entrada.nextDouble();
		f = (c * 1.8) + 32;
		System.out.println("A conversão de: " +c+ "ºC para Farenheit é: " +f +"ºF");
		entrada.close();
	}

}
