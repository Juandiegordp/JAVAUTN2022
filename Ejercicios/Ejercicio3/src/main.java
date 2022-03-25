import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<String> palabras = new ArrayList<>();
		for(int i = 0;i<3;i++) {
			System.out.print("Ingrese palabra: ");
			palabras.add(teclado.next());
		}
		System.out.print("Ingrese palabra a buscar: ");
		String palabraBuscar = teclado.next();
		if (palabras.contains(palabraBuscar)) {
			System.out.println("La palabra " + palabraBuscar + " ya se encuentra cargada");
		}else {
			System.out.println("La palabra " + palabraBuscar + " no se encuentra cargada");;
		}

	}

}
