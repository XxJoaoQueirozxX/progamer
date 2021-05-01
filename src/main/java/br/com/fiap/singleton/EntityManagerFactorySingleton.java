package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
	private static final String persistence = "progamer-persistence-unit";
	
	private static EntityManagerFactory factory;
	
	
	private EntityManagerFactorySingleton() {}
	
	public static EntityManagerFactory getInstance() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(persistence);
		}
		return factory;
	}
	
}
