package es.cursosprhib.mediosdepago.vista.dto;

import es.cursosprhib.mediosdepago.modelo.Cliente;

public class MapperCliente {
	
	public static ClienteDto toDto(Cliente cli) {
		return new ClienteDto(cli.getIdPersona()	cli.getNombre(), cli.getApellido1(), cli.getApellido2(), cli.getNif(),
				cli.getSexo().toString(), cli.getMunicipio(), null, null, null, null)
	}

}
