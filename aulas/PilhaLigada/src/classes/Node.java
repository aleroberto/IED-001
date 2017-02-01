package classes;

public class Node { 
	private int info;
	private Node prox;

	public void setInfo(int info) {
		this.info = info;
	}

	public void setProx(Node prox) {
		this.prox = prox;
	} 

	public int getInfo() {
		return info;
	}

	public Node getProx() {
		return prox;
	}

}
