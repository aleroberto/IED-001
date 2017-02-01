package classes;

public class ListaOrdenada {
	Node p;

	public Node getP() {
		return p;
	}

	public ListaOrdenada(){
		p= null;
	}

	public void insere(int x){
		Node aux = new Node();
		aux.setInfo(x);
		if(p == null || x<p.getInfo()){
			aux.setProx(p);
			p = aux;
		}else{
			Node aux2 = p;
			while((aux2.getProx() != null) &&
					(x > aux2.getProx().getInfo())){
				aux2 = aux2.getProx();
			}
			aux.setProx(aux2.getProx());
			aux2.setProx(aux);
		}
	}

}
