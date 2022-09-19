package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Sign_up {
@Test
	 
  
			public  void setup() throws InterruptedException{
		        // TODO Auto-generated method stub
		        System.setProperty("webdriver.chrome.driver","C:/Users/godavari.sm/Downloads/chromedriver_win32/chromedriver.exe");
		        WebDriver driver = new ChromeDriver();
				// TODO Auto-generated method stub
		        
		        
		
		        
		        Landingssh register=new Landingssh(driver);
		        register.goTo();
		        register.registerButton("godavari","mulge","godavari@gmail.com","godu789","08/08/2000","5678986598","hii hello");
		        
		        
		        

	}

}


