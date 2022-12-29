package D01_practice;

import org.asynchttpclient.util.Assertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C05_UyelikFormuDoldurma {

    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Kodlar\\Kod\\5SeleniumDersleri\\Selenium_Test1\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com");

//        WebElement login=driver.findElement(By.cssSelector("a href=\"/login\""));
//        login.click();


        WebElement nametext = driver.findElement(By.cssSelector("header#header li:nth-child(4) > a"));
        nametext.sendKeys("Cihat");

        WebElement emailtext = driver.findElement(By.cssSelector("section#form div:nth-child(3) > div > form > input[name=\"email\"]"));
        emailtext.sendKeys("ednfkjgkfcil@gmail.com");

        WebElement button = driver.findElement(By.cssSelector("section#form div:nth-child(3) > div > form > button[type=\"submit\"]"));
        button.click();

        WebElement mrclic = driver.findElement(By.cssSelector("input#id_gender1"));
        mrclic.click();

        WebElement pass = driver.findElement(By.cssSelector("input#password"));
        pass.sendKeys("1234");

        WebElement day = driver.findElement(By.id("days"));
        Select select = new Select(day);
        select.selectByValue("14");

        WebElement months = driver.findElement(By.id("months"));
        Select select1 = new Select(months);
        select1.selectByValue("9");

        WebElement years = driver.findElement(By.id("years"));
        Select select2 = new Select(years);
        select2.selectByValue("2020");
        WebElement kut1 = driver.findElement(By.id("newsletter"));
        kut1.click();
        WebElement kut2 = driver.findElement(By.id("optin"));
        kut2.click();

        WebElement first = driver.findElement(By.id("first_name"));
        first.sendKeys("Team16");

        WebElement first2 = driver.findElement(By.id("last_name"));
        first2.sendKeys("Team_16");

        WebElement com = driver.findElement(By.id("company"));
        com.sendKeys("Xcompany");

        WebElement adress = driver.findElement(By.id("address1"));
        adress.sendKeys("İstanbul Sisli");

        WebElement ulke = driver.findElement(By.id("country"));
        Select select3 = new Select(ulke);
        select3.selectByValue("Canada");

        WebElement state = driver.findElement(By.id("state"));
        state.sendKeys("İstanbul Sisli");

        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("İstanbul");

        WebElement zip = driver.findElement(By.id("zipcode"));
        zip.sendKeys("161616");

        WebElement numb = driver.findElement(By.id("mobile_number"));
        numb.sendKeys("5555555555");

        WebElement link = driver.findElement(By.className("btn"));
        link.click();

        WebElement displayed=driver.findElement(By.className("title"));
//         Assertions.assertTrue(displayed.isDisplayed());

        WebElement btn2 = driver.findElement(By.className("btn"));
        btn2.click();

//        WebElement btn5 = driver.findElement(By.id("slider"));
//        btn5.click();

        //WebElement btn3=driver.findElement(By.className("fa"));
        //btn3.click();

        //WebElement btn4=driver.findElement(By.className("btn"));
        //btn4.click();

        Thread.sleep(3000);
        driver.close();
    }    
}
