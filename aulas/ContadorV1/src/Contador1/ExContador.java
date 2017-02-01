package Contador1;
import java.util.Scanner;

public class ExContador {

	public static void main(String[] args) {
		int contador=0, opc;
		Scanner entrada = new Scanner(System.in);
		do{
			System.out.println("Escolha a opção:");
			System.out.println("1 - Incrementar");
			System.out.println("2 - Decrementar");
			System.out.println("3 - Mostrar");
			System.out.print("Selecione:");
			opc = entrada.nextInt();
			switch (opc){
			case 1: 
				contador++;
				break;
			case 2:  
				contador--;
				break;
			case 3:
				System.out.println("Contador: " +contador);
				break;
			case 9:
				System.out.println("Fim.");
				break;
			default:
				break;
			}
		} while(opc!=9);
		entrada.close();
	}
}
