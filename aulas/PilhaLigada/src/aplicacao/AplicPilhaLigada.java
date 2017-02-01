package aplicacao; 
import classes.Pilha;
import classes.Node;

public class AplicPilhaLigada {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.empilha(5);
		p.empilha(3);
		p.empilha(9);
		p.empilha(2);

		//percorre a lista
		Node aux = p.getTopo();
		while(aux != null){
			System.out.println(aux.getInfo());
			aux = aux.getProx();
		}

	}
}
