package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to() methodu sayfada ileri geri yapıcaksak kullanılır
        //driver.get() methodu gibi bizi istediğimiz Url'e götürür
        driver.navigate().to("https://techproeducation.com");
        // Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back();
        // Tekrar techproed sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward();
        // Techproed sayfasını yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();
        // Son olarak sayfayı kapatınız
        driver.close();

        /*
        ODEV
        1-)
        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.



        2-)
        Yeni bir Class olusturalim.C05_NavigationMethods
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim
         */

    }

}
