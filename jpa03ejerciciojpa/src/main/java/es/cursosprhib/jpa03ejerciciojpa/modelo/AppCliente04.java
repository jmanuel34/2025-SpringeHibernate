package es.cursosprhib.jpa03ejerciciojpa.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

//  4.- Listar todos los clientes que han comprado productos de un precio mayor a uno especifico
public class AppCliente04 {

	public static void main(String[] args) {
		EntityManager emf = Emf.getInstance().createEntityManager();

		Double pr = 200.0;
		String jpql = "Select c from Cliente c join c.productos p where p.precio > :precio";
		TypedQuery<Cliente> q = emf.createQuery(jpql, Cliente.class);
		q.setParameter("precio", pr);

		List<Cliente> clientes = q.getResultList();
		for (Cliente c : clientes) {
			System.out.println(c);
//			System.out.println(c.getProductos());
		}

	}

}
