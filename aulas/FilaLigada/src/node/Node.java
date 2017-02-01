package node;

public class Node {
	private int info;
	private Node prox;
	public Node(){
		prox=null;
		info=0;
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public Node getProx() {
		return prox;
	}
	public void setProx(Node prox) {
		this.prox = prox;
	}
}
