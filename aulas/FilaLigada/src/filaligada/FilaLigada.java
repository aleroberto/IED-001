package filaligada;
import node.Node;

public class FilaLigada {
	private Node inic;
	private Node fim;

	public Node getInic() {
		return inic;
	}
	public Node getFim() {
		return fim;
	}
	public FilaLigada() {
		inic = null;
		fim = null;
	}
	public void insere(int x){
		Node aux = new Node(); //alocando
		aux.setInfo(x);
		aux.setProx(null);
		if (inic == null) {
			inic = aux;
		}else{
			fim.setProx(aux);
		}
		fim = aux;
	}

	public int remove(){
		int temp = inic.getInfo();
		inic = inic.getProx();
		if (inic == null){
			fim = null;
		}
		return temp;
	}
	public int primeiro(){
		return inic.getInfo();
	}
}
