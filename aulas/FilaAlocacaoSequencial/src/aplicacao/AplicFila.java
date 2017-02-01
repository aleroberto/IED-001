package aplicacao;
import fila.Fila;
import java.util.Scanner; 

public class AplicFila {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor;
		int tamanho;
		int opc;
		System.out.println("Digite o tamanho da fila");
		tamanho = entrada.nextInt(); 
		Fila fila = new Fila(tamanho);
		do{
			System.out.println("1 - Insere");
			System.out.println("2 - Remove");
			System.out.println("3 - Primeiro");
			System.out.println("4 - Quantidade de elementos");
			System.out.println("5 - Exibe a fila");
			System.out.println("Selecione");
			opc = entrada.nextInt();
			switch (opc) {
			case 1:
				if (fila.filaCheia()) {
					System.out.println("Fila já está cheia!"); 
				}else{
					System.out.println("Digite o valor"); 
					valor = entrada.nextInt();
					fila.insere(valor);
				} 
				break; 
			case 2:
				if (fila.filaVazia()){
					System.out.println("Fila já está vazia!");
				}else{
					fila.remove();
				}
				break;
			case 3:
				System.out.println("O primeiro elemento da fila é: " +fila.primeiroFila());
				break;
			case 4:
				System.out.println("A quantidade de elementos é de: " + fila.getQtde());
				break;
			case 5:
				if(fila.filaVazia()){
					System.out.println("Fila vazia!");
				}
				else{
					System.out.println("Elementos da fila: ");
					if(fila.getInic()<=fila.getFim()){
						for(int i=fila.getInic();i<=fila.getFim();i++){
							System.out.print(fila.getValor(i) + " "); 
						}
					}
					else{
						for(int i=fila.getInic();i<fila.getTamanho();i++){
							System.out.print(fila.getValor(i) + " ");
						}
						for(int i=0;i<=fila.getFim();i++){
							System.out.print(fila.getValor(i) + " ");
						}
					}
					System.out.println(" ");
					break;
				} 
				break;
			}

		} while (opc != 9);
		entrada.close();
	}
}
