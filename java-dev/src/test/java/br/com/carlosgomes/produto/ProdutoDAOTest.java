package br.com.carlosgomes.produto;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.com.carlosgomes.dao.ProdutoDAO;
import br.com.carlosgomes.modelo.Produto;
import br.com.carlosgomes.util.HibernateUtil;

public class ProdutoDAOTest {
	
	private ProdutoDAO produtoDAO;
	
	@Before
	public void init() {
		HibernateUtil hibernateUtil = new HibernateUtil();
		hibernateUtil.setPersistenceUnitName("java-dev-test");
		produtoDAO = new ProdutoDAO();
	}
	
	@Test
	public void busca() {
		List<Produto> produtos = produtoDAO.busca();
		assertNotNull("Lista de produtos retornou nulo", produtos);
	}
}
