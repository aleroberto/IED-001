package fila;

public class Fila {

	protected int elementos[];	//vetor de elementos
	protected int tamanho; //tamanho da fila
	protected int inic;	//indica inicio da fila
	protected int fim;	//indica fim da fila
	protected int qtde;	//quantidade de elementos na fila 
	//construtor da classe
	public Fila (int tamanho){
		this.tamanho = tamanho;
		elementos = new int[tamanho];
		qtde = 0;
		inic = 0;
		fim = -1;
	}

	public void insere (int x){
		fim++;
		if(fim==tamanho)
			fim=0;
		elementos[fim]=x;
		qtde++;
	}

	public void remove(){
		inic++;
		if(inic == tamanho){
			inic = 0;
		}
		qtde--;
	}
	public int getValor(int pos){
		return elementos[pos];
	}
	public int primeiroFila(){
		return elementos[inic];
	}

	public boolean filaVazia(){
		return qtde == 0;
	}
	
	public boolean filaCheia(){
		return qtde == tamanho;
	}
	public int getTamanho() {
		return tamanho;
	}

	public int getInic() {
		return inic;
	}

	public int getFim() {
		return fim;
	}

	public int getQtde() {
		return qtde;
	}


}
