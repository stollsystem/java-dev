package br.com.carlosgomes.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import br.com.carlosgomes.util.HibernateUtil;

@SuppressWarnings("unchecked")
public class GenericDAO<T, I> implements DAO<T, I> {

	private Session session = HibernateUtil.getSession();
	
	public T busca(I pk) {
		return (T) this.session.get(this.getClazz(), (Serializable) pk);
	}

	public List<T> busca() {
		Criteria criteria = this.session.createCriteria(this.getClazz());
		return (List<T>) criteria.list();
	}

	public void salva(T persistentClass) {
		this.session.saveOrUpdate(persistentClass);
	}
	
	public void exclui(T entity) {
		this.session.delete(entity);
	}
	
	private Class<?> getClazz() {
		return (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass())
							.getActualTypeArguments()[0];
	}
	
	public void beginTransaction() {
		session.beginTransaction();
	}
	
	public void commit() {
		session.getTransaction().commit();
	}
	
	public void rollback() {
		session.getTransaction().rollback();
	}
	
}
