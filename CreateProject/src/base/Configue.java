package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configue {

	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		//driver = new ChromeDriver();;
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.walmart.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl()); 
		//driver.findElement(By.id("email")).sendKeys("shawon.farhad@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Mnbvcxz@1987");
		
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[@id='hf-account-flyout']")).click(); 
		 
		driver.findElement(By.tagName("Track Orders")).click();
		
		                                                                    ////*[@id="vh-account-menu-root"]
		  
		  //driver.findElement(By.name("password")).sendKeys("asdfg1987");
		//System.out.println("i succesfully login to my account"+"thank you");
		
		
		
		
	}

}
