package es.cursosprhib.jpa02.ej03;

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
import jakarta.persistence.Table;

@Entity
@Table(name="persona_04")
public class Persona03 implements Serializable{
	
	private Integer idPersona;
	private String nombre;
	private String apellidos;
	private String apodo;
	private String dni;
	private Genero genero;
	private Domicilio domicilio;
	
	public Persona03() {
			System.out.println("Constructor por defecto");
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Enumerated(EnumType.STRING)
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	@Embedded
	@AttributeOverride(name = "tipoVia", column = @Column(name="tipovia"))
	@AttributeOverride(name = "codigoPostal", column = @Column(name="codigopostal"))
	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	@Override
	public String toString() {
		return "Persona02 [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", dni=" + dni + ", genero=" + genero + " domicilio: "+ domicilio +"]";
	}
	

}
