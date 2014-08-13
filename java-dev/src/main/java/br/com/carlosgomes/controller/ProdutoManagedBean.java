package br.com.carlosgomes.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.com.carlosgomes.dao.ProdutoDAO;
import br.com.carlosgomes.modelo.Produto;

@ManagedBean
@RequestScoped
public class ProdutoManagedBean {
	
	public String incluiProduto() {
		Produto p1 = new Produto();
		p1.setDescricao("Produto A");
		
		new ProdutoDAO().salva(p1);

		System.out.println("Produto incluído " + p1.getDescricao());
		
		return null;
	}
	
	public String getDescricao() {
		return "Produto A";
	}
	
}
