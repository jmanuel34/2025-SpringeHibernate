package es.cursosprhib.jpa03ejerciciojpa.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class AppProducto06 {

	public static void main(String[] args) {
		EntityManager emf = Emf.getInstance().createEntityManager();
		/*
		 * 6.- Listar los productos que no han sido comprados nunca
		 *
		 * Consulta Sql Select * from ejercicio_jpa.productos p where p.idProducto not
		 * in ( Select idProducto from clientes_productos);
		 *
		 * Otra sql Select * from productos p left join clientes_productos cp on
		 * p.idProducto = cp.idProducto where cp.idProducto is null;
		 */

		String jpql = "Select p from Producto p where p.idProducto not in ( "
				+ "Select p.idProducto from Cliente c join c.productos p)";
		TypedQuery<Producto> q = emf.createQuery(jpql, Producto.class);

		List<Producto> Productos = q.getResultList();
		for (Producto p : Productos) {
			System.out.println(p);
		}

	}

}
