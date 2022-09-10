package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",  "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        /*
        1- Amazon sayfasina gidiniz
        2- Basligin Amazon icerdigini test ediniz.
        3- Url'nin amazon icerdigini test ediniz.
        4- Sayfayi kapatin
         */

        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        if (driver.getTitle().contains("Amazon")) {
            System.out.println("Test PASSED");
        } else System.out.println("TestFailure");

        System.out.println(driver.getCurrentUrl());
        if (driver.getCurrentUrl().contains("amazon")) {
            System.out.println("Test PASSED");
        }else System.out.println("TestFailure");

        driver.close();


    }
}
