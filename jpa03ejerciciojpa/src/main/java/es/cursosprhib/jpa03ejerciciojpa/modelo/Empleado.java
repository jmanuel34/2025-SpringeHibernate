package es.cursosprhib.jpa03ejerciciojpa.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleado extends Persona {
	private static final long serialVersionUID = 1L;

	private Integer nroEmpleado;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;

	public Empleado() {
	}

	public Integer getNroEmpleado() {
		return nroEmpleado;
	}

	public void setNroEmpleado(Integer nroEmpleado) {
		this.nroEmpleado = nroEmpleado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Empleado [nroEmpleado=" + nroEmpleado + ", categoria=" + categoria + ", getIdPersona()="
				+ getIdPersona() + ", getApellidos()=" + getApellidos() + "]";
	}

	/*
	 * @Override public String toString() { return "Empleado [" + nroEmpleado + ", "
	 * + categoria + ", " + getIdPersona() + ", " + getApellidos() + "]"; } //
	 */
}
