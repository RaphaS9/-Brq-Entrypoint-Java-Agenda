## Exercício do curso entrypoint JAVA da Brq, professor Cid Andrade.

## [link da aula](https://drive.google.com/file/d/1S-v5-aNZMSCWquK5FhN2VlZAyzqn0FA3/view)

# Descricao do Projeto
O projeto consiste numa agenda de contatos, onde temos uma tabela para os nossos conhecidos e uma tabela relacionada onde os contatos destes conhecidos ficam armazenados. Podemos gerenciar com ambas as tabelas com toda implementação CRUD.

O programa foi feito em java utilizando interface gráfica e conexão ao banco de dados mySql. 
Alguns conceitos utilizados: 
- Vetores multidimensionais ([tutorial loaine groner](https://www.youtube.com/watch?v=P66G0rxdL-k))
- CRUD completo através de classes DAO
- ENUMS
- Alteraçao de foco/visibilidade em elementos da interface gráfica

# Instalação
## Primeiro passo: Instalar Java JDK 17

## Segundo passo: Instalar mySql
Para utilizar o banco de dados voce precisara ter o mysql e o connector java instalado.
Seu instalador do mysql deverá estar assim após a instalação: 

![Mysql installer](./readmeImgs/instalacaoMysql.PNG)
<br><br>

# Configuração

## Netbeans
Neste projeto utilizei a IDE netbeans, para o programa rodar nesta IDE algumas configurações iniciains são necessárias:

- Adicionar o conector java do mysql a IDE<br>
Para isto você precisará deste caminho do conector (que foi instaldo junto do mysql) e seguir os passos do gif (no meu caso deu um erro pois já estava adicionado). <br>
Caminho do conector: C:\Program Files (x86)\MySQL\Connector J 8.0\mysql-connector-java-8.0.30.jar

![Adicionado conector J ao netebeans](./readmeImgs/configNetbeans/adicionadoConectorJ.gif)


- Criar o database utilizado no projeto<br>
Primeiro passo que precisamos para começar o projeto é a criação do banco de dados.
Para isto, podemos utilizar o workbench do mysql, o prompt de comando ou a propria IDE. Através do comando:
Create database agenda;
No meu caso fiz através da IDE (novamento erro por já estar criado):

![Criando database pelo netbeans](./readmeImgs/configNetbeans/criandoDB.gif)
<br><br>


# Demonstração
A seguir alguns gifs com a demonstração do funcionamento pleno do programa para referência.

## Tabela Conhecido
- ### Inserindo Conhecido
![Gif demonstrando a inserção de um novo conhecido na tabela](./readmeImgs/conhecido/inserindoConhecido.gif)
<br>

- ### Alterando Conhecido
![Gif demonstrando a alteraão de um conhecido na tabela](./readmeImgs/conhecido/alterandoConhecido.gif)
<br>

- ### Removendo Conhecido
![Gif demonstrando a remoção de um conhecido na tabela](./readmeImgs/conhecido/deletandoConhecido.gif)
<br><br>

## Tabela Contato
- ### Inserindo novo contato
![Gif demonstrando a inserção de um novo contato na tabela](./readmeImgs/contato/inserindoContato.gif)
<br>

- ### Inserindo novo contato
![Gif demonstrando a alteração de um contato na tabela](./readmeImgs/contato/alterandoContato.gif)
<br>

- ### Inserindo novo contato
![Gif demonstrando a remoção de um novo contato na tabela](./readmeImgs/contato/deletandoContato.gif)