package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\com.Team105Selenium\\src\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // burada da ki code satiri 15 saniye bekle diyoruz bazen
        // codun hizi internetin hizindan cok daha yuksek olur
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr/");

        WebElement giftCardLinki= driver.findElement(By.partialLinkText("Çok Satanlar"));
        giftCardLinki.click();

        // istenen sayfaya gittigini test etmek icin
        // titkle'in Gift Card icerdigini test edebiliriz

        String expectedKelime="Gift Cards";
        String actualtitle= driver.getTitle();

        if (actualtitle.contains(expectedKelime)) System.out.println("Gift Cards testi PASSED");
        else System.out.println("Gift Card testi FAILED");

        Thread.sleep(4000);
        driver.close();
    }
}
