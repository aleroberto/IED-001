package TP3;

public class Pilha {
	private char elementos[];
	private int topo;
	private int tamanho;

	Pilha(){	
		this.tamanho = 30;
		elementos = new char [tamanho];
		topo = -1;
	}
	public void empilha(char x){
		topo++;
		elementos[topo] = x;
	}
	public char desempilha(){ 
		return elementos[topo--];
	}
	public char elementoDoTopo(){
		return elementos[topo];
	}
	public boolean pilhaVazia(){
		return topo == -1;
	}
	public boolean pilhaCheia(){
		return topo == tamanho - 1;
	}

	public char getElemento(char pos){
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
