package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.model.User;
import br.com.fiap.utils.JPAUtil;

public class UserDAO {
	public void save(User user) {
		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}

	public List<User> getAll() {
		EntityManager em = JPAUtil.getEntityManager();
		String jpql = "SELECT u FROM User u";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		
		List<User> result = query.getResultList();
		em.close();
		return result;
	}
}
