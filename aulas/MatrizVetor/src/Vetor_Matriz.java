
public class Vetor_Matriz {

	public static void main(String[] args) {
		/*		int v[] = new int[10];
		for (int i = 0; i < 10; i++) {
			v[i] = i;
		}
		int v2[]={0,1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < 10; i++) {
			System.out.println(v2[i] = i);
		}
		 */
		int m[][] = new int[3][3];
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				m[i][j] = i * j;
			}
		}
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(m[i][j]);
			}
			System.out.println(" ");
		}

		int m2[][] = {
				{1,2,3},
				{3,2,3},
				{6,5,4}
		}; 
		for(int i=0;i<3;i++){
			for (int j=0; j<3; j++){
				System.out.println(m2[i][j]);
			}
		}
	}

}
