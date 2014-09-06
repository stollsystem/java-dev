package br.com.carlosgomes.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

public class HibernateUtil {
	
	private static EntityManager entityManager;
	private static String persistenceUnitName;
	
	public static EntityManager getEntityManager() {
		if (entityManager == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnitName);
			entityManager = emf.createEntityManager();
		}
		return entityManager;
	}

	public static Session getSession() {
		return (Session) getEntityManager().getDelegate();
	}
	
	public String getPersistenceUnitName() {
		return persistenceUnitName != null ? persistenceUnitName : "java-dev";
	}
	
	public void setPersistenceUnitName(String puName) {
		persistenceUnitName = puName;
	}
}