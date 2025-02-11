package es.cursosprhib.mediosdepago.vista.dto;

import java.util.List;

import es.cursosprhib.mediosdepago.dto.CuentaDto;

public class ClienteDto {
	private Integer idPersona;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nif;
	private String sexo;
	private String municipio;
	private String provincia;
	private Integer nroCiente;
	private List<CuentaDto> cuentas;
	
	
	public ClienteDto(Integer idPersona, String nombre, String apellido1, String apellido2, String nif, String sexo,
			String municipio, String provincia, Integer nroCiente, List<CuentaDto> cuentas) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nif = nif;
		this.sexo = sexo;
		this.municipio = municipio;
		this.provincia = provincia;
		this.nroCiente = nroCiente;
		this.cuentas = cuentas;
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


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getMunicipio() {
		return municipio;
	}


	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public Integer getNroCiente() {
		return nroCiente;
	}


	public void setNroCiente(Integer nroCiente) {
		this.nroCiente = nroCiente;
	}


	public List<CuentaDto> getCuentas() {
		return cuentas;
	}


	public void setCuentas(List<CuentaDto> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}
