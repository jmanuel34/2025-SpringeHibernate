package es.cursosprhib.jpa02.ej10;

import java.util.List;

import es.cursosprhib.jpa02.ej03.Emf;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class TestJpql {
	public static void main(String[] args) {
		EntityManager em = Emf.getInstance().createEntityManager();
		String jpql ="Select j from Jugador j";
		TypedQuery<Jugador> q=em.createQuery(jpql, Jugador.class);
		List<Jugador> jugadores = q.getResultList();
		for (Jugador jugador : jugadores) {
			System.out.println(jugador);
			for (Equipo equipo : jugador.getEquipos()) {
				System.out.println(equipo);
			}
		}
		System.out.println("---------------");
		System.out.println("---------------");
		System.out.println("---------------");
		
		String nombre = "Pedro";
		         
		jpql="Select j from Jugador j where j.nombreCompleto like : nom";
		q= em.createQuery(jpql, Jugador.class);
		q.setParameter("nom", "%" +nombre+"%");
		for (Jugador jugador : q.getResultList()) {
			System.out.println(jugador);
		}
	}
}
