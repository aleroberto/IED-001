package aplicacao;
import java.util.Scanner;

import classes.ListaOrdenada; 

public class AplicListaOrdenada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opc;
		int valor;
		ListaOrdenada lista = new ListaOrdenada(); 
		do{
			System.out.println("1 - Insere");
			System.out.println("2 - Remove");
			System.out.println("3 - Exibe lista");
			System.out.println("9 - Fim");
			opc = entrada.nextInt();
			switch (opc) {
			case 1: 
				System.out.print("Digite o número: ");
				valor = entrada.nextInt();
				lista.inserir(valor); 
				break;
			case 2:
				System.out.println("Digite o valor a ser removido:");
				valor = entrada.nextInt();
				lista.remover(valor);  
				break;
			case 3: 
				lista.mostraLista();   
				break;
			case 9:
				System.out.println("Fim!");
				break; 
			}
		}while(opc != 9);
		entrada.close();

	}

}
