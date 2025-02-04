package es.cursosprhib.mediosdepago.persistencia;

import java.util.Collection;
import java.util.List;

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
	private EntityManagerFactory emf;
	
	
	public ClienteDaoImpl(EntityManagerFactory emf) {
		super();
		this.emf = emf;
	}

	@Override
	public Cliente save(Cliente entidad) {
		Cliente saved = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			saved = em.merge(entidad);
			em.getTransaction().commit();
			
		}catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
		return saved;
	}

	@Override
	public List<Cliente> saveAll(Collection<Cliente> entidades) {
		List<Cliente> clientes = null;
		try {
			em = emf.createEntityManager();
			String jpql = "Select c from Cliente c";
			TypedQuery<Cliente> q =em.createQuery(jpql, Cliente.class);
			clientes = q.getResultList();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return clientes;
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
		Cliente cli= null;
		try {
			em=emf.createEntityManager();
			cli= em.find(Cliente.class, id);
			em.getTransaction().begin();
			cli.getCuentas().size();
			em.getTransaction().commit();
		} catch(Exception e) {
			e.printStackTrace();			
		} finally {
			em.close();
		}
	return cli;
	}
/*
	public Cliente findByIdEager(Integer id) {
		
	}
//*/	
	@Override
	public List<Cliente> findAll() {
		
		List<Cliente> resu=null;;
		try {
			em=emf.createEntityManager();
			String jpql= "Select c from Cliente c";
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
		List<Cliente> clientes = null;
		try {
			em = emf.createEntityManager();
			String jpql = "Select c from Cliente c where c.nombre like :nombre or c.apellido1 like :nombre or c.apellido2 like :nombre";
			TypedQuery<Cliente> q =em.createQuery(jpql, Cliente.class);
			q.setParameter("nombre", "%" +nombre+ "%");
			clientes = q.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
		}
		return clientes;
	}

}
