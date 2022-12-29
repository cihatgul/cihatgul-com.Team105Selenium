package day05_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");


        // 2- arama kutusunu locate edelim
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));


        // 3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones"+ Keys.ENTER);


        // 4- Bulunan sonuc sayisini yazdiralim
        WebElement sonucYaziElement= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")); // buda ayni div ile basliyor class=ile bitiyor
        System.out.println(sonucYaziElement.getText());


        // 5- Ilk urunu tiklayalim
        WebElement ilkUruneTiklama=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")); // ayni sey burada da gecerli span ile basliyor ve class=ile bitiyor
        ilkUruneTiklama.click();


        // 6- Sayfadaki tum basliklari yazdiralim
        driver.navigate().back();
        List<WebElement> basliklarWebElementlerListesi=driver.findElements(By.xpath("//a[@class='a-link-normal s-navigation-item']")); // burada baslangisi a'ile basliyor class= ile devam ediyor ondan

        for (WebElement each:basliklarWebElementlerListesi) System.out.println(each.getText());

        Thread.sleep(3000);
        driver.close();
    }
}
