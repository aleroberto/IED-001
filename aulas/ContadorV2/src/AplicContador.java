import java.util.Scanner;

public class AplicContador {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opc;   
		int linha, coluna;
		System.out.print("Digite a quantidade de linhas: ");
		linha = entrada.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		coluna = entrada.nextInt();
		Contador teatro = new Contador(linha, coluna);
		do{
			System.out.println("1 - Insere");
			System.out.println("2 - Remove");
			System.out.println("3 - Mostra");
			System.out.println("9 - Fim");
			System.out.print("Selecione: ");
			opc = entrada.nextInt();
			switch (opc){
			case 1: 
				System.out.println("Linha:");
				linha = entrada.nextInt();
				System.out.println("Coluna:");
				coluna = entrada.nextInt();
				teatro.insere(linha, coluna);
				break;
			case 2:  
				System.out.println("Linha:");
				linha = entrada.nextInt();
				System.out.println("Coluna:");
				coluna = entrada.nextInt();
				teatro.remove(linha, coluna);
				break;
			case 3:
				System.out.println("Situação atual do Teatro:");
				for (int i = 0; i < teatro.getLinha(); i++) {
					for (int j = 0; j < teatro.getColuna(); j++) {
						System.out.print(teatro.getValor(i, j) + " ");
					}
					System.out.println("");
				}
				break;
			case 9:
				System.out.println("Fim.");
				break;
			default:
				System.out.println("Opção Inválida.");
				break;
			}
		}while(opc !=9);
		entrada.close(); 
	}
}
