import java.util.Scanner;

public class AplicLista {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opc;
		int valor;
		int tamanho;
		System.out.println("Digite o tamanho da lista: ");
		tamanho = entrada.nextInt();
		Lista lista = new Lista(tamanho);
		do{
			System.out.println("1 - Insere");
			System.out.println("2 - Remove");
			System.out.println("3 - Exibe lista");
			System.out.println("9 - Fim");
			opc = entrada.nextInt();
			switch (opc) {
			case 1:
				if (lista.listaCheia()){
					System.out.println("Lista cheia.");
				}else{
					System.out.print("Digite o número: ");
					valor = entrada.nextInt();
					lista.insere(valor);
				} 
				break;
			case 2:
				if (lista.listaVazia()){
					System.out.println("Lista vazia!");
				}else{
					int temp = lista.remove();
					System.out.println("Removido: " +temp);
				}
				break;
			case 3:
				System.out.println("Elementos da Lista:"); 
				if (lista.listaVazia()){
					System.out.println("Lista vazia!");
				}else{
					for (int i = 0; i < lista.getP(); i++) {
						System.out.print(lista.getValor(i));
					}
					System.out.println(" ");
				}
				break;
			case 9:
				System.out.println("Fim!");
				break;
			}
		} while(opc != 9);
		entrada.close();
	} 
}
