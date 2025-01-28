package es.cursosprhib.jpa03ejerciciojpa.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class AppProducto8 {

	public static void main(String[] args) {
		EntityManager emf = Emf.getInstance().createEntityManager();
		/*
		 * 8.- Cantidad de productos comprados por cada categoria de cliente
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

//		String jpql = "Select p from Producto p where p.precio = ( "
//				+ "Select MAX(precio) p from Producto p)";
		String jpql = "Select c.categoria count (p.idProducto) from Prodcuto p join p.Clientes c"
				+ " group by c.categoria";

		TypedQuery<Object[]> q = emf.createQuery(jpql, Object[].class);

		List<Object[]> resu = q.getResultList();
		for (Object[] obj : resu) {
			System.out.println(obj[0] + ":" + obj[1]);
		}

	}

}
