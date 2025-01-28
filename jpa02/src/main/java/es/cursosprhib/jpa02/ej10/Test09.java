package es.cursosprhib.jpa02.ej10;

import es.cursosprhib.jpa02.Emf;
import jakarta.persistence.EntityManager;

public class Test09 {

	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		Jugador j = em.find(Jugador.class, 10);
		System.out.println(j);
		System.out.println(j.getEquipos());
	}

}
