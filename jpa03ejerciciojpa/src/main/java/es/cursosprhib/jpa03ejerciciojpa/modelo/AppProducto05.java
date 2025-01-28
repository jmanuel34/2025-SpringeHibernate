package es.cursosprhib.jpa03ejerciciojpa.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

//5.- Listar los productos que ha comprado un cliente por su id

public class AppProducto05 {

	public static void main(String[] args) {
		EntityManager emf = Emf.getInstance().createEntityManager();

//		String jpql = "Select p from Persona07 p left join fetch p.telefonos left join fetch p.domicilio";

		Integer id = 3;
		String jpql = "Select c from Cliente c left join fetch c.productos p where c.idPersona = :id";
		TypedQuery<Cliente> q = emf.createQuery(jpql, Cliente.class);
		q.setParameter("id", id);

		List<Cliente> clientes = q.getResultList();
		for (Cliente c : clientes) {
			System.out.println(c);
			for (Producto producto : c.getProductos()) {
				System.out.println(producto);
			}
		}

	}

}
