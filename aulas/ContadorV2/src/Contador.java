
public class Contador {
	int contador;
	int linha, coluna;
	boolean matriz[][]; //[] linha e [] coluna
	//int m[][] = new int[10][10] - matriz 10x10
	Contador(int linha, int coluna){
		contador = 0;
		this.linha = linha;
		this.coluna = coluna;
		matriz = new boolean[linha][coluna];
	}
	void insere(int linha, int coluna){ 
		matriz[linha][coluna]=true;
		contador++;
	}
	void remove(int linha, int coluna){
		matriz[linha][coluna]=false;
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
	boolean getValor(int linha, int coluna){
		return matriz[linha][coluna];
	}
}
