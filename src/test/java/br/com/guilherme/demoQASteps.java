package br.com.guilherme;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class demoQASteps {
	
	 @Given ("Acessei a pagina https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/")  
	 public void acessarPagina() {
	 
	 }	 
	 
	 @And("Preencha os campos com dados validos")
	 public void preencherCamposValidos() {
		 demoQAPage demoQAPage = new demoQAPage();
		 demoQAPage.valorAplicar.sendKeys("10000");
		 demoQAPage.valorInvestir.sendKeys("10000");
		 demoQAPage.tempo.sendKeys("2");
	 }	
	 	
	 
	 @When("Clico no botao simular")
	 public void clicarBotaoSimular() {
		 demoQAPage demoQAPage = new demoQAPage();
		 demoQAPage.btnSimular.click();
	 }	 	    
		  
	 
	 @Then("O sistema retorna o resultado em tabela com mes e valor.")
	 public void validarRetornoMesEvalor() throws Throwable {
		 demoQAPage demoQAPage = new demoQAPage();
		 assertNotNull(demoQAPage.valorAserPoupado.getText());
	   
	 }	
	 
	 @Given("^Preencho os campos de valores com menos de R\\$(\\d+)$")
	 public void preencho_os_campos_de_valores_com_menos_de_R$(int arg1) throws Throwable {
		 demoQAPage demoQAPage = new demoQAPage();
		 demoQAPage.valorAplicar.sendKeys("10");
		 demoQAPage.valorInvestir.sendKeys("10");
		 demoQAPage.tempo.sendKeys("2");
	 }

	 @Then("^O sistema exibe uma mensagem \"([^\"]*)\" deve ser exibida\"\\.$")
	 public void o_sistema_exibe_uma_mensagem_deve_ser_exibida(String arg1) throws Throwable {
		 demoQAPage demoQAPage = new demoQAPage();
		 assertEquals("Valor mínimo de 20.00",demoQAPage.alertaMsgValorAplicar.getText());
		 assertEquals("Valor mínimo de 20.00",demoQAPage.alertaMsgValorInvestir.getText());
	    
	 }
	 
	 
	

}
