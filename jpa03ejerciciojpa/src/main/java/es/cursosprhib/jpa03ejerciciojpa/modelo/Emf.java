package es.cursosprhib.jpa03ejerciciojpa.modelo;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Emf {
	private static EntityManagerFactory emf;

	private Emf() {
	}

	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("ejerciciojpa");
		}
		return emf;
	}

}
