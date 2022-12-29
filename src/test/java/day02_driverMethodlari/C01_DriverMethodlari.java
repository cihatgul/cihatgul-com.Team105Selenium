package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        // biz browser'lari olusturdugumuz driver otomate edebiliyoruz
        // bunun icin her testin
        System.setProperty("webdriver.chrome.driver","D:\\Kodlar\\Kod\\5SeleniumDersleri\\drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        // acilan sayfanin basliginin amazon icerdigini test edin

        String expectedKelime="amazon";
        String actuaResult= driver.getTitle();

        if (actuaResult.contains(expectedKelime)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title amazon icermiyor, test FAILED");
            System.out.println(driver.getTitle());
        }


        // gittigimiz sayfanin URL'inin https://www.amazon.com oldugunu test edin

        String expectedurl="https://www.amazon.com/";
        String actualurl= driver.getTitle();

        if (expectedurl.equals(actualurl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url istediginiz degerde degil");
            System.out.println(driver.getTitle());
        }



        Thread.sleep(5000);
        driver.close();


    }
}
