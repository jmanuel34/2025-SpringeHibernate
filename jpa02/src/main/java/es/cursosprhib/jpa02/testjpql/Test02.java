package es.cursosprhib.jpa02.testjpql;

import es.cursosprhib.jpa02.ej08.Persona07;
import es.cursosprhib.jpa02.ej09.Campo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class Test02 {

	public static void main(String[] args) {
		// Campos donde se jugaroan partidos con la descripcion que incluya Semifinal
		EntityManager em = Emf.getInstance().createEntityManager();

//		String jpql = "Select p from Persona07 p left join fetch p.telefonos left join fetch p.domicilio";
//		String jpql = "Select p from Persona07 p left join fetch p.telefonos left join p.domicilio";
//		String jpql = "Select p from Persona07 p left join fetch p.telefonos";
		String jpql = "Select p from Persona07 p left join p.telefonos";
		TypedQuery<Persona07> q = em.createQuery(jpql, Persona07.class);
//		q.setParameter("part", "%"+ paramPartido +" %");
		for (Persona07 p : q.getResultList() ) {
			System.out.println(p);
			for (String telefono: p.getTelefonos()) {
				System.out.println(telefono);
			}
			
		}
	}	
}
