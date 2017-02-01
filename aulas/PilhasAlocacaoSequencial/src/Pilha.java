
public class Pilha {
	private int elementos[];
	private int topo;
	private int tamanho;

	Pilha(int tamanho){	
		this.tamanho = tamanho;
		elementos = new int [tamanho];
		topo = -1;
	}
	public void empilha(int x){
		topo++;
		elementos[topo] = x;
	}
	public int desempilha(){
		int temp = elementos[topo];
		topo--;
		return temp;
	}
	public int elementoDoTopo(){
		return elementos[topo];
	}
	public boolean pilhaVazia(){
		return topo == -1;
	}
	public boolean pilhaCheia(){
		return topo == tamanho - 1;
	}

	public int getElemento(int pos){
		return elementos[pos];
	}
	public int getTopo() {
		return topo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public int getQtde(){
		return topo+1;
	}


}
