import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestandoSelenium {

    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "c:\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("file:///C:/Users/fabio.roliveira/OneDrive - americanas s.a/Documentos/06. Fábio_bkp/Exseed/Automação/paginaExemplo.html");

        WebElement campoTexto = driver.findElement(By.id("meuTexto"));

        campoTexto.sendKeys("Enviar um valor");

        WebElement meuBotaoClique = driver.findElement(By.id("botaoClique"));

        meuBotaoClique.click();
    }

}
