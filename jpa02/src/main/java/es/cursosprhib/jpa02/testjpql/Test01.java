package es.cursosprhib.jpa02.testjpql;

import es.cursosprhib.jpa02.ej08.Persona06;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Test01 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		// Todas las personas que viven en la ciudad de Madrid
		String ciudad = "madrid";
		String jpql= "Select p from Persona06 p where p.domicilio.ciudad = :ciudad";
		TypedQuery<Persona06> q = em.createQuery(jpql, Persona06.class);
		q.setParameter("ciudad", ciudad);
		for (Persona06 p : q.getResultList() ) {
			System.out.println(p);
			
		}
	}

}
