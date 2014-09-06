# Cria schema
create schema javadev;

# Cria tabela de Produtos
create table javadev.produtos (
	codigo int(10) not null auto_increment,
	descricao varchar(50),
	primary key (codigo),
	unique index produtos_ndx01 (descricao)
);

# Cria tabela de Tabelas de Preço
create table javadev.tabelasDePreco (
	codigo int(10) not null auto_increment,
	descricao varchar(50),
	validadeInicio datetime,
	validadeFim datetime,
	primary key (codigo)
);

# Cria tabela de Preço de Produtos
create table javadev.produtoPreco (
	codigo int(10) not null auto_increment,
	tabela int(10),
	produto int(10),
	valor float(8,2),
	primary key (codigo),
	foreign key (tabela)  references tabelasDePreco(codigo),
	foreign key (produto) references produtos(codigo)
);

# Cria tabela de Estoque de Produtos
create table javadev.produtoEstoque (
	codigo int(10) not null auto_increment,
	produto int(10),
	quantidade int(10),
	primary key (codigo),
	foreign key (produto) references produtos(codigo)
);