package TP3;
import java.util.Scanner;

public class AplicPilha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String expressao;
		int i;
		char aux;
		char simbolo; 
		boolean valido; 
		Pilha pilha = new Pilha();
		System.out.println("Digite a expressão: ");
		expressao = entrada.next();
		valido = true;
		i=0;
		while (i < expressao.length()) {
			simbolo = expressao.charAt(i);
			if (simbolo == '(' || simbolo == '[' || simbolo == '{'){
				pilha.empilha(simbolo);
			} 
			if (simbolo == ')' || simbolo == ']' || simbolo == '}'){
				if (pilha.pilhaVazia()){
					valido = false; 
					break;
				}else{
					if(pilha.pilhaVazia()){
						System.out.println("pilha vazia");
					}else{
						aux = pilha.desempilha(); 
						if(aux == '(' && simbolo != ')' || aux == '[' && simbolo != ']' || aux == '{' && simbolo != '}')
						{
							valido = false; 
							break;
						}

					}
				} 
			}  
			i++; 
		}    
		if(valido) {
			System.out.println("Expressão correta");
		} else {
			System.out.println("Expressão inválida");
		}
		entrada.close(); 
	}
}


