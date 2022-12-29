package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_DriverfindElementMethodu {

    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        // bizim muhatabimiz driver'dir bizim adimiza testi otomat eden driver'dir
        // driver'e git bu findElement'i bul diyoruz oda bize ben bu elementi ne ile bulayim diyor
        // bizde diyoruz ki By id ile bul ve id'isi (twotabsearchtextbox) bu olanla bul
        // ve getirilen webelementi bizde tanimladigimiz aramaKutusu'na atiyoruz ve devaminda
        // aramaKutusu'nu da WebElement'ile tanimlamisizdir olay bu tatlim

        aramaKutusu.sendKeys("Java");
        aramaKutusu.clear();
        Thread.sleep(3000);

        aramaKutusu.sendKeys("Nutella"); // buda aranacak kelimeyi girmektir
        aramaKutusu.submit(); // bu arama islemini yapiyor
        Thread.sleep(3000);


        driver.close();
    }
}
