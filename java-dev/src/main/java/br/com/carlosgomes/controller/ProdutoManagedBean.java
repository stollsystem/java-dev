package br.com.carlosgomes.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.com.carlosgomes.dao.ProdutoDAO;
import br.com.carlosgomes.modelo.Produto;

@ManagedBean
@RequestScoped
public class ProdutoManagedBean {
	
	public String getDescricao() {
		return new ProdutoDAO().busca(20).getDescricao();
	}

	public void atualiza() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.beginTransaction();

		Produto produto = produtoDAO.busca(20);
		produto.setDescricao("CCC");
		
		produtoDAO.salva(produto);
		produtoDAO.commit();
	}
	
}
