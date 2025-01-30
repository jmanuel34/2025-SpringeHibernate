package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import es.cursosprhib.spr01xml.persistencia.ClienteDao;
import es.cursosprhib.spr01xml.persistencia.ClienteDaoImpl;
import es.cursosprhib.spr01xml.servicios.ServicioConAccesoADatos;
import es.cursosprhib.spr01xml.servicios.ServicioConAccesoADatosImpl;

@Configuration
@Import({A03ConfigProd.class, A03ConfigDes.class})
//@ImportResource
//@ImportResource("ficheros.xml")
public class A03Config {

	//Se podria usar:
	//@Autowired
	//DataSource ds;
	
	@Bean("cDao")
	public ClienteDao cliDao(DataSource ds) {
		return new ClienteDaoImpl(ds);
	}
	
	@Bean
	public ServicioConAccesoADatos neg(ClienteDao cDao) {
		ServicioConAccesoADatos servicio = new ServicioConAccesoADatosImpl();
		servicio.setClienteDao(cDao);
		return servicio;
	}
}
