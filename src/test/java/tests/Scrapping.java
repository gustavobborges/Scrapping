package tests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrapping {

	public static void main(String[] args) {

		testeFazerLoginNoTaskit();
	}

	private static void testeFazerLoginNoTaskit() {
		System.setProperty("webdriver.chrome.driver", "D:\\Desenvolvimento Desktop\\test\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		navegador.get("http://www.juliodelima.com.br/taskit");

		navegador.findElement(By.linkText("Sign in")).click();

		navegador.findElement(By.id("signinbox")).findElement(By.name("login")).sendKeys("julio0001");
		navegador.findElement(By.id("signinbox")).findElement(By.name("password")).sendKeys("123456");
		
		navegador.findElement(By.linkText("SIGN IN")).click();

		String saudacao = navegador.findElement(By.className("me")).getText();
		
		
		assertEquals("Hi, Julio", saudacao);
		
		navegador.quit();
		
	}

}
