/*4.	Dado o raio de uma esfera, calcular e exibir o seu volume. */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		double raio, volume;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o raio");
		raio = entrada.nextDouble();
		volume = (4.0/3.0)* Math.PI * Math.pow(raio, 2);
		System.out.println("O resultado é: " +volume);
		entrada.close();
	}
}
