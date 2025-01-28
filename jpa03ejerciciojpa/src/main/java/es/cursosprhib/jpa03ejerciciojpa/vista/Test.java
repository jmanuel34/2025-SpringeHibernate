package es.cursosprhib.jpa03ejerciciojpa.vista;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto;
import es.cursosprhib.jpa03ejerciciojpa.negocio.ClienteMapper;
import es.cursosprhib.jpa03ejerciciojpa.persistencia.ClienteDao;
import es.cursosprhib.jpa03ejerciciojpa.persistencia.ClienteDaoImpl;

public class Test {

	public static void main(String[] args) {
		ClienteDao cDao = new ClienteDaoImpl();
		Cliente c = cDao.getById(14);
		System.out.println(c);
		
		Cliente c1= cDao.getByNroCliente(10987);
		System.out.println(c1);
		System.out.println(c1.getProductos());
		
		List<ClienteDto> c2= cDao.findByApellidos("ez");
		for (ClienteDto clienteDto: c2) {
			System.out.println(clienteDto);
		}
/*		
		ClienteDto nuevo = new ClienteDto (null, "Perez Pz", 1234); 
		Cliente cliNuevo = cDao.save(ClienteMapper.toCliente(nuevo));	
		System.out.println(cliNuevo);
		c.setCategoria("Nueva");
		cDao.save(c);
//*/
/*		
		cDao.deleteById(40);
//*/
/*		
		Cliente c42 = cDao.getById(42);
		cDao.delete(c42);
//*/
	}

}
