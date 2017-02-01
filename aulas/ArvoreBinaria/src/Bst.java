
public class Bst {
	private Node pRaiz;

	public Bst(){
		pRaiz = null;
	}

	boolean bstVazia(){
		return pRaiz == null;
	}

	public void insere(int x){ //chama o procedimento abaixo
		pRaiz = insere(pRaiz, x);
	}

	private Node insere(Node t, int x){
		if (t == null){
			t = new Node();
			t.setInfo(x);
			t.setpEsq(null); // t.pEsq = null;
			t.setpDir(null); // t.pDir = null;
		} else{ 
			if (x < t.info){
				t.pEsq = insere(t.pEsq, x);
			} else{
				t.pDir = insere(t.pDir, x);
			}
		}
		return t;
	}

	//chamadas
	
	public void mostraPreOrdem(){
		System.out.println("\n Pré Ordem");
		preOrdem(pRaiz);
	}
	
	public void mostraEmOrdem(){
		System.out.println("\n Em Ordem");
		emOrdem(pRaiz);
	}
	
	public void mostraPosOrdem(){
		System.out.println("\n Pós Ordem");
		posOrdem(pRaiz);
	}
	
	// percorrer 
	private void preOrdem(Node t){ //R E D
		if (t != null){
			System.out.print(t.getInfo() + " "); //mostra a raiz
			preOrdem(t.pEsq);
			preOrdem(t.pDir); 
		}
	} 
	
	private void emOrdem(Node t){ //E R D
		if (t != null){
			emOrdem(t.pEsq);
			System.out.print(t.getInfo() + " "); //mostra a raiz 
			emOrdem(t.pDir);
		}
	}
	 	
	private void posOrdem(Node t){ // E D R
		if (t != null){
			posOrdem(t.pEsq); 
			posOrdem(t.pDir);
			System.out.print(t.getInfo() + " "); //mostra a raiz 
		}
	}
	
}
