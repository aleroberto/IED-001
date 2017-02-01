/*3.	Calcular e exibir a área e o perímetro de um retângulo 
 * 		sendo os lados digitados pelo usuário. */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		float base, altura, area, perimetro;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a base: ");
		base = entrada.nextFloat();
		System.out.print("Digite a altura: ");
		altura = entrada.nextFloat();
		area = base * altura;
		perimetro = (2*base) + (2*altura);
		System.out.println("O resultado é: " + area);
		System.out.println("O perimetro é: " + perimetro);
		entrada.close();
	}
}
