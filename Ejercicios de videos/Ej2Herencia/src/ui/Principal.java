package ui;

import entidades.Alumno;
import entidades.Persona;

public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		
		System.out.println("p1 sin param: " + p1.getDetalle(true));
		
		p1.setDni(41654789);
		p1.setApellido("Ruiz");
		p1.setNombre("Juan");
		
		System.out.println("p1 despues de set: " + p1.getDetalle(true));
		
		Persona p2 = new Persona(41258963,"Jose","Lopez");
		System.out.println("p2: " +p2.getDetalle(true));
		
		Alumno al = new Alumno();
		
		System.out.println("Al: " + al.getDetalle(true));
		
		Alumno a2 = new Alumno(123,333333,"Alumno", "Ejemplar");
		System.out.println("Al: " + a2.getDetalle(true));
		
		Persona a3 = new Alumno(456,4444,"Algo", "Extraño");
		
		a3.setDni(4444);
		a3.setApellido("Algo");
		a3.setNombre("Extraño");
		((Alumno)a3).setLegajo(456);
		System.out.println("A3: " + a3.getDetalle(true));
		
		

	}

}
