import java.util.Scanner;

/*9. Dados os lados A,B e C de um tri�ngulo, calcular e exibir o per�metro e a �rea do mesmo. 
(verifique, primeiro, se A,B e C representam um tri�ngulo).*/

public class Exercicio09 {

	public static void main(String[] args) { 
		double a,b,c,semip,area,soma;
		Scanner entrada = new Scanner (System.in);
		System.out.print("Digite o valor de A: ");
		a = entrada.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = entrada.nextDouble();
		System.out.print("Digite o valor de C: ");
		c = entrada.nextDouble();
		if ((a<b+c) && (b<a+c) && (c<a+b)){
			System.out.print("� um triangulo.");
			soma = (a + b + c);
			semip = (soma/2);
			area = Math.sqrt(semip * (semip - a)*(semip - b)*(semip - c));
			System.out.println("A soma de todos os angulos �: " +soma);
			System.out.println("A �rea do tri�ngulo �: " +area);
		}else{
			System.out.println("Digite um valor correspondente a um tri�ngulo.");
		}
		entrada.close(); 
	}

}
