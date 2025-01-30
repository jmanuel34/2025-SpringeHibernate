package es.cursosprhib.spr01xml.servicios;

import es.cursosprhib.spr01xml.persistencia.ClienteDao;

public interface ServicioConAccesoADatos {
	
	void realizaConsulta();
	ClienteDao getClienteDao();
	void setClienteDao (ClienteDao cDao);

}
