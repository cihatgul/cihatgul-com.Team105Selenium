package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WindowHandleDegeri {

    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        System.out.println(driver.getWindowHandle()); // CDwindow-9D98C7AC26281416AA0C557FE6C880F9

        driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getWindowHandle());

        Thread.sleep(3000);
        driver.close();


    }
}
