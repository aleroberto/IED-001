
public class Recursivo { 

	// exemplo 1 pdf 
	public static double fatorial(int n){
		if(n == 0){
			return 1;
		} else {
			return n *fatorial(n-1);
		}
	}

	// exercicio 1 
	public static int f(int x, int y){
		if(x == y){
			return x;
		} else {
			if(x < y){
				return f(y,x);
			} else {
				return f(x - y, y);
			}
		}
	}

	// exercicio 2
	public static int s(int m, int n){
		if (n == m){
			return m;
		} else{ 
			return s(m, n- 1) + n;
		}
	} 

	// exercicio 3

	public static int s2(int m, int n){
		if (m == n){
			return m;
		} else {
			return (m + s2(m + 1, n));
		}
	}

	// exercicio 4

	public static int dig(int n){
		if (Math.abs(n) <= 9){
			return 1;
		} else {
			return 1 + (dig(n / 10));
		}
	}

	// exercicio 5

	public static float pot(int x, int n){
		if (n == 0){
			return 1;
		} else {
			if (n < 0){
				return 1 /(pot(x, Math.abs(n)));
			} else {
				return x * pot(x, n - 1);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(fatorial(5)); //exemplo 1 pdf
		System.out.println(f(64, 14)); // ex1
		System.out.println(s(10, 15)); // ex 2
		System.out.println(s2(10, 15)); // ex 3
		System.out.println(s2(1, 10)); // ex 3
		System.out.println(dig(532)); // ex 4
		System.out.println(dig(101)); // ex 4
		System.out.println(pot(2, 5)); // ex 5
		System.out.println(pot(3, 4)); // ex 5
	}
}
