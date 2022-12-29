package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassName {
    public static <Webelement> void main(String[] args) throws InterruptedException {

        // amazona gidin nutella aramasini yapin
        // ilk sayfada cikan urunlerin icerisinde
        // en yuksek fiyati bulun

        System.getProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\com.Team105Selenium\\src\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com.tr/");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        List<WebElement> fiyatlarListesi=driver.findElements(By.className("a-price-whole"));

        // Webelement bir obje oldugundan direk yazdirmak
        System.out.println(fiyatlarListesi);

        // bunun icin bir for-each loop kullanarak
        // her bir webelement uzerinde ki yazzilari tek tek yazdiralim

        for (WebElement each:fiyatlarListesi) System.out.print(each.getText()+" ");

        // en yuksek fiyati bulabilmek icin java bilgimizi kullanmaliyiz
        // web elementlerden get text olarak fiyati String olarak alin
        // String fiyati kiyaslamak yapmak icin int cevirin en yuksek fiyati bulup yazin

        String fiyatStr;
        Integer fiyatInt;
        Integer enYuksekFiyat=0;

        for (WebElement each:fiyatlarListesi
             ) {
            fiyatStr=each.getText();
            fiyatInt=Integer.parseInt(fiyatStr);
            if (fiyatInt>enYuksekFiyat){
                enYuksekFiyat=fiyatInt;
            }
        }
        System.out.println("");
        System.out.println("En yuksek urun fiyati: "+enYuksekFiyat);
        
        Thread.sleep(3000);
        driver.close();
    }
}
