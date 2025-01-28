package es.cursosprhib.jpa03ejerciciojpa.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class app {

	public static void main(String[] args) {
		EntityManager emf = Emf.getInstance().createEntityManager();
		/*
		 * Empleado e = emf.find(Empleado.class, 5); System.out.println(e);
		 * 
		 * Producto p = emf.find(Producto.class, 1 ); System.out.println(p); //
		 */
//		1.- Listar todos los clientes de una categoria parametrizada
		String categoria = "VIP";
		String jpql = ("Select c from Cliente c where c.categoria like :cat");
		TypedQuery<Cliente> q = emf.createQuery(jpql, Cliente.class);
		q.setParameter("cat", "%" + categoria + "%");
		List<Cliente> clientes = q.getResultList();
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
