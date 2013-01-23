package modelo;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class PersistidorDeAutomovel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		Automovel automovel = new Automovel();
		automovel.setAnoFabricacao(2010);
		automovel.setModelo("Ferrari");
		automovel.setObservacoes("Nunca foi batido");
		
		//EntityTransaction tx = em.getTransaction();
		//tx.begin();
		//em.persist(automovel);
		//tx.commit();
		/*
		
		Query q = em.createQuery("SELECT a FROM Automovel a" , Automovel.class);
		
		List<Automovel> autos = q.getResultList();
		
		for(Automovel auto : autos){
			System.out.println(auto.getId() );
			System.out.println(auto.getMarca() );
			System.out.println(auto.getModelo() );
			System.out.println(auto.getAnoFabricacao() );
			System.out.println(auto.getAnoModelo() );

			System.out.println(auto.getObservacoes() );
			
			System.out.println("===================================");
		}
		*/
		
		
		Automovel auto = new Automovel();
		
		
		em.close();
	}

}
