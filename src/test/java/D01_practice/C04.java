package D01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {

    WebDriver driver;
    @org.junit.Test

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\Selenium_Test1\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://automationexercise.com");

        driver.findElement(By.cssSelector("header#header li:nth-child(4) > a")).click();
        WebElement email=driver.findElement(new By.ByCssSelector("section#form div.col-sm-4.col-sm-offset-1 > div > form > input[name=\"email\"]"));
        email.sendKeys("deneme@gmail.com");
        WebElement pass=driver.findElement(new By.ByCssSelector("input[name=\"password\"]"));
        pass.sendKeys("1234");
        WebElement button=driver.findElement(new By.ByCssSelector("section#form div.col-sm-4.col-sm-offset-1 > div > form > button[type=\"submit\"]"));
        button.click();

        Thread.sleep(3000);
        driver.close();

        /*

         */

    }
}