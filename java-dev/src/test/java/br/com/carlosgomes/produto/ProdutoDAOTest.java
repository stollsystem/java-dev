package br.com.carlosgomes.produto;

import static org.junit.Assert.*;
import org.junit.Test;
import br.com.carlosgomes.dao.ProdutoDAO;
import br.com.carlosgomes.modelo.Produto;

public class ProdutoDAOTest {
	
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	@Test
	public void inclui() {
		Produto produto1 = new Produto();
		produto1.setDescricao("Produto Teste 001");
		produtoDAO.salva(produto1);

		Produto produto2 = new Produto();
		produto2.setDescricao("Produto Teste 002");
		produtoDAO.salva(produto2);

		assertEquals("Produto 1 não consistido corretamente", produto1.getDescricao(), produtoDAO.buscaProduto(produto1.getDescricao()));
		assertEquals("Produto 2 não consistido corretamente", produto2.getDescricao(), produtoDAO.buscaProduto(produto2.getDescricao()));
	}

}
