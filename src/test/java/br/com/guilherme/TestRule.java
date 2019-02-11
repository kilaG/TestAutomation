package br.com.guilherme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule {
	
	private static WebDriver driver;

	@Before
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");		
	}
	
	@After
	public void afterScenario() {
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	
	
}
