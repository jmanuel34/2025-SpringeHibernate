package es.cursosprhib.p01mdp_servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.cursosprhib.mediosdepago.modelo.Extracto;
import es.cursosprhib.mediosdepago.modelo.Tarjeta;
import es.cursosprhib.mediosdepago.persistencia.ExtractoDao;

@SuppressWarnings("serial")

@Service
public class CompraImpl implements Compra{
	
	@Autowired
	private ExtractoDao extDao;
	
	@Autowired 		//Opcional en este caso  al pasarlo por consturctor
	public CompraImpl(ExtractoDao extDao) {
		this.extDao = extDao;
	}

	@Override
	public Extracto buscarExtractoTarjeta(Tarjeta tjta, int anyo, int mes) {
		System.out.println(this.getClass().getName());
		return extDao.findExtracto(tjta.getCuenta(), anyo, mes);
	}

}
