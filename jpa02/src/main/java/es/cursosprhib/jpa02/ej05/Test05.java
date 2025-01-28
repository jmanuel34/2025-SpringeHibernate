package es.cursosprhib.jpa02.ej05;

import es.cursosprhib.jpa02.Emf;
import jakarta.persistence.EntityManager;

public class Test05 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Persona05 p = em.find(Persona05.class, new Persona05Id(12121212, 'A'));
		System.out.println("Test");
		if (p!=null) {
			System.out.println(p);
		}
			
	}

}
