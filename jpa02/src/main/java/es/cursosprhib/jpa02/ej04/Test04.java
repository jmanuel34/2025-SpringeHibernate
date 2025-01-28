package es.cursosprhib.jpa02.ej04;

import es.cursosprhib.jpa02.Emf;
import jakarta.persistence.EntityManager;

public class Test04 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Persona04 p = em.find(Persona04.class, new Persona04Id(12121212, 'A'));
		System.out.println("Test");
		if (p!=null) {
			System.out.println(p);
		}
			
	}

}
