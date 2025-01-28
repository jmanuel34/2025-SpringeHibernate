package es.cursosprhib.jpa03ejerciciojpa.modelo;

import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Colaborador;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Empleado;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Persona;
import jakarta.persistence.EntityManager;

public class Test01 {
	public static void main(String[] args) {

		EntityManager em = Emf.getInstance().createEntityManager();

		Persona p = em.find(Persona.class, 5);
		System.out.println(p);
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("------------");

		Colaborador c = em.find(Colaborador.class, 11);
		System.out.println(c);
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("------------");

		Empleado e = em.find(Empleado.class, 15);
		System.out.println(e);
		System.out.println("------------");
		System.out.println("------------");
		System.out.println("------------");

		Cliente cli = em.find(Cliente.class, 3);
		System.out.println(cli);
		System.out.println(cli.getProductos());
		em.close();
	}
}
