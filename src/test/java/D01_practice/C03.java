package D01_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03 {

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\Selenium_Test1\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/login");
        WebElement nametext=driver.findElement(By.cssSelector("input[name=\"name\"]"));
        nametext.sendKeys("HTeam16");

        WebElement email=driver.findElement(By.cssSelector("section#form div:nth-child(3) > div > form > input[name=\"email\"]"));
        email.sendKeys("ucbes@deneme");

        WebElement button=driver.findElement(By.cssSelector("section#form div:nth-child(3) > div > form > button[type=\"submit\"]"));
        button.click();

        WebElement cinsiyet=driver.findElement(By.cssSelector("input#id_gender1"));
        cinsiyet.click(); // tiklamak istersek click

        WebElement pasport=driver.findElement(By.cssSelector("input#password"));
        pasport.sendKeys("1234"); // birseyler yazmak istersek sendkeys kullaniriz


        // WebElement button=driver.findElement(By.id()); burada biz bu sayfaya git diyoruz acildiginda
        // button.click(); burada ise git adresini verdigimiz yere tikla diyoruz click ile


        Thread.sleep(3000);
        driver.close();
    }
}
