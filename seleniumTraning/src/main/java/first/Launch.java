package first;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Wait;


public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://test.queuebuster.co/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement username =	driver.findElement(By.name("username"));
		username.sendKeys("groceryoutlet");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("123456");
		WebElement login = driver.findElement(By.xpath("//*[contains(@class,'btn btn-')]"));
		login.click();
				
				
		
	//	driver.findElement(By.id(""));
		

	}

}
