package es.cursosprhib.jpa02.ej08;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "domicilio")

public class Domicilio02 implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iddomicilio")
	private Integer iddomicilio;
	@Column(name="tipovia")
	private String tipoVia;
	private String via;
	private int numero;
	private int piso;
	private String puerta;

	private String ciudad;
	@OneToOne(mappedBy = "domicilio") // Esta realcion ha sido mapeada en el atributo domicilio de la clase Persona07
	private Persona07 persona;
	
	public Persona07 getPersona() {
		return persona;
	}
	public void setPersona(Persona07 persona) {
		this.persona = persona;
	}
	public Integer getIddomicilio() {
		return iddomicilio;
	}
	public void setIddomicilio(Integer iddomicilio) {
		this.iddomicilio = iddomicilio;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}


	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, iddomicilio, numero, piso, puerta, tipoVia, via);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domicilio02 other = (Domicilio02) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(iddomicilio, other.iddomicilio);
	}
	
	@Override
	public String toString() {
		return "Domicilio [" + tipoVia + ", " + via + ", " + numero + ", " + piso + ", " + puerta + ", "
				+ ", " + ciudad + ", " + "]";
	}
}
