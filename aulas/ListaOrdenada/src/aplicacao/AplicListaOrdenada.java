package aplicacao;
import classes.ListaOrdenada;
import classes.Node;

public class AplicListaOrdenada {
	public static void main(String[] args) {
		ListaOrdenada lista = new ListaOrdenada();
		lista.insere(3);
		lista.insere(1);
		lista.insere(9);
		lista.insere(8);
		lista.insere(17);
		Node aux = lista.getP();
		while(aux != null){
			System.out.println(aux.getInfo());
			aux = aux.getProx();
		}
	}

}
