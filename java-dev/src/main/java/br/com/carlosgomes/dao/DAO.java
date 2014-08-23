package br.com.carlosgomes.dao;

public interface DAO<T, I> {
	T busca(I i);
	void salva(T t);
	void exclui(T t);
}
