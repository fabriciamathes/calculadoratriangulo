#language: pt
#Author: fmathes
#encoding: iso-8859-1

Funcionalidade:  Calculadora de Triangulos

@Teste_1
 Esquema do Cenario: CT01 - Informar valores inv�lido.
 Dado que acesse a calculadora de triangulos p�gina "Informe os Lados do Tri�ngulo" 
 Quando preencho o lado "<lado_1>", "<lado_2>" e "<lado_3>"
 E clico no bot�o Calcular
 Entao devo ter o retorno da mensagem "<Tipo_Triangulo>"
 
 Exemplos:
| lado_1|lado_2|lado_3|Tipo_Triangulo          |
|       |      |      |Preencha todos os lados |
|   10  |   10 |      |Preencha todos os lados |
|       |   10 | 5    |Preencha todos os lados |
|   10  |      | 5    |Preencha todos os lados |


@Teste_2
Esquema do Cen�rio: CT02 - Informar valores v�lidos e calcular o tipo de tri�ngulo utilizando a Calculadora de tri�ngulos.
Dado que acesse a calculadora de triangulos p�gina "Informe os Lados do Tri�ngulo" 
Quando preencho o lado "<lado_1>", "<lado_2>" e "<lado_3>"
E clico no bot�o Calcular
Ent�o devo ter o retorno do tipo de tri�ngulo "<Tipo_Triangulo>"

Exemplos:
| lado_1|lado_2|lado_3|Tipo_Triangulo          |
|  1    | 1    | 1    |Tri�ngulo Equil�tero    |
|  -1   | -1   | -1   |Tri�ngulo Equil�tero    |
|  5    | 10   | 10   |Tri�ngulo Is�sceles     |
|  -10  |  10  |  10  |Tri�ngulo Is�sceles     |
|  5    | 8    | 7    |Tri�ngulo Escaleno      |
|  5    | 8    | -7   |Tri�ngulo Escaleno      |
 
 

