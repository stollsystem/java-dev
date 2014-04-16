create schema javadev;

create table javadev.produtos (
	codigo int(10) not null auto_increment,
	descricao varchar(50),
	primary key (codigo),
	index produtos_ndx01 (descricao)
);

create table javadev.tabelasDePreco (
	codigo int(10) not null auto_increment,
	descricao varchar(50),
	validadeInicio datetime,
	validadeFim datetime,
	primary key (codigo)
);

create table javadev.produtoPreco (
	codigo int(10) not null auto_increment,
	tabela int(10),
	produto int(10),
	valor float(8,2),
	primary key (codigo),
	foreign key (tabela)  references tabelasDePreco(codigo),
	foreign key (produto) references produtos(codigo)
);

create table javadev.produtoEstoque (
	codigo int(10) not null auto_increment,
	produto int(10),
	quantidade int(10),
	primary key (codigo),
	foreign key (produto) references produtos(codigo)
);