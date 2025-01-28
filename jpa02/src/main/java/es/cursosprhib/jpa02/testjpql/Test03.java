package es.cursosprhib.jpa02.testjpql;

import es.cursosprhib.jpa02.ej08.Persona06;
import es.cursosprhib.jpa02.ej09.Campo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Test03 {

	public static void main(String[] args) {
		// Campos donde se jugaroan partidos con la descripcion que incluya Semifinal
		EntityManager em = Emf.getInstance().createEntityManager();
		String paramPartido = "Semifinal";
		String jpql = "Select c from Campo c join c.partidos p where p.partido like :part";

		TypedQuery<Campo> q = em.createQuery(jpql, Campo.class);
		q.setParameter("part", "%"+ paramPartido +" %");
		for (Campo c : q.getResultList() ) {
			System.out.println(c);
			
		}
	}	
}
