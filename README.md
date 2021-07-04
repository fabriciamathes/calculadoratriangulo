# Calculadora de triângulos
  
# Tech
  - Selenium
  - Cucumber
  - Java
  
# Instalação
  Você precisa ter instalado e/ou configurado na máquina:
  
### Java JDK
  Recomendo a instalação do JDK 8. Você pode fazer o download, de acordo com o seu sistema operacional, em [http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

  Também será necessário:
  <details>
  <summary> Configurar as variável e instalar </summary>
 
  | Variavéis de Ambiente | README |
  | ------ | ------ |
  | JDK baixar | Recomendo a instalação do JDK 8: [jdk-8u261-windows-x64.exe](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html#license-lightbox) |
  | JAVA_HOME| Informar onde o diretório JDK está instalado|
  | JAVA_PATH| onde o JDK está instalado|
  | Path| %JAVA_PATH%\bin|
  | MAVEN baixar| [Maven](https://maven.apache.org/download.cgi) descompactar no diretório no diretório de sua preferência |
  | MAVEN_HOME|Informar onde o diretório MAVEN está instalado|
  | Path| %MAVEN_HOME%|
  </details> 
  <br>
  <details> 
  <summary> Efetuar o download dos browser drivers </summary>
  * Para iniciar, localmente, cada browser é necessário inicar o seu driver.
     * Efetue o download da versão mais atual de cada driver. 
        * Sempre utilizar a versão do driver mais próxima do seu navegador
     * Também não esqueça de deixar o seu browser atualizado.
	 
  * [chromedriver (Google Chrome)](https://sites.google.com/a/chromium.org/chromedriver/downloads)
  
  |Importante: |
  | ------ |
  |Na pasta \driver do projeto está o "chromedriver" na versão ChromeDriver 91.0.4472.101 |
  </details> 
  
### Plugins  
  ### Plugin Eclipse Marketplace:
  
  | Plugin | README |
  | ------ | ------ |
  | Cucumber | No eclipse na aba Help > opção Marketplace: pesquisar por cucumber e instalar|
  
  
# Baixar projeto
  - Clone respective repository or download zip.
  ```bash
  $ git clone https://github.com/fabriciamathes/calculadoratriangulo.git
  ```
  - Importe o projeto utilizando o "Existing Mave Projects";
  - Click com o botão direito no projeto vá em Configure/Convert to Cucumber Projet e click.
  
# Pre-requisitos
  - Java 8;
  - Maven;
  - Configurar as variáveis de ambiente;
  - Eclipse Plugins Cucumber;
  - Ter a versão do driver compatível com o browser;
  
# Execução da suit de testes
  
  ### Cenários de Teste
  * Escrita Gharkin: [cenários page](./img/cenarios.JPG)
	  
  ### Via Eclipse
  * Acessar a class RunnerTest.java clicar com o botão direito > Run AS > JUnit Test
	  * Exemplo relatório de execução Cucumber [feature overview page](./img/Relatório_Execução.jpg)
	  
  ### Via terminal
  * No diretório do projeto, abra o terminal execute o comando:
  
    ```bash
    mvn clean verify    
	```

    ```bash
    mvn verify -DskipTest
    ```
   
    ```bash
    $ mvn test
    ```

  ### Relatório da Execução
  * OS relatórios de execução serão gerados na pasta "\target" do projeto.

## Features!

  - CalculadoraTriangulo.feature
  
  Arquitetura Projeto
--------------
	teste-matera(Project-Name)
		|
		|_src/test/java
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
* **_pages** - mapeamento de elementos e métodos de interação com a tela
* **_runner** - execução da suite de testes
* **_steps** - implementação das features e execução de métodos de ação do sistema
* **_src/test/resources/features** - implementação dos cenários de testes em Ghekin
* **_driver** - pasta do driver "chromedriver"
