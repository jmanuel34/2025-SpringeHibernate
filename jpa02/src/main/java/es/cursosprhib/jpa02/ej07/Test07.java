package es.cursosprhib.jpa02.ej07;

import es.cursosprhib.jpa02.Emf;
import jakarta.persistence.EntityManager;

public class Test07 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Circulo2 c =em.find(Circulo2.class, 67);
		if (c!=null) {
			System.out.println(c);
		}
		Rectangulo2 r =em.find(Rectangulo2.class, 68);
		
		if (r!=null) {
			System.out.println(r);
		}
		
		Circulo2 c2 = new Circulo2(11.11, 22.22, 34.0);
		em.persist(c2);
		em.getTransaction().begin();
		em.getTransaction().commit();
	}

}
