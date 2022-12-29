package day02_driverMethodlari;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        System.out.println("maximize olandir "+driver.manage().window().getSize());
        System.out.println("maximize window konumu "+driver.manage().window().getSize());

        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen window olandir bu "+driver.manage().window().getSize());
        System.out.println("Fullscreen window konumu "+driver.manage().window().getSize());
        Thread.sleep(3000);
        // browser'i istedigimiz boyutlara getirelim

        driver.manage().window().setPosition(new Point(100,100));
        driver.manage().window().setPosition(new Point(300,300));


        Thread.sleep(3000);
        driver.close();


    }
}
