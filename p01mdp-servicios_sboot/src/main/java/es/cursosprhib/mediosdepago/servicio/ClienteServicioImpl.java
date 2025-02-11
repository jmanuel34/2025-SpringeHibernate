package es.cursosprhib.mediosdepago.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cursosprhib.mediosdepago.modelo.Cliente;
import es.cursosprhib.mediosdepago.persistencia.ClienteDao;

@Service
public class ClienteServicioImpl implements ClienteServicio {
	private ClienteDao cDao;
	
	@Autowired				// Opcional
	public ClienteServicioImpl(ClienteDao cDao) {
		super();
		this.cDao = cDao;
	}

	public List<Cliente> getClientes() {
//		System.out.println("Numero de clientes: " +cDao.findAll().size());
		return cDao.findAll();
	}

}
