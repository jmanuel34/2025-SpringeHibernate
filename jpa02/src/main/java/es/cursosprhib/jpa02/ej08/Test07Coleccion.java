package es.cursosprhib.jpa02.ej08;

import jakarta.persistence.EntityManager;

public class Test07Coleccion {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Persona07 p = em.find(Persona07.class, 2);
		System.out.println(p);
//		System.out.println(p.getTelefonos());

	}

}
