package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(3000);
        // 2- Add Element butonuna basin
        driver.findElement(By.xpath("//*[text() = 'Add Element']")).click();
        Thread.sleep(3000);
        //Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.xpath("//*[text() = 'Delete']"));
        System.out.println(deleteButton.isDisplayed());
        Thread.sleep(2000);
        //Delete tusuna basin
        deleteButton.click();
        Thread.sleep(2000);
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = driver.findElement(By.xpath("//*[text() = 'Add/Remove Elements']"));
        System.out.println(addRemoveElement.isDisplayed());
        Thread.sleep(3000);
        // Elemental Selenium'a tiklayiniz.
        WebElement elementalSelenium = driver.findElement(By.xpath("//*[text() = 'Elemental Selenium']"));
        elementalSelenium.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
