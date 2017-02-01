/*2.	Implemente o algoritmo onde o usuário deve digitar seu nome a sua idade. 
		Em seguida, escreve na tela a frase "Alo Mundo!, o nome e idade, digitados. 
*/
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner entrada = new Scanner(System.in); //entrada de dados
		System.out.print("Digite seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Digite sua idade: ");
		idade = entrada.nextInt();
		System.out.println("Alô mundo " + nome + " sua idade é " + idade);
		entrada.close();
	}

}
