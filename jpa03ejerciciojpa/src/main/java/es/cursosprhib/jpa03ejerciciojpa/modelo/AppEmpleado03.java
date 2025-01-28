package es.cursosprhib.jpa03ejerciciojpa.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

//  3.- Listar todos los Empleados de una categoria parametrizada que tengan un apellido determinado

public class AppEmpleado03 {

	public static void main(String[] args) {
		EntityManager emf = Emf.getInstance().createEntityManager();
		/*
		 * Empleado e = emf.find(Empleado.class, 5); System.out.println(e);
		 * 
		 * Producto p = emf.find(Producto.class, 1 ); System.out.println(p); //
		 */
//				1.- Listar todos los clientes de una categoria parametrizada
		String apellido = "Lavanini";
		String categoria = "ANALISTA FUNCIONAL";
		// String jpql= "Select p from Persona06 p where p.domicilio.ciudad = :ciudad";

		String jpql = ("Select e from Empleado e where e.categoria.categoria like :cat and e.apellidos like : ape");
		TypedQuery<Empleado> q = emf.createQuery(jpql, Empleado.class);
		q.setParameter("cat", "%" + categoria + "%");
		q.setParameter("ape", "%" + apellido + "%");

		List<Empleado> empleados = q.getResultList();
		for (Empleado emp : empleados) {
			System.out.println(emp);
			System.out.println(emp.getCategoria().getCategoria());
		}

	}

}
