java-dev
========
Desenvolvimento Java

<h4>Criando o projeto com Eclipse e GitHub</h4>
. Instalei o <b>Eclipse IDE for Java EE Developers</b>, versão Kepler, através do site eclipse.org;<br/>
. No Eclipse, em Help > Eclipse Marketplace, instalei o <b>EGit</b>;<br/>
. O <b>m2eclipse</b> pelo Marketplace está obsoleto. Na URL https://www.eclipse.org/m2e/download obtive o endereço para instalação: http://download.eclipse.org/technology/m2e/releases. Efetuei através do Help > Install New Software;<br/>
. Criei repositório <b>java-dev</b> no GitHub;<br/>
. Através do Terminal, criei o diretório git e clonei o repositório através do comando <i>git clone https://github.com/supersuporte/java-dev.git</i>;<br/>
. No Eclipse, em Repositórios Git, adicionei o repositório já criado localmente;<br/>
. Criei um novo projeto Maven;<br/>
. Botão direito no projeto > Team > Share, e compartilhei com o repositório local;<br/>
. A partir daí já posso fazer commits e pushs no projeto.

<h4>Criando a base MySQL</h4>
. Criei o diretório database no repositório com o script responsável em criar o schema, tabelas, índices e constraints;<br/>
. Pelo Terminal, usei <i>git status</i> para verificar o arquivo em questão;<br/>
. Adicionei este arquivo: git add database/*;<br/>
. Fiz commit: git commit -m "comentários";<br/>
. Fiz push: git push.<br/>

<h4>Instalando o módulo mysql no JBoss</h4>
. Em %JBOSS_HOME%/modules, copiei o arquivo com/mysql/main/mysql-connector-java-5.1.17-bin.jar;<br/>
. Criei o arquivo module.xml no mesmo diretório;<br/>
. No %JBOSS_HOME%/standalone/configuration/standalone.xml, configurei o driver e o datasource.<br/>

<h4>Configurando o projeto com MySQL e Hibernate</h4>
. Criei arquivo src/main/webapp/WEB-INF/web.xml;<br/>
. Criei arquivo src/main/resources/META-INF/persistence.xml;<br/>
. Adicionei dependências no pom.xml para o MySQL e para o Hibernate.<br/>

<h4>Estrutura Hibernate</h4>
. Criei classe HibernateUtil;<br/>
. Criei Entidade Produto, DAO e ManagedBean.<br/>

<h4>Configuração do JSF</h4>
. Adicionei dependências no pom.xml para o JSF;<br/>
. Configurei o web.xml para mapear o JSF.<br/>

<h4>Criação de uma página xhtml com JSF, PrimeFaces e templates em Velocity</h4>
. Adicionei dependências no pom.xml para o Velocity;<br/>
. Criei a classe Layout para utilização dos templates em velocity;<br/>
. Criei uma página em xhtml, configurando utilizando templates como cabeçalho e rodapé;<br/>
. Adicionei dependências no pom.xml para o PrimeFaces;<br/>
. Adicionei um menubar;<br/>
. Criei um método para buscar uma lista de produtos no ProdutoManagedBean;<br/>
. Adicionei um dataTable.<br/>
