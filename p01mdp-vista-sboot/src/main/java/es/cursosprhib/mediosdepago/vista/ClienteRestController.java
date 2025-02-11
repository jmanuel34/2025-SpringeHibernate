package es.cursosprhib.mediosdepago.vista;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cursosprhib.mediosdepago.modelo.Cliente;
import es.cursosprhib.mediosdepago.servicio.ClienteServicio;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {
	
	@Autowired
	private ClienteServicio cliS;
	
	@GetMapping("/todos")
	public List<Cliente> getClientes(){
		return cliS.getClientes();
	}
}
