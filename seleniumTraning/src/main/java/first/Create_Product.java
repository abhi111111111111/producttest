package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Product {

	public static void main(String[] args) throws InterruptedException 
	{
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
		Thread.sleep(5000);
		WebElement catalog = driver.findElement(By.xpath("//*[contains(@class,'sb-item sb-item-unselect')]"));
		catalog.click();
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//*[contains(@src,'/static/media/search_icon2.8f0fa275.svg')]"));
		search.click();
		//	WebElement productdropdown = driver.findElement(By.xpath("//*[contains(@src,'/static/media/grey_down.886275e4.svg')]"));
	//	productdropdown.click();
		WebElement text = driver.findElement(By.xpath("//*[contains(@placeholder,'What are you looking for today?')]"));
		text.sendKeys("Product");
		Thread.sleep(5000);
		WebElement prod = driver.findElement(By.xpath("//*[contains(text(),'Products') and @tabindex='1']"));
		prod.click();
		Thread.sleep(5000);
		WebElement createProd = driver.findElement(By.xpath("//*[contains(text(),'Create Product')]"));
		createProd.click();

	}

}
