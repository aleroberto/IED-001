package classes; 
public class Pilha {
	Node topo; //topo é um atributo/variavel da classe Node, um objeto.
	public Pilha(){
		topo = null;
	}

	public Node getTopo() {
		return topo;
	}

	public void empilha(int x){
		Node aux = new Node(); 
		aux.setInfo(x);
		aux.setProx(topo);
		topo = aux;
	}

	public boolean pilhavazia(){
		return topo == null; 
	}


}
