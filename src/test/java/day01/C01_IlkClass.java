package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        En temel haliyle bir otomasyon yapmak icin
        Class'imiza otomasyon icin gerekli olan webdriver'in
        yerini gostermemiz gerekir.
        Bunun icin Java kutuphanesinden System.setProperty() method'unu kullaniriz.
        Ve method'un icine ilk olarak driver'i yazariz. Ikinci olarak onun fiziki yolunu kopyalariz.
         */
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println("Actual Title : " + driver.getTitle()); // Gidilen sitenin basligini yazdirir.

        System.out.println("Actual URL : " + driver.getCurrentUrl()); // Gidilen sayfanin Url'ini getirir.

        System.out.println(driver.getPageSource()); // Cikan sayfadaki tum kaynak kodlari getirir.
    }
}
