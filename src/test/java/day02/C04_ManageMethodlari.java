package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        Ileride wait konusunu daha genis olarak ele alacagiz.
        Bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yukleme suresine ihtiyac vardir veya bir web elementin kullanilabilmesi
        icin zamana ihtiyac olabilir.
        implicitylyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim
        icin beklenecek MAXIMUM sureyi belirleme olanagi tanir.
         */
    }
}
