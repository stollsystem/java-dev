package br.com.carlosgomes.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.carlosgomes.dao.ProdutoDAO;
import br.com.carlosgomes.modelo.Produto;
import br.com.carlosgomes.util.Mensagem;
import br.com.carlosgomes.util.ObjetoUtil;

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

		List<Produto> produtos = produtoDAO.busca("descricao", produto.getDescricao().trim());
		
		if (produtos.size() > 0) {
			Mensagem.addMessage(FacesMessage.SEVERITY_ERROR, "Já existe um produto cadastrado com essa descrição.");

		} else {
			produto.setStatus("A");
			produtoDAO.beginTransaction();
			produtoDAO.salva(produto);
			produtoDAO.commit();
			Mensagem.addMessage(FacesMessage.SEVERITY_INFO, "Produto cadastrado com sucesso!");
		}
	}

	public String alteracao() {
		ObjetoUtil.putFlash("produto", produto);
		return "produto-alteracao.xhtml";
	}
	
	public void altera() {

		List<Produto> produtos = produtoDAO.busca("descricao", produto.getDescricao().trim());
		
		if (produtos.size() > 0 && produtos.get(0).getCodigo() != produto.getCodigo()) {
			Mensagem.addMessage(FacesMessage.SEVERITY_ERROR, "Já existe um produto cadastrado com essa descrição.");

		} else {
			produtoDAO.beginTransaction();
			produtoDAO.salva(produto);
			produtoDAO.commit();
			Mensagem.addMessage(FacesMessage.SEVERITY_INFO, "Produto alterado com sucesso!");
		}

	}
	
	public Produto getProduto() {
		Produto produtoFlash = (Produto) ObjetoUtil.getFlash("produto");
		if (produtoFlash != null) {
			produto = produtoFlash;
		}
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
