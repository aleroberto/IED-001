import java.util.Scanner;

/* 	5.	Dado o raio de um círculo, calcular e exibir 
a área do mesmo e o comprimento de sua circunferência. */

public class Exercicio05 {
	public static void main(String[] args) {
		double area, raio, comprimento;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor do raio:");
		raio = entrada.nextDouble();
		area = Math.PI * Math.pow(raio, 2);
		comprimento = 2 * (Math.PI * raio);
		System.out.println("Área: " +area);
		System.out.println("Circunferência: " +comprimento);
		entrada.close();
	}
}
