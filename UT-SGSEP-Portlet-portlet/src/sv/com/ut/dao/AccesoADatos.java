package sv.com.ut.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.persistence.jpa.JpaEntityManager;
import org.eclipse.persistence.sessions.Session;

public abstract class AccesoADatos<T> implements Serializable{

	private static final long serialVersionUID = 1L;
	//protected static ResourceBundle msj = "Mesaje;
	
	private EntityManagerFactory emfactory;
	private EntityManager em;
	private String unitName;
	
	
	public AccesoADatos(String persistenUnitName) {
		unitName = persistenUnitName;
		emfactory = Persistence.createEntityManagerFactory(unitName);
		em = emfactory.createEntityManager();
	}

	public EntityManager getEm() {		
		if(emfactory == null || !em.isOpen()){
			em = Persistence.createEntityManagerFactory(unitName).createEntityManager();
		}		
		return em;
	}

	public void setEM(EntityManager emfactory) {
		this.em = emfactory;
	}
	
	public Session getSession() {
		return ((JpaEntityManager) getEm().getDelegate()).getActiveSession();
	}
	
	public String guardar(T t){
		String operacion= "OK" ;
		try{
		  getEm().getTransaction( ).begin( );
	      getEm().persist(t);
	      getEm().getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			operacion = e.getMessage();
		}finally {
		    getEm().getEntityManagerFactory().close( );
		}	  
		return operacion;
	}
	
	public String actulizar(T t){
		String operacion=  "OK" ;
		try{
		  getEm().getTransaction( ).begin( );
	      getEm().merge(t);
	      getEm().getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			operacion = e.getMessage();
		}finally {
		    getEm().getEntityManagerFactory().close( );
		}	  
		return operacion;
	}
	
	@SuppressWarnings("unchecked")
	public T executeNameQuerySingleResult(String namedQuery){
		try{
		  getEm().getTransaction( ).begin( );
		  return (T) getEm().createNamedQuery(namedQuery).getSingleResult();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
		    getEm().getEntityManagerFactory().close( );
		}
		return null;	
		
	}
	
	@SuppressWarnings("unchecked")
	public List<T> executeNameQueryListResult(String namedQuery){
		try{
		  getEm().getTransaction( ).begin( );
		  return  getEm().createNamedQuery(namedQuery).getResultList();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
		    getEm().getEntityManagerFactory().close( );
		}
		return null;		
	}
	
	@SuppressWarnings("rawtypes")
	public List executeNativeQueryListResult(String query){
		try{
		  getEm().getTransaction( ).begin( );
		  return  getEm().createNativeQuery(query).getResultList();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
		    getEm().getEntityManagerFactory().close( );
		}
		return null;		
	}
 	
}
