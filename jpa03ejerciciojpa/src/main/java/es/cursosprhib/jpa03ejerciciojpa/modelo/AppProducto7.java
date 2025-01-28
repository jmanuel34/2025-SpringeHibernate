package es.cursosprhib.jpa03ejerciciojpa.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class AppProducto7 {

	public static void main(String[] args) {
		EntityManager emf = Emf.getInstance().createEntityManager();
		/*
		 * 7.- Listar los productos con el precio mayor (pueden ser varios con el mismo
		 * precio)
		 *
		 * Consulta Sql Select * from ejercicio_jpa.productos p where p.idProducto not
		 * in ( Select idProducto from clientes_productos);
		 *
		 * Otra sql Select * from productos p left join clientes_productos cp on
		 * p.idProducto = cp.idProducto where cp.idProducto is null;
		 *
		 * Select * from productos p where p.precio = ( SELECT MAX(precio) FROM
		 * productos);
		 */

		String jpql = "Select p from Producto p where p.precio = ( " + "Select MAX(precio) p from Producto p)";
		TypedQuery<Producto> q = emf.createQuery(jpql, Producto.class);

		List<Producto> Productos = q.getResultList();
		for (Producto p : Productos) {
			System.out.println(p);
		}

	}

}
