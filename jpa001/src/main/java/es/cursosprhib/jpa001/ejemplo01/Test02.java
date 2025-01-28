package es.cursosprhib.jpa001.ejemplo01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Test02 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Persona p = em.find(Persona.class, 2);
		System.out.println(p);
		
		em.getTransaction().begin();
//		
		em.remove(p);
		em.getTransaction().commit();
		System.out.println(p);
	}

}
