package modelo;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;




@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();

	public void salvar(){
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		em.persist(automovel);		
		tx.commit();
		em.close();
		
		/*
		System.out.println("Marca: "+automovel.getMarca());
		System.out.println("modelo: "+automovel.getModelo());
		System.out.println("anofabricacao: "+automovel.getAnoFabricacao());
		System.out.println("anomodelo: "+automovel.getAnoModelo());
		System.out.println("obs: "+automovel.getObservacoes());
		*/
	}
	

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	

}
