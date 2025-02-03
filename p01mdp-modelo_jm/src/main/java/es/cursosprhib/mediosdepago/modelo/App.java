package es.cursosprhib.mediosdepago.modelo;

import jakarta.persistence.EntityManager;

public class App {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
	/*
		Cliente c = em.find(Cliente.class, 4);
		System.out.println(c.apellido1);
		Cuenta cuenta = em.find(Cuenta.class, 10);
		System.out.println(cuenta.getNroCuenta());
	//*/
		//*		
		Tarjeta t = em.find(Tarjeta.class, 10 );
		System.out.println(t.getPan());
		
		Movimiento m= em.find(Movimiento.class, 1);
		System.out.println(m.getTarjeta());
//*/
	}

}
