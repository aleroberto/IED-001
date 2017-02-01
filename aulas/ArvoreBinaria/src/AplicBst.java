
public class AplicBst {

	public static void main(String[] args) {
		Bst t1 = new Bst();
		t1.insere(13);
		t1.insere(6);
		t1.insere(19);
		t1.insere(4);
		t1.insere(10);
		t1.insere(16);
		t1.insere(21);
		t1.insere(1);
		t1.insere(5);
		t1.insere(8);
		
		//exibindo as arvores
		t1.mostraPreOrdem();
		t1.mostraEmOrdem();
		t1.mostraPosOrdem();
	}

}
