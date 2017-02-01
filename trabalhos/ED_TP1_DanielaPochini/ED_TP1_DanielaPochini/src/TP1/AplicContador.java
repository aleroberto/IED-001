package TP1;

import java.util.Scanner;

public class AplicContador {
	public static void main(String[] args) {
		String CPF;
		VerificaCPF v = new VerificaCPF();
		Scanner entrada = new Scanner(System.in);
		int opc;   
		int linha, coluna;
		System.out.println("Bem-vindx ao Teatro VIP!");
		System.out.println("Digite o número do CPF (sem pontos e traços) para confirmar sua entrada.");
		CPF = entrada.next();
		if (CPF.length() != 11){
			System.out.println("CPF Incorreto! Digitos inferiores a 11.");
		} else{
			v.setDigito1(Integer.parseInt(CPF.substring(9,10)));
			v.setDigito2(Integer.parseInt(CPF.substring(10,11)));
			if ((v.getDigito1() == v.verificaD1(CPF)) && (v.getDigito2() == v.verificaD2(CPF))){
				System.out.println("CPF Válido. Acesso VIP liberado!");
				System.out.print("Digite a quantidade de linhas: ");
				linha = entrada.nextInt();
				System.out.print("Digite a quantidade de colunas: ");
				coluna = entrada.nextInt();
				Contador teatro = new Contador(linha, coluna);
				do{
					System.out.println("1 - Insere");
					System.out.println("2 - Remove");
					System.out.println("3 - Mostra");
					System.out.println("9 - Fim");
					System.out.print("Selecione: ");
					opc = entrada.nextInt();
					switch (opc){
					case 1: 
						System.out.println("Linha:");
						linha = entrada.nextInt();
						System.out.println("Coluna:");
						coluna = entrada.nextInt();
						teatro.insere(linha, coluna, CPF);
						break;
					case 2:  
						System.out.println("Linha:");
						linha = entrada.nextInt();
						System.out.println("Coluna:");
						coluna = entrada.nextInt();
						teatro.remove(linha, coluna);
						break;
					case 3:
						System.out.println("Situação atual do Teatro:");
						for (int i = 0; i < teatro.getLinha(); i++) {
							for (int j = 0; j < teatro.getColuna(); j++) {
								System.out.print(teatro.getValor(i, j) + " ");
							}
							System.out.println("");
						}
						break;
					case 9:
						System.out.println("Fim.");
						break;
					default:
						System.out.println("Opção Inválida.");
						break;
					}
				}while(opc !=9);
			}else{
				System.out.println("CPF Inválido. Acesso Negado.");
			}
		}
		entrada.close(); 
	}
}
