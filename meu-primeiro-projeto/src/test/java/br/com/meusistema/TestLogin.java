package br.com.meusistema;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestLogin {

    @Test
    public void testLogin() {

        System.setProperty("webdriver.chrome.driver", "c:\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://blazedemo.com/login");

        WebElement textoEMail = driver.findElement(By.id("email"));

        textoEMail.sendKeys("froliveira1985@gmail.com");

        WebElement textoSenha = driver.findElement(By.id("password"));

        textoSenha.sendKeys("asenha1");

        driver.findElements(By.tagName("button"));

        List<WebElement> listaBotoes = driver.findElements(By.tagName("button"));

        for ( WebElement botao : listaBotoes) {
            if (botao.getAttribute("type").equals("submit")) {
                botao.submit();
            }
        }

        String urlPostLoginComSucesso = driver.getCurrentUrl();

        Assertions.assertEquals("https://blazedemo.com/home", urlPostLoginComSucesso);

    }
}
