package Contador2;

import java.util.Scanner;

public class AplicContador {
	public static void main(String[] args) {
		/*c1 é um objeto da classe Contador
		"c1." operador de referencia   */		
		Scanner entrada = new Scanner(System.in);
		int opc;
		int vi;
		System.out.println("Digite o valor inicial:");
		vi = entrada.nextInt();
		Contador c1 = new Contador(vi); 
		do{
			System.out.println("1 - Incrementa");
			System.out.println("2 - Decrementa");
			System.out.println("3 - Mostra");
			System.out.println("9 - Fim");
			System.out.print("Selecione: ");
			opc = entrada.nextInt();
			switch (opc){
			case 1:
				c1.incrementa();
				break;
			case 2: 
				c1.decrementa();
				break;
			case 3:
				System.out.println("Valor Contador: " + c1.getContador());
				break;
			case 9:
				System.out.println("Fim");
				break;
			default:
				System.out.println("Opção Inválida.");
				break;
			}
		}while(opc !=9);
		entrada.close();
	}
}
