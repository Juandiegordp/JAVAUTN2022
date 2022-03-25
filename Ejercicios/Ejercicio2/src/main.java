import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> palabras = new ArrayList<String>();
		for(int i = 0 ; i<10; i++) {
			palabras.add(teclado.next());
		}
		for(int i = palabras.size()-1;i>=0;i--) {
			System.out.print(palabras.get(i) + " ");
		}
	}

}
