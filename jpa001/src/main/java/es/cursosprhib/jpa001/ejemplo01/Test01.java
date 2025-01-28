package es.cursosprhib.jpa001.ejemplo01;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Test01 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Persona p = em.find(Persona.class, 1);
		System.out.println(p);
		Persona p1 = new Persona();
		p1.setNombre("nom");
		p1.setApellidos("ape");
		p1.setApodo("apodo");
		p1.setDni("4567");
		em.getTransaction().begin();
//		em.persist(p1);
		em.merge(p);
		em.getTransaction().commit();
		System.out.println(p);
	}

}
