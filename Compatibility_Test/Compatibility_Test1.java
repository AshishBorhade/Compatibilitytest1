package Compatibility_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Compatibility_Test1 {
	public class Compatibility_Test {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "H:\\Software Testing\\Selenium files downloads\\chrome updated\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			

			driver.get("http://jt-dev.azurewebsites.net/#/SignUp");	
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		    Select se = new Select(driver.findElement(By.xpath("//input[@type='search' and @placeholder='Choose Language']")));
			se.selectByIndex(1);
			
			
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ashish Prakash Borhade");
		driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='singUpEmail']")).sendKeys("borhadeashish27@gmail.com");
		
		driver.findElement(By.xpath("//span[contains(text(),'I agree to the')]")).click();
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

}
}