package Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAutil {
	
	private static EntityManagerFactory factory = null;
	
	//assim eu garanto uma unica instancia para esse factory que vai evitar de estressa o banco com as funções
	static {
		if(factory==null) {
			factory = Persistence.createEntityManagerFactory("crudweb");
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	public static Object getPrimaryKey(Object entity) {
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
}
