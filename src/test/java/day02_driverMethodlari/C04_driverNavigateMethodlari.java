package day02_driverMethodlari;

import org.junit.experimental.theories.Theories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_driverNavigateMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.com");

        Thread.sleep(3000);
        driver.get("https://www.wisequarter.com");

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();



        Thread.sleep(3000);
        driver.quit();
    }
}
