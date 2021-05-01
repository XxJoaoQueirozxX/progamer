package br.com.fiap.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.singleton.EntityManagerFactorySingleton;


public abstract class  JPAUtil {
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory emf = EntityManagerFactorySingleton.getInstance();
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
}
