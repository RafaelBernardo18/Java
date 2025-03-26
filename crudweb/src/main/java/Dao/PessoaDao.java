package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Util.JPAutil;

public class PessoaDao<E> {
	
	//nessa classe vou criar metodos para tratar funçoes no banco de dados 
	
	public void salvar(E entidade) {
		EntityManager entityManager = JPAutil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(entidade);
		
		entityTransaction.commit();
		entityManager.close();
	}
	
	public E merge(E entidade) {
		EntityManager entityManager = JPAutil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		E e = entityManager.merge(entidade);
		
		entityTransaction.commit();
		entityManager.close();
		
		return e;
	}
	
	public void deletePorId(E entidade) {
		EntityManager entityManager = JPAutil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		Object id = JPAutil.getPrimaryKey(entidade);
		entityManager.createQuery("delete from " + entidade.getClass().getCanonicalName() + " where id = " + id).executeUpdate();
		
		entityTransaction.commit();
		entityManager.close();
	}
	
	//esse metodo foi usar para mapear a lista
	
	
	public List<E> getListEntity(Class<E> entidade){
		EntityManager entityManager = JPAutil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		@SuppressWarnings("unchecked")
		List<E> retorno = entityManager.createQuery(" FROM " + entidade.getName()).getResultList();
		
		entityTransaction.commit();
		entityManager.close();
		
		return retorno;
	}
	

}
