package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlari {

    public static void main(String[] args) {


        System.getProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // gittigimiz sayfa acilincaya veya aradigimiz web
    }
}
