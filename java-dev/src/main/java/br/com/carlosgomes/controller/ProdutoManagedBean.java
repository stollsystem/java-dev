package br.com.carlosgomes.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.carlosgomes.dao.ProdutoDAO;
import br.com.carlosgomes.modelo.Produto;

@ManagedBean
@ViewScoped
public class ProdutoManagedBean {
	
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public List<Produto> getProdutos() {
		List<Produto> produtos = produtoDAO.busca();
		return produtos;
	}

}
