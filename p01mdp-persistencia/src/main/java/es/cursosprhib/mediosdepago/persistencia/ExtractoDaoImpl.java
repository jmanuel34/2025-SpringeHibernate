package es.cursosprhib.mediosdepago.persistencia;

import java.util.Collection;
import java.util.List;

import es.cursosprhib.mediosdepago.modelo.Cuenta;
import es.cursosprhib.mediosdepago.modelo.Extracto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

//Implementar en la clase sólo los siguientes métodos:
//findExtracto(...)
public class ExtractoDaoImpl implements ExtractoDao {

	private EntityManager em;
	private EntityManagerFactory emf;
	
	public ExtractoDaoImpl(EntityManagerFactory emf) {
		super();
		this.emf = emf;
	}

	@Override
	public Extracto save(Extracto entidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Extracto> saveAll(Collection<Extracto> entidades) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Extracto entidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Collection<Extracto> entidades) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Extracto findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Extracto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Extracto> findAllById(Collection<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Extracto findExtracto(Cuenta cuenta, int anyo, int mes) {
		
		Extracto ex= null;
		try {
			em=emf.createEntityManager();
			String jpql = "Select e from Extracto e where e.cuenta= :cuenta and e.anyo= :anyo and e.mes= :mes";
			TypedQuery<Extracto> q = em.createQuery(jpql, Extracto.class);
			q.setParameter("cuenta", cuenta);
			q.setParameter("anyo", anyo);
			q.setParameter("mes", mes);
			ex = q.getSingleResult();
		} catch(Exception e) {
			e.printStackTrace();			
		} finally {
			em.close();
		}
		return ex;

	}

}
