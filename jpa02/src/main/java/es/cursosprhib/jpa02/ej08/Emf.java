package es.cursosprhib.jpa02.ej08;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Emf {
	private static EntityManagerFactory emf;
	private Emf(){}
	
	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			emf=Persistence.createEntityManagerFactory("cursojpa");
		}
		return emf;
	}

}
