
public class main {

	public static void main(String[] args) {
		System.out.print("Los primeros 10 números enteros son: ");
		for(int i=0;i<10;i++) {
			System.out.print(i +" ");			
		}
		System.out.println();
		System.out.print("Los primeros 10 números impares son: ");
		int cantImpares = 0;
		int i = 0;
		while(cantImpares < 10) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				cantImpares++;
			}
			i++;
			
		}
	}

}
