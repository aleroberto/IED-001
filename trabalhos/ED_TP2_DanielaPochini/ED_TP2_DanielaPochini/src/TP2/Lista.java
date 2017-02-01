package TP2;
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

	public int buscaLista(int x) {
		for (int i = 0; i < v.length; i++)
			if (v[i] == x)
				return i;
		return -1; // Não achou, retorna -1
	}

	void ordenaLista() {
		int i, j, menor, aux;
		for (j = 0; j <= getP()-1; j++) {
			menor = j;
			for (i = j+1; i <= getP(); i++)
				if (v[i] < v[menor])
					menor = i; 
			aux = v[j];
			v[j] = v[menor];
			v[menor] = aux;
		}
	}

	void menorValor(){
		int i, menor = v[0];
		for (i = 0; i <= getP(); i++)
			if (v[i] < menor)
				menor = v[i]; 
		System.out.println("O menor valor é: " + menor);
	}

	void maiorValor(){
		int i, maior = v[0];
		for (i = 0; i <= getP(); i++)
			if (v[i] > maior)
				maior = v[i]; 
		System.out.println("O maior valor é: " + maior);
	}

	/*	void ordenaLista(){
		int aux = 0;
		for(int i = 0; i< v.length; i++){
			for(int j = 0; j< v.length-1; j++){
				if(v[j] > v[j + 1]){
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
	}*/
}
