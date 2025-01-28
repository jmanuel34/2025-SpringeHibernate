package es.cursosprhib.jpa001.ejemplo01;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="persona")
public class Persona implements Serializable, Comparable<Persona>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPersona;
	private String nombre;
	private String apellidos;
	private String apodo;
	private String dni;
	public Persona() {
		super();
	}
	public Persona(Integer idPersona, String nombre, String apellidos, String apodo, String dni) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.apodo = apodo;
		this.dni = dni;
	}
	public Integer getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
@Override
	public int hashCode() {
		return apellidos.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this==obj) return true;
		if (obj==null) return false;
		if (getClass()!= obj.getClass()) return false;
		Persona other = (Persona)obj;
		return Objects.equals(idPersona, other.idPersona);
		//return apellidos.equals(anObject);
	}
	@Override
	public int compareTo(Persona o) {	
		return Integer.compare(this.idPersona, o.idPersona);
	}
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", dni=" + dni + "]";
	}

	
}
