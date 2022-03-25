import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese número: ");
		int num = Integer.parseInt(teclado.next());
		ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(3, 1, 4,10,20,40,56,4,7,8,0,1,45,10,36,85));
		ArrayList<Integer> mayores = new ArrayList<>();
		for(int numero : numeros) {
			if (numero > num) {
				mayores.add(numero)		;		
			}
		}
		for(int numero: mayores) {
			System.out.print(numero + " ");
		}

	}

}
