package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Odev01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      // Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
      // Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi : " + driver.getTitle());
        // Sayfa basliginin “Amazon” icerdigini test edin
        String baslik = driver.getTitle();
        String istenenKelime = "Amazon";
        if (baslik.contains(istenenKelime)) {
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");
      // Sayfa adresini(url) yazdirin
        System.out.println("Sayfanin URL'i : " + driver.getCurrentUrl());
        // Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "amazon";
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("URL Test Passed");
        }else System.out.println("URL Test Failed");
      //         Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        // Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualPageSource = driver.getPageSource();
        String expectedWorld = "Gateway";
        if (actualPageSource.contains(expectedWorld)) {
            System.out.println("Sourcecode Test Passed");
        }else System.out.println("Sourcecode Test Failed");
      // Sayfayi kapatin.
        driver.close();

    }
}
