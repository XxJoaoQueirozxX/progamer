package br.com.fiap.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public abstract class  JPAUtil {
	private static final String persistence = "progamer-persistence-unit";
	
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistence);
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
}
