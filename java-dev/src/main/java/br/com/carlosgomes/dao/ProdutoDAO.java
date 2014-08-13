package br.com.carlosgomes.dao;

import javax.persistence.EntityManager;

import br.com.carlosgomes.modelo.Produto;
import br.com.carlosgomes.util.HibernateUtil;

public class ProdutoDAO {

	public void salva(Produto produto) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
	}
}
