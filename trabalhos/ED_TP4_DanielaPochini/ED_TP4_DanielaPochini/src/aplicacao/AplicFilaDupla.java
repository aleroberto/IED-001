package aplicacao;
import filadupla.FilaDupla;
import java.util.Scanner; 

public class AplicFilaDupla {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor; 
		int opc; 
		FilaDupla fd = new FilaDupla(10);
		do{
			System.out.println("1 - Insere fim");
			System.out.println("2 - Insere inicio");
			System.out.println("3 - Remove inicio");
			System.out.println("4 - Remove fim");
			System.out.println("5 - Primeiro");
			System.out.println("6 - Ultimo");
			System.out.println("7 - Exibir a fila");
			System.out.println("9 - Fim");
			System.out.println("Selecione");
			opc = entrada.nextInt();
			switch (opc) {
			case 1:
				if (fd.filaCheia()) {
					System.out.println("Fila já está cheia!"); 
				}else{
					System.out.println("Digite o valor"); 
					valor = entrada.nextInt();
					fd.insere(valor);
				} 
				break; 
			case 2:
				if (fd.filaCheia()) {
					System.out.println("Fila já está cheia!"); 
				}else{
					System.out.println("Digite o valor"); 
					valor = entrada.nextInt();
					fd.insereInicio(valor);;
				} 
				break;
			case 3:
				if (fd.filaVazia()){
					System.out.println("Fila já está vazia!");
				}else{
					fd.remove();
				} 
				break;
			case 4:
				if (fd.filaVazia()){
					System.out.println("Fila já está vazia!");
				}else{
					fd.removeFim();
				} 
				break;
			case 5:
				System.out.println("O primeiro da fila é: " +fd.primeiroFila());
				break;
			case 6:
				System.out.println("O ultimo da fila é: " + fd.ultimoFila());
				break;
			case 7:
				if(fd.filaVazia()){
					System.out.println("Fila vazia!");
				}
				else{
					System.out.println("Elementos da fila: ");
					if(fd.getInic()<=fd.getFim()){
						for(int i=fd.getInic();i<=fd.getFim();i++){
							System.out.print(fd.getValor(i) + " "); 
						}
					}
					else{
						for(int i=fd.getInic();i<fd.getTamanho();i++){
							System.out.print(fd.getValor(i) + " ");
						}
						for(int i=0;i<=fd.getFim();i++){
							System.out.print(fd.getValor(i) + " ");
						}
					}
					System.out.println(" ");
					break;
				} 
			}
		} while (opc != 9);
		entrada.close();
	}
}
