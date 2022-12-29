package D01_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class C02 {

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Kodlar\\Kod\\5SeleniumDersleri\\Selenium_Test1\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        // 1) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html  adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");


        // 2) Berlin’i  3 farkli relative locator ile locate edin
        // A- Sailor'in ustundeki diyelim
        WebElement sailorElementi = driver.findElement(By.xpath("//p[text()='Sailor']"));
        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailorElementi));

        // B-Boston'in sagi diyelim
        WebElement bostonElementi = driver.findElement(By.xpath("//p[text()='Boston']"));
        // tarif etmek istediginiz web elementin bir ozelligini kullanmalisiniz
        // ornegin tagName=img
        WebElement berlin2 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonElementi));

        // C- NYC'nin altindaki diyelim
        WebElement nyc = driver.findElement(By.xpath("//p[text()='NYC']"));
        WebElement berlin3 = driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc));
        // Eger bir tane element'den tarif ettigimizde yine de bulamazsak
        // birden fazla elementi refere edebiliriz
        WebElement berlin4 = driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc).toRightOf(bostonElementi).above(sailorElementi));


        // 3) Relative locator’larin dogru calistigini test edin
        // id'si pid7_thumb oldugunu test edelim
        String expectedIdDegeri = "pid7_thumb";
        String actualIdDegeri = berlin4.getAttribute("Id");

        if (expectedIdDegeri.equals(actualIdDegeri)) System.out.println("Relative locator testi PASSED");
        else System.out.println("Relative locator testi FAILED");


        Thread.sleep(3000);
        driver.close();
    }
}
