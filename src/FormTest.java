
import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormTest {
    WebDriver driver;

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/home/sanclemente.local/a22danielrv/pruebas_selenium/CD_UD03_Selenium/driver/chromedriver");
        driver = new ChromeDriver();
        

    }

    @Test
    public void testCombo() {
        driver.get("file:///home/sanclemente.local/a22danielrv/pruebas_selenium/CD_UD03_Selenium/src/index.html");
        WebElement checkbox1 = driver.findElement(By.name("pinha"));
        WebElement checkbox2 = driver.findElement(By.name("sin_pinha"));
        checkbox1.click();
        checkbox2.click();
        assertEquals(true, !checkbox1.isSelected() && checkbox2.isSelected() || checkbox1.isSelected() && !checkbox2.isSelected());
        
        
    }
    @Test
    public void testRadios() {
        driver.get("file:///home/sanclemente.local/a22danielrv/pruebas_selenium/CD_UD03_Selenium/src/index.html");
        WebElement masaFina = driver.findElement(By.xpath("//input[@name='boton' and @value='1']"));
        masaFina.click();

        WebElement masaGruesa = driver.findElement(By.xpath("//input[@name='boton' and @value='2']"));
        masaGruesa.click();
        
        WebElement Clasico = driver.findElement(By.xpath("//input[@name='boton' and @value='3']"));
        Clasico.click();

        assertEquals(true, !masaFina.isSelected() && !masaGruesa.isSelected() && Clasico.isSelected());
        
    }

    @Test
    public void testComo() {
        driver.get("file:///home/sanclemente.local/a22danielrv/pruebas_selenium/CD_UD03_Selenium/src/index.html");
        Select menu = new Select(driver.findElement(By.name("menu")));
        menu.selectByIndex(0);
        menu.selectByValue("2");
        menu.selectByVisibleText("Tres");
    
        
    }
}