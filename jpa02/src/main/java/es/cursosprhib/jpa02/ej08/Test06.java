package es.cursosprhib.jpa02.ej08;

import jakarta.persistence.EntityManager;

public class Test06 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Persona06 p = em.find(Persona06.class, 6);
		System.out.println(p);
	}

}
