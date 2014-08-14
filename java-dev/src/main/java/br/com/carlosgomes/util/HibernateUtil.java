package br.com.carlosgomes.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

public class HibernateUtil {
	
	private static EntityManager entityManager;
	
	public static EntityManager getEntityManager() {
		if (entityManager == null) {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("java-dev");
			entityManager = emf.createEntityManager();
		}
		return entityManager;
	}

	public static Session getSession() {
		return (Session) getEntityManager().getDelegate();
	}
}