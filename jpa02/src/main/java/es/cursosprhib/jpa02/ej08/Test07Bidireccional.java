package es.cursosprhib.jpa02.ej08;

import jakarta.persistence.EntityManager;

public class Test07Bidireccional {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Persona07 p = em.find(Persona07.class, 6);
		System.out.println(p);
		Domicilio02 dom = em.find(Domicilio02.class, 3);
		System.out.println(dom);
		System.out.println(dom.getPersona());
	}

}
