package es.cursosprhib.jpa02.ej06;

import es.cursosprhib.jpa02.Emf;
import jakarta.persistence.EntityManager;

public class Test07 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Circulo c =em.find(Circulo.class, 27);
		if (c!=null) {
			System.out.println(c);
		}
		Rectangulo r =em.find(Rectangulo.class, 26);
		
		if (r!=null) {
			System.out.println(r);
		}
		
		Circulo c2 = new Circulo(12.12, 22.22, 34.0);
		em.persist(c2);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}
