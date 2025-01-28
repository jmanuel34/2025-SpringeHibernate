package es.cursosprhib.jpa03ejerciciojpa.persistencia;

import java.util.LinkedList;
import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.exceptions.ClientePersistException;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Emf;
import es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto;
import es.cursosprhib.jpa03ejerciciojpa.negocio.ClienteMapper;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class ClienteDaoImpl implements ClienteDao {

	private EntityManager em;
	private EntityManagerFactory emf = Emf.getInstance();
	@Override
	public Cliente save(Cliente cliente) {
		Cliente saved;
		try {
			em=emf.createEntityManager();
			em.getTransaction().begin();
			saved = em.merge(cliente);			
			em.getTransaction().commit();		
		} catch (Exception e) {
			em.getTransaction().rollback();
			throw new ClientePersistException(e);			
		} finally {
			em.close();
		}
		return saved;
	}

	@Override
	public void deleteById(Integer id) {
		delete (getById(id));
	}

	@Override
	public void delete(Cliente cliente) {
		try {
			em=emf.createEntityManager();
			Cliente aEliminar = em.find(Cliente.class, cliente.getIdPersona());
			
			em.getTransaction().begin();
			em.remove(aEliminar);
			em.getTransaction().commit();
		} catch(Exception e) {
			em.getTransaction().rollback();
			throw new ClientePersistException(e);			
		} finally {
			em.close();
		}

	}

	@Override
	public Cliente getById(Integer id) {
		Cliente cli;
		try {
			em=emf.createEntityManager();
			cli= em.find(Cliente.class, id);
			em.getTransaction().begin();
			cli.getProductos().size();
			em.getTransaction().commit();
		} catch(Exception e) {
			throw new ClientePersistException(e);			
		} finally {
			em.close();
		}
	return cli;
	}

	@Override
	public List<ClienteDto> findAll() {
		List<ClienteDto> resu;
		try {
			em=emf.createEntityManager();
			String jpql= "Select new es.cursosprhib.jpa03ejerciciojpa.modelo.dto.ClienteDto(c.idPersona, c.apellidos, c.nroCliente) from Cliente c";
			TypedQuery<ClienteDto> q = em.createQuery(jpql, ClienteDto.class);
			resu= q.getResultList();
		} catch(Exception e) {
			throw new ClientePersistException(e);			
		} finally {
			em.close();
		}
		return resu;
	}

	@Override
	public List<ClienteDto> findByApellidos(String ape) {
		List<Cliente> clist;
		List<ClienteDto> resu = new LinkedList<ClienteDto>();
		try {
			em=emf.createEntityManager();
			String jpql= "Select c from Cliente c where c.apellidos like :ape";
			
			TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
			q.setParameter("ape", "%" +ape+ "%");
			clist= q.getResultList();
		} catch(Exception e) {
			throw new ClientePersistException(e);			
		} finally {
			em.close();
		}
		for (Cliente ciente:clist) {
			resu.add(ClienteMapper.toClienteDto(ciente));
		}
		return resu;
	}

	@Override
	public Cliente getByNroCliente(Integer nroCliente) {
		Cliente cli;
		try {
			em=emf.createEntityManager();
			String jpql= "Select c from Cliente c left join fetch c.productos p where c.nroCliente = : nroCliente";
			
			TypedQuery<Cliente> q = em.createQuery(jpql, Cliente.class);
			q.setParameter("nroCliente", nroCliente);
			cli = q.getSingleResult();
		} catch(Exception e) {
			throw new ClientePersistException(e);			
		} finally {
			em.close();
		}
		
		return cli;
	}

}
