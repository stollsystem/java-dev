package br.com.carlosgomes.dao;

import org.hibernate.Query;
import br.com.carlosgomes.modelo.Produto;
import br.com.carlosgomes.util.HibernateUtil;

public class ProdutoDAO {

	public void salva(Produto produto) {
		HibernateUtil.getSession().saveOrUpdate(produto);
	}
	
	public Produto buscaProduto(Integer codigo) {
		String hql = "select produto from Produto produto where codigo = :codigo";
		Query query = HibernateUtil.getSession().createQuery(hql);
		query.setInteger("codigo", codigo);
		return (Produto) query.uniqueResult();
	}
}
