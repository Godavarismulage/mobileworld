package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sign_in {

   public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:/Users/godavari.sm/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.className("my-sm-0")).click();
        driver.findElement(By.id("username")).sendKeys("Godavari mulge");
        driver.findElement(By.name("password")).sendKeys("godu789");
        driver.findElement(By.cssSelector("label.custom-control-label")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("btn-primary")).click();
            }
   
}
