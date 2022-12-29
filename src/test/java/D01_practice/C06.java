package D01_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06 {
    WebDriver driver;
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sezer\\IdeaProjects\\SeleniumTest\\dri\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://amazon.com");

        WebElement gift=driver.findElement(By.linkText("Customer Service"));
        gift.click();
        Thread.sleep(4000);

        String expected="Customer Service";
        String actual=driver.getTitle();
        Thread.sleep(4000);

        if (actual.contains(expected)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILD");
        }

    }
}
