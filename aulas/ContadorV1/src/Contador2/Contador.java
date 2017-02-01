package Contador2;
public class Contador {
	int contador; 
	/* metodo construtor tem o mesmo nome da classe
	e é responsavel por inicializar as variáveis da classe */	
	Contador(int valor_inicial){
		contador = valor_inicial;
	}
	void incrementa(){ //procedimento
		contador++;
	}
	void decrementa(){
		contador--;
		if(contador<0){
			contador=0;
		}
	}
	int getContador(){ //função sempre retorna
		return contador;
	}
}
