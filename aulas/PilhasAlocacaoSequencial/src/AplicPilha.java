import java.util.Scanner;

public class AplicPilha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opc;
		int valor;
		int tamanho;
		System.out.println("Digite o tamanho da pilha: ");
		tamanho = entrada.nextInt();
		Pilha pilha = new Pilha(tamanho);
		do{
			System.out.println("1 - Empilha");
			System.out.println("2 - Desempilha");
			System.out.println("3 - Mostra Pilha");
			System.out.println("4 - Elemento do Topo");
			System.out.println("5 - Quantidade de Elementos");
			System.out.println("9 - Fim");
			System.out.println("Escolha uma opção: ");
			opc = entrada.nextInt();
			System.out.println(" ");
			switch (opc) {
			case 1:
				if (pilha.pilhaCheia()){
					System.out.println("Pilha cheia.");
				}else{
					System.out.print("Digite o número: ");
					valor = entrada.nextInt();
					pilha.empilha(valor);
				} 
				break;
			case 2:
				if (pilha.pilhaVazia()){
					System.out.println("Pilha vazia!");
				}else{
					int temp = pilha.desempilha();
					System.out.println("Removido: " +temp);
				}
				break;
			case 3:
				System.out.println("Elementos da Pilha:"); 
				if (pilha.pilhaVazia()){
					System.out.println("Pilha vazia!");
				}else{
					for (int i = 0; i <= pilha.getTopo(); i++) {
						System.out.print(pilha.getElemento(i) + " ");
					}
					System.out.println(" ");
				}
				break;
			case 4:
				if(pilha.pilhaVazia()){
					System.out.println("Pilha vazia seu zé");
				}else{
					System.out.println("o elemento do Topo é:" + pilha.elementoDoTopo());
				}
				break;
			case 5:
				if(pilha.pilhaVazia()){
					System.out.println("Pilha vazia seu zé");
				}else{
					System.out.println(pilha.getQtde());
				}
				break;
			case 9:
				System.out.println("Acabo, Boa Sorte...");
				break;
			}
		} while(opc != 9);
		entrada.close();
	} 


}


