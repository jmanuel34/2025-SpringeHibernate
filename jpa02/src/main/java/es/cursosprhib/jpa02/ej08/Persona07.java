package es.cursosprhib.jpa02.ej08;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
// Ejemplo domicilio 02
@Entity
@Table(name="contacto")
public class Persona07 implements Serializable{
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
	private Domicilio02 domicilio;
	
	@ElementCollection    // (fetch = FetchType.EAGER)		// Mapeos de clases basicas: String ...
	@CollectionTable(name = "telefonos", joinColumns = @JoinColumn(name = "idcontacto")) // la tabla donde se almacenan los
		//telefonos se llama telefonos y tine una columna idContacto que la FK a la tabla contacto
	@Column(name="telefono")
	
	private Set<String> telefonos;
	
	public Persona07() {
			telefonos = new LinkedHashSet<String>();
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


	public Domicilio02 getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(Domicilio02 domicilio) {
		this.domicilio = domicilio;
	}

	public Set<String> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(Set<String> telefonos) {
		this.telefonos = telefonos;
	}

	public void addTelefono (String telefono) {
		telefonos.add(telefono);
	}
/*	
	@Override
	public String toString() {
		return "Persona06 [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", domicilio=" + domicilio + "]";
	}
//*/

	@Override
	public String toString() {
		return "Persona07 [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", domicilio=" + domicilio +  "]";
	}	
	
	

}
