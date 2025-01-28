package es.cursosprhib.jpa03ejerciciojpa.persistencia;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto;

public interface ClienteDao {
	Cliente save (Cliente cliente);
	void deleteById(Integer id);
	void delete(Cliente cliente);
	Cliente getById(Integer id);
	List<ClienteDto> findAll();
	
	List<ClienteDto> findByApellidos(String apellidos);
	
	Cliente getByNroCliente(Integer nroCliente);

}
