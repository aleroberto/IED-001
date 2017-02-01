package classes;

public class ListaOrdenada {
	Node p;

	public Node getP() {
		return p;
	}

	public ListaOrdenada(){
		p = null;
	}

	public void inserir(int x){
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

	public void remover(int i){  
		Node x = busca(i);  
		//verifica se encontrou o elemento
		if(x == null){ 
			System.out.println("Elemento não está na lista.");
			return;
		}  
		//remove o elemento 
		if(x == p){
			//do inicio 
			this.p = x.getProx();
		}else{
			//do meio da lista 
			x.setProx(x.getProx());
		}
		mostraLista(); //mostra lista apos a remoção
	}

	public Node busca(int i){
		for(Node n = p; n != null; n = n.getProx()){
			if(n.getInfo()==i){
				return n;
			}
		}
		return null; //não achou o elemento
	}

	public boolean listaVazia(){
		return p == null;
	}

	public void mostraLista(){
		Node aux = p; 
		System.out.println("Elementos da Lista:");
		while(aux != null){
			System.out.println(aux.getInfo());
			aux = aux.getProx();
		}
	}


}
