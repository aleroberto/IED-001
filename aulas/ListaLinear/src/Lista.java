public class Lista {
	private int v[]; // vetor de inteiros
	private int p; // indice do vetor
	private int tamanho; //tamanho do vetor 

	Lista(int tamanho) { 
		v = new int[tamanho];
		p=-1;
		this.tamanho = tamanho;
	}

	public void insere(int x){
		p=p+1;
		v[p]=x;
	}

	public int remove(){
		int temp = v[p];
		p=p-1;
		return temp;
	}

	int getValor(int pos){
		return v[pos];
	}
	public int getP() {
		return p;
	}

	public int getTamanho() {
		return tamanho;
	}

	public boolean listaCheia(){
		return p == tamanho-1;
	}

	public boolean listaVazia(){
		return p == -1;
	}
}
