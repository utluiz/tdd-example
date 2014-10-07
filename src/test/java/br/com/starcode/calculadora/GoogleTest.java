package br.com.starcode.calculadora;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@After
	public void cleanup() {
		driver.close();
	}
	
	@Test
	public void testName() throws Exception {
		
		//abre página
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
		//encontra caixa de pesquisa
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//digita texto a ser pesquisado e dá um "enter"
		searchBox.sendKeys("test-driven development\n");
		Thread.sleep(2000);
		
		//localiza o primeiro resultado
		WebElement firstResult = driver.findElement(By.cssSelector("div.rc h3.r a"));
		
		//clica no primeiro elemento
		firstResult.click();
		
		Thread.sleep(5000);
		
		//verifica o título "Test Driven Development"
		WebElement title  = driver.findElement(By.cssSelector("h1"));
		Assert.assertTrue(title.getText().contains("Test Driven Development"));
		
	}
	
}
