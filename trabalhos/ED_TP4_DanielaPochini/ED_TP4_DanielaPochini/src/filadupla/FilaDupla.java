package filadupla;

import fila.Fila;

public class FilaDupla extends Fila { //classe filha, herança

	public FilaDupla(int tamanho) {
		super(tamanho); //super é o construtor da classe mãe, Fila.
	} 
	
	public void insereInicio(int x){
		inic--;
		if(inic == -1){
			inic = tamanho-1;
		}
		elementos[inic] = x;
		qtde++;
	}
	
	public void removeFim(){
		fim--;
		if(fim == -1){
			fim = tamanho -1;
		}
		qtde--;
	}
	
	public int ultimoFila(){
		return elementos[fim];
	}
}
