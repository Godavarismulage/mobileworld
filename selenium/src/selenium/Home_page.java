package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\godavari.sm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	    driver.get("https://mobileworld.banyanpro.com/");
	    System.out.println(driver.findElement(By.id("home")).getText());
	    driver.findElement(By.id("navbarDropdown")).click();
	    driver.findElement(By.linkText("Samsung")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("More Details")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.className("nav-link")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("navbarDropdown")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Lenovo")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("navbarDropdown")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Apple")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.className("nav-link")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Support")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Order")).click();
	    Thread.sleep(1000);
	    Set<String> windowHandles = driver.getWindowHandles();//parentid.child
        List<String> windowHandlesList = new ArrayList<>(windowHandles);
        Thread.sleep(1000);
        System.out.println("Total window number: " + windowHandlesList.size() + "\n");
        driver.switchTo().window(windowHandlesList.get(1));
         System.out.println("Second window:"+driver.getWindowHandle());    
        driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
        System.out.println("Total window number: " + windowHandlesList.size() + "\n");
        Thread.sleep(1000);
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.findElement(By.id("home")).getText());
        driver.findElement(By.xpath("//a[@id='navbarDropdown'][contains(.,'Support')]")).click();
        driver.findElement(By.linkText("Contact Us")).click();
        System.out.println("Total window number: " + windowHandlesList.size() + "\n");
        driver.switchTo().window(windowHandlesList.get(0));
        System.out.println(windowHandlesList);
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.findElement(By.className("footer")).getText());
        driver.findElement(By.xpath("//footer//a[@href=\"index.html\"]")).click();
        driver.findElement(By.xpath("//footer//a[@href=\"mobile.html\"]")).click();
        System.out.println("Total window number: " + windowHandlesList.size() + "\n");
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.xpath("//footer//a[@href=\"order.html\"]")).click();
        System.out.println(driver.getWindowHandle());
        Thread.sleep(1000);
        driver.findElement(By.linkText("Terms & Conditions")).click();
        Thread.sleep(1000);
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.linkText("Privacy Policy")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Contact Us")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//footer//a[@href=\"sign.html\"]")).click();
        System.out.println(driver.getWindowHandle());
        driver.quit();
 	    
	}

}
