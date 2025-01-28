package es.cursosprhib.jpa02.ej02;

import es.cursosprhib.jpa02.Emf;
import es.cursosprhib.jpa02.ej03.Genero;
import jakarta.persistence.EntityManager;

public class Test {

	public static void main(String[] args) {
		EntityManager em= Emf.getInstance().createEntityManager();
		Persona02 p1 = em.find(Persona02.class, 10);	
		Persona02 p2 = em.find(Persona02.class, 7);
		System.out.println(p1);
		System.out.println(p2);
		Persona02 nueva = new Persona02();
		nueva.setApellidos("ape");
		nueva.setApodo("apodo");
		nueva.setDni("3243");
		nueva.setNombre("nombre");
		nueva.setGenero(Genero.H);
		em.getTransaction().begin();
		em.persist(nueva);
		em.getTransaction().commit();
	}

}
