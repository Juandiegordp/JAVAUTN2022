import java.util.Scanner;

import Clases.Administrativo;
import Clases.Empleado;
import Clases.Vendedor;

public class Main {

	public static void main(String[] args) {
		Empleado [] empleados = new Empleado[20];
		Scanner teclado = new Scanner(System.in);
		int dni,sueldoBase, porcenComision,totalVentas,hsExtras, hsMes;
		String nombre,apellido, email, tipo;
		for(int i=0; i<empleados.length;i++) {
			System.out.print("Ingrese dni: ");
			dni = Integer.parseInt(teclado.next());
			System.out.print("Ingrese nombre: ");
			nombre =  teclado.next();
			System.out.print("Ingrese apellido: ");
			apellido = teclado.next();
			System.out.print("Ingrese email: ");
			email = teclado.next();
			System.out.print("Ingrese sueldo base: ");
			sueldoBase = Integer.parseInt(teclado.next());
			System.out.print("Ingrese si es vendedor (v) o administrativo (a)");
			tipo = teclado.next();
			if (tipo.equals("administrativo")){
				System.out.print("Ingrese hs extras: ");
				hsExtras = Integer.parseInt(teclado.next());
				System.out.print("Ingrese hs mes: ");
				hsMes = Integer.parseInt(teclado.next());
				empleados[i] = new Administrativo(dni,nombre,apellido,email,sueldoBase,hsExtras,hsMes);
			}else{
				System.out.print("Ingrese porcentaje de comision: ");
				porcenComision = Integer.parseInt(teclado.next());
				System.out.print("Imgrese total de ventas: ");
				totalVentas = Integer.parseInt(teclado.next());
				empleados[i] = new Vendedor(dni,nombre,apellido,email,sueldoBase,porcenComision,totalVentas);
			}
		}
		for(int i=0; i<empleados.length;i++) {
			System.out.println("El empleado: " + empleados[i].getApellido() + " tiene un sueldo de: " + empleados[i].getSueldo());
			
		}
	}
	
	

}
