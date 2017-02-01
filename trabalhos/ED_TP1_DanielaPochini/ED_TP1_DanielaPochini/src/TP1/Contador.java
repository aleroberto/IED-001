package TP1;

public class Contador {
	int contador;
	int linha, coluna;
	String cpf;
	String[][] matriz; 

	Contador(int linha, int coluna){
		contador = 0;
		this.linha = linha;
		this.coluna = coluna;
		matriz = new String[linha][coluna];
	}
	void insere(int linha, int coluna, String cpf){ 
		matriz[linha][coluna]=cpf;
		contador++;
	}
	void remove(int linha, int coluna){
		matriz[linha][coluna]=null;
		contador--;
	}
	int getLinha(){
		return linha;
	}
	int getColuna(){
		return coluna;
	}
	int getContador(){
		return contador;
	}
	String getValor(int linha, int coluna){
		return matriz[linha][coluna];
	}
}
