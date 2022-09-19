package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signin_pom {
@Test
 public void setup() throws InterruptedException{

System.setProperty("webdriver.chrome.driver","C:/Users/godavari.sm/Downloads/chromedriver_win32/chromedriver.exe");
WebDriver driver = new ChromeDriver();
Thread.sleep(1000);
Landingssh home=new Landingssh(driver);
Thread.sleep(1000);
home.goTo();
Thread.sleep(2000);
home.signin("godavari","mulge");
}
}