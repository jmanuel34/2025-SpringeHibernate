package negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import persistencia.BancoDao;

@Service("bNeg")
public class BancoNegocioImpl implements BancoNegocio {
	
	private BancoDao bancoDao;
	
	@Autowired				// Estamos obligados al autowired porque no sabe qué constructor meter si hay mas de uno
	public BancoNegocioImpl(@Qualifier("bDao") BancoDao bancoDao) {
		this.bancoDao= bancoDao;
	}
	
	public void transferencia(long dni1, long dni2, double cantidad) {
		bancoDao.actualizaSaldo(dni1, cantidad);
		bancoDao.actualizaSaldo(dni2, -cantidad);
	}

	public BancoDao getBancoDao() {
		return bancoDao;
	}

	public void setBancoDao(BancoDao bancoDao) {
		this.bancoDao = bancoDao;
	}

}
