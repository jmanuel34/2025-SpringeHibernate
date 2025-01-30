package es.cursosprhib.spr01xml.servicios;

import es.cursosprhib.spr01xml.persistencia.ClienteDao;

public class ServicioConAccesoADatosImpl implements ServicioConAccesoADatos {

	private ClienteDao cDao;
	
	@Override
	public void realizaConsulta() {
		System.out.println("Metodo de negocio invocando al dao");
		cDao.consulta();

	}

	@Override
	public ClienteDao getClienteDao() {
		return this.cDao;
	}

	@Override
	public void setClienteDao(ClienteDao cDao) {
		this.cDao=cDao;

	}

}
