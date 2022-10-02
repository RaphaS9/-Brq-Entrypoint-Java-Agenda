## Exercício do curso entrypoint JAVA da Brq, professor Cid Andrade.
Nesta branch (raphael) está todas as alterações feitas por mim. Já na branch (professor) está o código do professor que recebemos para alterá-lo.<br>
## <a href="https://drive.google.com/file/d/1S-v5-aNZMSCWquK5FhN2VlZAyzqn0FA3/view)" taget="_blank">link da aula</a>
<br> <a href="#demoPrograma">Demo</a>

# Descricao do Projeto
O projeto consiste numa agenda de contatos, onde temos uma tabela para os nossos conhecidos e uma tabela onde os contatos destes conhecidos ficam armazenados. E oferece a possibilidade de gerenciar os dados de ambas as tabelas

O programa foi feito em java utilizando sua interface gráfica e conexão ao banco de dados mySql. 
Alguns conceitos utilizados: 
- Vetores multidimensionais ([tutorial loaine groner](https://www.youtube.com/watch?v=P66G0rxdL-k))
- CRUD completo através de classes DAO
- ENUMS
- Alteraçao de foco/visibilidade em elementos da interface gráfica
<br>

# Instalação
## Primeiro passo: Instalar Java JDK 17
<br>

## Segundo passo: Instalar mySql
Para utilizar o banco de dados será necessário ter o mysql e o conector java instalado.
Após a instalação, seu instalador do mysql deverá estar assim: 

![Mysql installer](./readmeImgs/instalacaoMysql.PNG)
<br><br>

# Configuração

## IDE
Neste projeto utilizei a IDE netbeans, para o programa rodar algumas configurações iniciais são necessárias:

- **Adicionar o conector java do mysql a IDE.**<br>
Para isto você precisará deste caminho do conector (que foi instaldo junto do mysql) e seguir os passos do gif (no meu caso deu um erro pois já estava adicionado). <br>
Caminho do conector: C:\Program Files (x86)\MySQL\Connector J 8.0\mysql-connector-java-8.0.30.jar

![Adicionado conector J ao netebeans](./readmeImgs/configNetbeans/adicionadoConectorJ.gif)


- **Criar o database utilizado no projeto.**<br>
Primeiro passo que precisamos para começar o projeto é a criação do banco de dados.<br>
Para isto, podemos utilizar o workbench do mysql, o prompt de comando ou a própria IDE. Através do comando:<br>
*Create database agenda;*<br>
No meu caso fiz através da IDE (novamento o erro se dá já estar criado):

![Criando database pelo netbeans](./readmeImgs/configNetbeans/criandoDB.gif)
<br><br>

<div id="demoPrograma">
  ## Demonstração do Programa
  A seguir alguns gifs com a demonstração do funcionamento pleno do programa para referência.

  ## Tabela Conhecido
  - ### Inserindo Conhecido
  ![Gif demonstrando a inserção de um novo conhecido na tabela](./readmeImgs/conhecido/inserindoConhecido.gif)
  <br>

  - ### Alterando Conhecido
  ![Gif demonstrando a alteraão de um conhecido na tabela](./readmeImgs/conhecido/alterandoConhecido.gif)
  <br>

  - ### Removendo Conhecido
  Para remover um conhecido, todos os seus contatos devem ter sido removidos anteriormente, ou seja ele não pode ter nenhum contato salvo ou um erro será apresentado.<br><br>
  ![Gif demonstrando a remoção de um conhecido na tabela](./readmeImgs/conhecido/deletandoConhecido.gif)
  <br><br>

  ## Tabela Contato
  - ### Inserindo novo contato
  Para inserir um novo contato, primeiro deve-se selecionar o conhecido em que deseja adicionar o contato, na primeira tela, então alterar a tela para contato e então selecionar o botão inserir. O mesmo conceito será utilizado para alteração e remoção.<br><br>
  ![Gif demonstrando a inserção de um novo contato na tabela](./readmeImgs/contato/inserindoContato.gif)
  <br>

  - ### Alterando novo contato
  ![Gif demonstrando a alteração de um contato na tabela](./readmeImgs/contato/alterandoContato.gif)
  <br>

  - ### Removendo novo contato
  ![Gif demonstrando a remoção de um novo contato na tabela](./readmeImgs/contato/deletandoContato.gif)
 </div>
