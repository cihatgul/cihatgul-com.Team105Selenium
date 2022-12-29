package day03_Locators;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ByName {
    public static void main(String[] args) throws InterruptedException {

        System.getProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // 15'saniye suresince bekle diyorduk



        driver.get("https://www.amazon.com.tr/");
        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
        // arama kismina git diyoruz burada arama kisminin css kodu "field-keywords"

        aramaKutusu.sendKeys("nutella"+Keys.ENTER);
        // bu satirda arama kismina nutella yaz diyoruz sendKeys ile,
        // ondan sonra da Keys.ENTER ile enter'la diyoruz abimize :)

        Thread.sleep(3000);
        driver.close();





    }
}

