package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import Util.HibernateUtil;
import Model.Produto;

public class GenericDao<E> {
	
	Produto produto = new Produto();
	
	//mostrar toda a tabela
	@SuppressWarnings("unchecked")
	public List<E> getListEntity(Class<E> entidade){
		EntityManager em = HibernateUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		
		List<E> lista = em.createQuery(" FROM " + entidade.getName()).getResultList();
		
		et.commit();
		em.close();
		return lista;
	}
	
	//mostrar um produto especifico
	public Object getEntityId(Class<E> classe, long codigo) {
		EntityManager em = HibernateUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Object obj = em.find(classe, codigo);
		
		et.commit();
		em.close();
		return obj;
	}
	
	//atualizar um produto
	public E setEntity(E entidade) {
		EntityManager em = HibernateUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		E e = em.merge(entidade);
		
		et.commit();
		em.close();
		
		return e;
	}
	
	//exlcuir um produto
	public void deleteEntity(E entidade) {
		EntityManager em = HibernateUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
				
		Object id  = HibernateUtil.getPrimaryKey(entidade);
		em.createQuery("delete from " + entidade.getClass().getCanonicalName() + " where id = " + id).executeUpdate();
		
		et.commit();
		em.close();
	}
	
	//incluir um novo produto
	public void includeEntity(E entidade) {
		EntityManager em = HibernateUtil.getEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(entidade);
	
		et.commit();
		em.close();
	}
	
}