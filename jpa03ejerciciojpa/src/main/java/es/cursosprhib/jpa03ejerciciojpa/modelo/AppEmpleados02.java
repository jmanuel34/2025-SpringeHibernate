package es.cursosprhib.jpa03ejerciciojpa.modelo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

/*
 *  2.- Listar todos los empleados de una categoria parametrizada
 */
public class AppEmpleados02 {

	public static void main(String[] args) {
		EntityManager emf = Emf.getInstance().createEntityManager();

		String categoria = "ANALISTA FUNCIONAL";

		String jpql = ("Select e from Empleado e where e.categoria.categoria like :cat");
		TypedQuery<Empleado> q = emf.createQuery(jpql, Empleado.class);
		q.setParameter("cat", "%" + categoria + "%");
		List<Empleado> empleados = q.getResultList();
		for (Empleado emp : empleados) {
			System.out.println(emp);
			System.out.println(emp.getCategoria().getCategoria());
		}
	}

}
