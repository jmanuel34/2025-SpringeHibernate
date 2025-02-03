package es.cursosprhib.mediosdepago.persistencia;

import java.util.Collection;
import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.exceptions.ClientePersistException;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Emf;
import es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto;
import es.cursosprhib.mediosdepago.modelo.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

//Implementar en la clase sólo los siguientes métodos:
//findAll()
//findByNombre(...)
//findByIdEager(...)
public class ClienteDaoImpl implements ClienteDao {

	private EntityManager em;
	private EntityManagerFactory emf = Emf.getInstance();
	@Override
	public Cliente save(Cliente entidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> saveAll(Collection<Cliente> entidades) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Cliente entidad) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Collection<Cliente> entidades) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> findAll() {
		
		List<Cliente> resu=null;;
		try {
			em=emf.createEntityManager();
			String jpql= "Select c from Cliente cn join c.cuentas cu";
			TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
			resu= q.getResultList();
		} catch(Exception e) {
			e.printStackTrace();		
		} finally {
			em.close();
		}
		return resu;
	}

	@Override
	public List<Cliente> findAllById(Collection<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
