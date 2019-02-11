package br.com.guilherme;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class demoQAMap {
		
		@FindBy(xpath = "//*[@id='valorAplicar']")
		public WebElement valorAplicar;	
		
		@FindBy(xpath = "//*[@id='valorInvestir']")
		public WebElement valorInvestir;
		
		@FindBy(xpath = "//*[@id='tempo']")
		public WebElement tempo;		
		
		@FindBy(xpath = "//*[@class='btn btnAmarelo btnSimular']")
		public WebElement btnSimular;	
		
		@FindBy(xpath = "/html/body/div[3]/div/div/div[1]/div/div[2]/span[2]")
		public WebElement valorAserPoupado;	
		
		@FindBy(xpath = "//*[@id='valorAplicar-error']")
		public WebElement alertaMsgValorAplicar;	
		
		@FindBy(xpath = "//*[@id='valorInvestir-error']")
		public WebElement alertaMsgValorInvestir;					
		
	
	

}
