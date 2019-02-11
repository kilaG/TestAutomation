#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Simular investimento na poupan�a   
    
   @tag1
   Scenario: Simular investimento na poupan�a com dados validos
   Given Acessei a pagina https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/
   And Preencha os campos com dados validos
   When Clico no botao simular
   Then O sistema retorna o resultado em tabela com mes e valor.
    
      
   @tag2
   Scenario: Simular investimento na poupan�a com dados validos
   Given Acessei a pagina https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/ 
   And Preencho os campos de valores com menos de R$20
   Then O sistema exibe uma mensagem "Valor m�nimo de 20.00" deve ser exibida".
    

    
    
 



   
      