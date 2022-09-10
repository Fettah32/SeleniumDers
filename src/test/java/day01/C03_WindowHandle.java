package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle()); //CDwindow-ADF46BF82C4ED3467FC28BB4ED606B3B
        // Farkli pencereler arasinda gezinebilmek icin getWindowHandle() method'unu kullaniriz.
        driver.close();

    }
}
