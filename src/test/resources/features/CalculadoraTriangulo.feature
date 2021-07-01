#language: pt
#Author: fmathes
#encoding: iso-8859-1

Funcionalidade:  Calculadora de Triangulos

@Teste_1
 Esquema do Cenario: CT01 - Informar valores inválido.
 Dado que acesse a calculadora de triangulos página "Informe os Lados do Triângulo" 
 Quando preencho o lado "<lado_1>", "<lado_2>" e "<lado_3>"
 E clico no botão Calcular
 Entao devo ter o retorno da mensagem "<Tipo_Triangulo>"
 
 Exemplos:
| lado_1|lado_2|lado_3|Tipo_Triangulo          |
|       |      |      |Preencha todos os lados |
|   10  |   10 |      |Preencha todos os lados |
|       |   10 | 5    |Preencha todos os lados |
|   10  |      | 5    |Preencha todos os lados |


@Teste_2
Esquema do Cenário: CT02 - Informar valores válidos e calcular o tipo de triângulo utilizando a Calculadora de triângulos.
Dado que acesse a calculadora de triangulos página "Informe os Lados do Triângulo" 
Quando preencho o lado "<lado_1>", "<lado_2>" e "<lado_3>"
E clico no botão Calcular
Então devo ter o retorno do tipo de triângulo "<Tipo_Triangulo>"

Exemplos:
| lado_1|lado_2|lado_3|Tipo_Triangulo          |
|  1    | 1    | 1    |Triângulo Equilátero    |
|  -1   | -1   | -1   |Triângulo Equilátero    |
|  5    | 10   | 10   |Triângulo Isósceles     |
|  -10  |  10  |  10  |Triângulo Isósceles     |
|  5    | 8    | 7    |Triângulo Escaleno      |
|  5    | 8    | -7   |Triângulo Escaleno      |
 
 

