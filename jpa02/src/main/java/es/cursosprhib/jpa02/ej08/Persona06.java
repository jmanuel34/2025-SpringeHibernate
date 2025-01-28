package es.cursosprhib.jpa02.ej08;

import java.io.Serializable;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contacto")
public class Persona06 implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idcontacto")
	private Integer idPersona;
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="apodo")
	private String apodo;
	
	@OneToOne
	@JoinColumn(name= "iddomicilio") 		//iddomicilio es la FK de la tabla contacto que apunta a la tabla domicilio
	private Domicilio domicilio;
	
	public Persona06() {
			System.out.println("Constructor por defecto");
	}
	

	public Integer getIdPersona() {
		return idPersona;
	}
	
	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
		System.out.println("Acceso a setIdPersona");
	}
	
	public String getNombre() {
		System.out.println("Acceso a nombre");
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


	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona06 [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", domicilio=" + domicilio + "]";
	}
	
	
	

}
