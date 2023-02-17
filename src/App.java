import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");
        
        try {

            /* 
            driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

            System.out.println(driver.getTitle());
            WebElement busqueda = driver.findElement(By.id("searchInput"));
            WebElement BotonBusqueda = driver.findElement(By.id("searchButton"));
            
            busqueda.sendKeys("Selenium");
            driver.findElement(By.id("n-portal")).click();
            driver.findElement(By.linkText("Página aleatoria")).click();
            WebElement tituloPagina = driver.findElement(By.id("FirstHeading"));
            System.out.println(tituloPagina.getText());

            WebElement title = driver.findElement(By.tagName("title"));

            System.out.println(title.getAttribute("innerText"));

            WebElement footer = driver.findElement(By.tagName("footer"));

            System.out.println(footer.getAttribute("role"));

            List<WebElement> elementosDiv = driver.findElements(By.tagName("div"));
            for (WebElement webElement : elementosDiv) {

                System.out.println(webElement.getAttribute("innerText"));

            }
            
            busqueda.sendKeys("Jake el perro");
            BotonBusqueda.sendKeys(Keys.ENTER);
            assertEquals("Jake el perro", driver.getTitle());
            */
            
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        driver.quit();
    }


}
  