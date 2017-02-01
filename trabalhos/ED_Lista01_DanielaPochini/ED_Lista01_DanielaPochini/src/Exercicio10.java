import java.util.Scanner;

/*10.	Dado um valor x, qualquer, calcular e exibir o valor da função: */ 
public class Exercicio10 {

	public static void main(String[] args) {
		double x,y;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o valor de X: ");
		x = entrada.nextInt();
		y = ((Math.pow(x, 2)) + (3 * Math.PI));
		System.out.println("O valor da função Y é: " +y);
		entrada.close();
	}

}
