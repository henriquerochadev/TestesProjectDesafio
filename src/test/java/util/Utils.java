package util;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static java.lang.System.out;
import static org.junit.Assert.assertEquals;

public class Utils {
    private ChromeDriver driver;

    public void start(){
        System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://sampleapp.tricentis.com/101/app.php");
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        out.println("Teste Iniciado!");
    }
    public void sleep(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void sleepfinal(){
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void click(By elemt_id) {
        driver.findElement(elemt_id).click();
        out.println(elemt_id + " => click");
    }
    public void fillformid(By elemt_id, String value){
        driver.findElement(elemt_id).sendKeys(value);
        out.println(elemt_id + " => Elemento preenchido!");
    }
    public void dropdown(By elemt_id, String value){
        Select dropdown = new Select(driver.findElement(elemt_id));
        dropdown.selectByVisibleText(value);
        out.println(elemt_id + " => Elemento  seleciodo!");
    }
    public void dropdownvlue(){
        driver.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(4) > .ideal-check")).click();
        out.println("radio" + " => Primeiro radio direto no css em utils");
    }
    public void dropdownop(){
        driver.findElement(By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(1) > .ideal-check")).click();
        out.println("radio" + " => Segundo radio direto no css em utils");
    }

    public void selectionPriceOption(){
        driver.findElement(By.cssSelector(".choosePrice:nth-child(2) > .ideal-radio")).click();
        out.println("radio" + " => Terceiro radio direto no css em utils");
    }

    public void checkmessage(){
        assertEquals("Sending e-mail success!", driver.findElement(By.cssSelector("h2")).getText());
        out.println("Sistema Testado com Sucesso!");
        sleep();
        driver.close();
    }
}


