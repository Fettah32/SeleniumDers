package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Amazon sayfasina gidiniz
        driver.get("https://www.amazon.com");
        // kaynak kodlarin icinde "Gateway" ifadesinin oldugunu test ediniz.
        System.out.println(driver.getPageSource());
        String istenenKelime = "Gateway";
        if (driver.getPageSource().contains(istenenKelime)) {
            System.out.println("PageSource test PASSED");
        }else {
            System.out.println("PageSource test FAILED");
        }

        driver.close(); // sayfayi kapatir
        // driver.quit(); // birden fazla sayfa varsa hepsini kapatir.

    }
}
