package es.cursosprhib.spr01xml.servicios;

public class Servicio01Impl implements Servicio01 {

	private String descripcion;
	
	
	public Servicio01Impl() {
		System.out.println("Constructor por defecto de Servicio01Impl");
	}
	
	public Servicio01Impl(String descripcion) {
		this.descripcion = descripcion;
		System.out.println("Constructor Servicio01Impl(String)");
		System.out.println(this.descripcion);
	}
	
	public Servicio01Impl(String descripcion, int numero) {
		this.descripcion = descripcion;
		System.out.println("Constructor Servicio01Impl(String, numero)");
	}
	
	@Override
	public void m1() {
		System.out.println("Método de servicio de Servicio01Impl");
	}

	@Override
	public String getDescripcion() {
		return descripcion;
		
	}

	@Override
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
		System.out.println("Chivato de descripcion");
	}

}
