package modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	public static EntityManagerFactory  emf = Persistence.createEntityManagerFactory("default");

	public static EntityManager getEntityManager(){
		return emf.createEntityManager();
	}
}
