package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {

    public static void main(String[] args) {

        System.getProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        // pageSource'un meuw icerdigini test edin

        String pageSource= driver.getPageSource();

        String expectedKelime="MEOW";

        if (expectedKelime.contains(expectedKelime)){
            System.out.println("page source testi PASSED");
        }else {

        }
    }
}
