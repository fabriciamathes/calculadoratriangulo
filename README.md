# calculadoratriangulo
Calculadora de triângulos
## Teste Matera - Descrever como executar o projeto
  
  ## Tech
  - Selenium
  - Cucumber
  - Java
  
  ## Instalação
  Você precisa ter instalado e/ou configurado na máquina:
  
  ### Java JDK
  Recomendo a instalação do JDK 8. Você pode fazer o download, de acordo com o seu sistema operacional, em [http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

  Também será necessário:
  * Configurar as variável e instalar
  
  | Variavéis de Ambiente | README |
  | ------ | ------ |
  | JDK baixar | Recomendo a instalação do JDK 8: [jdk-8u261-windows-x64.exe](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html#license-lightbox) |
  | JAVA_HOME| Informar onde o diretório JDK está instalado|
  | JAVA_PATH| onde o JDK está instalado|
  | Path| %JAVA_PATH%\bin|
  | MAVEN baixar| [Maven](https://maven.apache.org/download.cgi) descompactar no diretório no diretório de sua preferência |
  | MAVEN_HOME|Informar onde o diretório MAVEN está instalado|
  | Path| %MAVEN_HOME%|
  
  ### Efetuar o download dos browser drivers
  * Para iniciar, localmente, cada browser é necessário inicar o seu driver.
     * Efetue o download da versão mais atual de cada driver. 
        * Sempre utilizar a versão do driver mais próxima do seu navegador
     * Também não esqueça de deixar o seu browser atualizado.
	 
  * [chromedriver (Google Chrome)](https://sites.google.com/a/chromium.org/chromedriver/downloads)
  
  |Importante: |
  | ------ |
  |Na pasta \driver do projeto está o "chromedriver" na versão ChromeDriver 88.0.4324.96 |
   
  
  ## Plugins  
  ### Plugin Eclipse Marketplace:
  
  | Plugin | README |
  | ------ | ------ |
  | Cucumber | No eclipse na aba Help > opção Marketplace: pesquisar por cucumber e instalar|
  
  
  # Setting up selenium-cucumber-java
  - Clone respective repository or download zip.
  ```bash
  $ git clone https://github.com/fabriciamathes/teste-inmetrics.git
  ```
  - Importe o projeto utilizando o "Existing Mave Projects";
  - Click com o botão direito no projeto vá em Configure/Convert to Cucumber Projet e click.
  
  # Pre-requisitos
  - Java 8;
  - Maven;
  - Configurar as variáveis de ambiente;
  - Eclipse Plugins Cucumber;
  - Ter a versão do driver compatível com o browser;
  
  # Running test suit
  ### Via terminal
  * No diretório do projeto, abra o terminal execute o comando:
  
    ```bash
    mvn clean verify    
	```
    * Gera o relatório "target/cucumber-reports" e "cucumber-report-html"
	  * na pasta do projeto target/cucumber-report-html/cucumber-html-reports/feature-overview.html
	  * Para vizualisar o relatório de execução Cucumber [feature overview page](./img/feature-overview.JPG)

    ```bash
    mvn verify -DskipTest
    ```
      * Gera o relatório "cucumber-report-html" baseado no "target/cucumber.json"   
      
    ```bash
    $ mvn test
    ```
    * Gera o relatório "target/cucumber-reports"


  ## Features!

  - RegisterUser.feature (Cadastrar usuário)
  - Login.feature
  - RegisteEmployee.feature (Cadastrar Funcionário)
  - Employee.feature(Edit, excluir)
  
  Arquitetura Projeto
--------------
	teste-inmetrics(Project-Name)
		|
		|_src/main/java
		|	|_common
		|	|	|_Driver.java
		|	|	|_Element.java
		|	|	|...
		|	|_enums
		|	|	|_ByValue.java
		|	|	|...
		|	|_pages
		|	|	|_CaculadoraTrianguloPage.java
		|	|	|...
		|	|_runner
		|	|	|_RunnerTest.java
		|	|	|...
		|	|_steps
		|	|	|_CalculadoraTriangulosSteps.java
		|	|	|_Hooks.java
		|	|	|...
		|_src/test/resources
		|	|_features
		|	|	|_CalculadoraTriangulo.feature
		|	|	|...
		|_driver
		|...

* **_common** - métodos genéricos para as páginas do sistema
* **_enums** - valores constantes pré-definidos
* **_pages** - mapeamento de elementos e interação com a tela
* **_runner** - execução da suite de testes
* **_steps** - implementação das features e execução de métodos de ação do sistema
* **_src/test/resources/features - implementação dos cenários de testes em Ghekin
* **_driver - pasta do driver "chromedriver"



