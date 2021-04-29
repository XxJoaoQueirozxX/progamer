package br.com.fiap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.model.Setup;
import br.com.fiap.sigleton.EntityManagerFactorySingleton;

public class SetupDAO {

	public void save(Setup setup) {
		EntityManagerFactory emf = EntityManagerFactorySingleton.getInstance();
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(setup);
		em.getTransaction().commit();
	}

}
