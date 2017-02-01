package TP1;

public class VerificaCPF {

	private String CPF;
	private int Digito1, Digito2;

	void setCpf(String CPF){
		this.CPF = CPF;
	}

	void setDigito1(int Digito1){
		this.Digito1 = Digito1;
	}

	void setDigito2(int Digito2){
		this.Digito2 = Digito2;
	}

	int getDigito1(){
		return this.Digito1;
	}

	int getDigito2(){
		return this.Digito2;
	}

	String getCpf(){
		return this.CPF;
	}

	int verificaD1(String CPF){
		int v[] = new int[11];
		int sum = 0, seq = 10, mod;
		for (int i=0; i<9; i++){
			v[i] = Integer.parseInt(CPF.substring(i,i+1));
			sum = sum + (v[i] * seq);
			seq--;
		}
		mod = sum % 11;
		if (mod == 0 || mod == 1){
			return 0;
		}else{ 
			return (11 - mod);
		}
	}

	int verificaD2(String CPF){
		int v[] = new int[11];
		int sum = 0, seq = 10, mod;
		for (int i=1; i<10; i++){
			v[i] = Integer.parseInt(CPF.substring(i,i+1));
			sum = sum + (v[i] * seq);
			seq--;
		}
		mod = sum % 11;
		if (mod == 0 || mod == 1){
			return 0;
		}else{
			return (11 - mod);
		}
	}

}