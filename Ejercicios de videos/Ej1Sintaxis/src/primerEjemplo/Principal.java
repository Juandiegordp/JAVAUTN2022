package primerEjemplo;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Hola Mundo"); 
		int n1;
		int n2 = 3;
		Integer n3 = 5;
		String texto;
		String texto2 = "bienvenido";
		
		n1 = 2;
		n3 = n1 + n2;
		
		Scanner lector = new Scanner(System.in);
		
		//variablesElifs(n1, n2, texto2, lector);
		iterar(lector);
		lector.close();
		
		//String despedida = JOptionPane.showInputDialog("Ingrese saludo final");
		//JOptionPane.showMessageDialog(null, despedida);
	}

	private static void iterar(Scanner lector) {
		String [] palabras = new String[3];
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Ingrese la palabra: " + (i+1));
			palabras[i] = lector.nextLine();
		}
		
		System.out.println();
		System.out.println("Iterar con for");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("Palabras ["+i+ "]: "+palabras[i]);
		}
		
		System.out.println();
		System.out.println("Iterar con for orden inverso");		
		for (int i = palabras.length-1; i >= 0; i--) {
			System.out.println("Palabras ["+i+ "]: "+palabras[i]);
		}
		
		System.out.println();
		System.out.println("Iterar con for each");
		for (String palabra : palabras) {
			System.out.println(palabra); 			
		}
	}
	
	private static void variablesElifs(int n1, int n2, String texto2, Scanner lector) {
		Integer n3;
		String texto;
		System.out.print("Ingrese un texto: ");
		texto = lector.nextLine();
		System.out.print("Ingrese un nro: ");
		n3 = Integer.parseInt(lector.nextLine());
		
		System.out.println("texto: " + texto);
		System.out.println("nro: " + n3);
		
		if (n3 == n2 + n1) {
			System.out.println("Nros Iguales");
		} else {
			System.out.println("Nros Distintos");
		}
		
		System.out.println();
		System.out.println("Comparar con ==");
		if (texto==texto2) {
			System.out.println("Textos Iguales");
		} else {
			System.out.println("Textos Distintos");
		}
		
		System.out.println();
		System.out.println("Comparar con equals");
		if (texto.equals(texto2)) {
			System.out.println("Textos Iguales");
		} else {
			System.out.println("Textos Distintos");
		}
		
		System.out.println();
		System.out.println("Comparar con equalsIgnoreCase");
		if (texto.equalsIgnoreCase(texto2)) {
			System.out.println("Textos Iguales");
		} else {
			System.out.println("Textos Distintos");
		}
	}

}
