package br.com.fiap.sigleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	private static EntityManagerFactory entityManagerFactory;
	
	private EntityManagerFactorySingleton() {
	}
	
	
	public static EntityManagerFactory getInstance() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("progamer-persistence-unit");
		}
		return entityManagerFactory;
	}
	
}
