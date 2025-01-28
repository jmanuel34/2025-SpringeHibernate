package es.cursosprhib.jpa001.ejemplo01;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Emf {
	private static EntityManagerFactory emf;
	private Emf(){}
	
	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			emf=Persistence.createEntityManagerFactory("ejercicio01");
		}
		return emf;
	}

}
