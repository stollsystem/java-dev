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

<h4>Configurando o projeto com MySQL e Hibernate</h4>
. Criei arquivo src/main/webapp/WEB-INF/web.xml;<br/>
. Criei arquivo src/main/resources/META-INF/persistence.xml;<br/>
. Adicionei dependências no pom.xml para o MySQL e para o Hibernate.
