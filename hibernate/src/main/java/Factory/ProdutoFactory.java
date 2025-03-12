package Factory;

import javax.persistence.Persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

import Entity.Produto;

public class ProdutoFactory {

	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernarte-crud");//este argumento vem do name localizado no arquivo persistance
	EntityManager em = emf.createEntityManager();
	
	//metodo de inserção
	public void inserir(Produto produto) {
		try {
			em.getTransaction().begin();
			em.persist(produto);
            em.getTransaction().commit();
			
		} catch(Exception e){
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			em.close();
			emf.close();
		}
	}
	
	
	//meotodo de excluir
	public void excluir(int id) {
		
		Produto produto = null;
		
		try {
			em.getTransaction().begin();
			produto = em.find(Produto.class, id);
			em.remove(produto);
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
	}
	
	//metodo para editar
	public void editar(Produto produto) {
		try {
			em.getTransaction().begin();
			em.merge(produto);
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}
		
	}
	
	//metodo de mostrar
	@SuppressWarnings("unchecked")
	public void mostrar(){
		 List<Produto> produto = null;
		 produto = em.createQuery("FROM "+ Produto.class.getName()).getResultList();
		 
		 for(int i=0; i<produto.size(); i++) {
			 System.out.println(produto.get(i).getId()); 
			 System.out.println(produto.get(i).getNome());
			 System.out.println(produto.get(i).getFornecedor());
			 System.out.println(produto.get(i).getPreco());
			 System.out.println(produto.get(i).getVencimento());
		 }
		 
	    }
}