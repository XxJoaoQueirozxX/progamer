package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.Setup;
import br.com.fiap.utils.JPAUtil;

public class SetupDAO {

	public void save(Setup setup) {
		EntityManager em = JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(setup);
		em.getTransaction().commit();
		em.close();
	}

	public List<Setup> getAll() {
		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT s FROM Setup s";
		TypedQuery<Setup> query = em.createQuery(jpql, Setup.class);
		
		List<Setup> result = query.getResultList();
		em.close();
		return result;
	}

	
}
