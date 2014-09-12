package br.com.carlosgomes.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.carlosgomes.dao.ProdutoDAO;
import br.com.carlosgomes.modelo.Produto;

@ManagedBean
@ViewScoped
public class ProdutoManagedBean {
	
	private Produto produto = new Produto();
	private ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public List<Produto> getProdutos() {
		List<Produto> produtos = produtoDAO.busca();
		return produtos;
	}
	
	public void salva() {
		produtoDAO.beginTransaction();
		produtoDAO.salva(produto);
		produtoDAO.commit();
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, null, "Produto cadastrado com sucesso!"));
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
