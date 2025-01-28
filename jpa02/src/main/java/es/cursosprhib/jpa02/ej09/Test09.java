package es.cursosprhib.jpa02.ej09;

import es.cursosprhib.jpa02.Emf;
import jakarta.persistence.EntityManager;

public class Test09 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Partido p = em.find(Partido.class, 3);
		System.out.println(p);
		System.out.println("---------");
		Campo c = em.find(Campo.class, 1);
		System.out.println(c);
		for( Partido partido: c.getPartidos()) {
			System.out.println(partido);
		}
	}

}
