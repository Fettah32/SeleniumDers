package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Amazon sayfasına gidiniz.
        driver.get("https://www.amazon.com");

        // Arama kutusuna locate ediniz.
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusunun tagName'inin input oldugunu test ediniz.
        String expectedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("tagName Test Passed" + actualTagName);
        } else System.out.println("tagName Test Failed" + actualTagName);

        // Arama kutusunun name attributenin  field-keywords oldugunu test ediniz.
        String expectedAttributeName = "field-keywords";
        String actualAttributeName = aramaKutusu.getAttribute("name");
        if (actualAttributeName.equals(expectedAttributeName)) {
            System.out.println("Attribute Test Passed");
        } else System.out.println("Attribute Test Failed");

        // Arama kutusunun konumunu yazdiriniz.
        System.out.println("Arama kutusu konumu : " + aramaKutusu.getLocation());

        // Sayfayi kapatiniz.
        driver.close();
    }
}
