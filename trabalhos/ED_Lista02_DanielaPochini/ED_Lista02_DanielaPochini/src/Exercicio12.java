/* 
 12.	Calcular e mostrar o valor  aproximado de PI com 51 termos 
 */ 
public class Exercicio12 {

	public static void main(String[] args) { 
		int i=1;
		int i2=1;
		double s=0;
		double p=0;
		//while
		System.out.println("com while");
			while (i<=50) {
				s=s+(1/Math.pow(i2, 3));
				i2=i2+2;
				i=i+1;
				p=(s*32)+Math.exp (1/3);
			} 
		System.out.println("Valor de Pi: " +p);
		System.out.println(" ");
		//do while
		i2=1;
		i=1;
		s=0;
		p=0;
		System.out.println("com do - while");
		do { 
			s=s+(1/Math.pow(i2, 3));
			i2=i2+2;
			i=i+1;
			p=(s*32)+Math.exp (1/3); 
		} while (i<=50);   
		System.out.println("Valor de Pi: " +p);
		
		System.out.println(" ");
		//for
		System.out.println("com for"); 
		i2=1; 
		s=0;
		p=0;
		for (i = 1; i<=50; i++) {
			s=s+(1/Math.pow(i2, 3));
			i2=i2+2;
			i=i+1;
			p=(s*32)+Math.exp (1/3);  
		}    
		System.out.println("Valor de Pi: " +p);
	}

}
