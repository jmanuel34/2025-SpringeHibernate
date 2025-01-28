package es.cursosprhib.spr01xml.servicios;

public class FactoriaServicio01Instancia {
	
	public Servicio01 getInstance() {
		System.out.println("Creando servicio por factoria Nueva");
		return new Servicio01Impl();
	}

}
