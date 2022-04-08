package Clases;

public class Vendedor extends Empleado{

	private int porcentComision;
	private int totalVentas;
	
	public int getPorcentComision() {
		return porcentComision;
	}
	public void setPorcentComision(int porcentComision) {
		this.porcentComision = porcentComision;
	}
	public int getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}
	public Vendedor(int dni, String nombre, String apellido, String email, int sueldoBase, int porcentComision,
			int totalVentas) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.porcentComision = porcentComision;
		this.totalVentas = totalVentas;
	}
	@Override
	public double getSueldo() {
		return this.getSueldoBase() + (this.porcentComision* this.totalVentas)/100;
	}
	
	
	
	
	

}
