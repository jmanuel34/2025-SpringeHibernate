package es.cursosprhib.mediosdepago.modelo;


import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Emf {
	private static EntityManagerFactory emf;
	private Emf(){}
	
	public static EntityManagerFactory getInstance() {
		if (emf == null) {
			emf=Persistence.createEntityManagerFactory("p01mdp_modelo");
		}
		return emf;
	}

}
