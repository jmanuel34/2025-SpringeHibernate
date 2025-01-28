package es.cursosprhib.jpa02.ej03;

import jakarta.persistence.EntityManager;

public class Test03 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Persona03 p = em.find(Persona03.class, 7);
		System.out.println(p);
	}

}
