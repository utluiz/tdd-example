package br.com.starcode.calculadora;

import java.io.File;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginaTest {

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
		
		//abre página 1
		driver.get(new File("src/test/resources/pagina1.html").getAbsolutePath());
		Thread.sleep(2000);
		
		//clica no link
		WebElement link = driver.findElement(By.tagName("a"));
		link.click();
		
		Thread.sleep(2000);
		
		//verifica se está na página 2
		Assert.assertTrue(driver.getPageSource().contains("Bem-vindo à Página 2!"));
		
	}
	
}
