package Contador2;
public class Contador {
	int contador; 
	/* metodo construtor tem o mesmo nome da classe
	e � responsavel por inicializar as vari�veis da classe */	
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
	int getContador(){ //fun��o sempre retorna
		return contador;
	}
}
