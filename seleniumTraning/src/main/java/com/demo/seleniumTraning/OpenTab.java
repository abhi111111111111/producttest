package com.demo.seleniumTraning;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class OpenTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://test.queuebuster.co/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		 * WebElement username = driver.findElement(By.name("username"));
		 * username.sendKeys("groceryoutlet"); WebElement pass =
		 * driver.findElement(By.name("password")); pass.sendKeys("123456"); WebElement
		 * login = driver.findElement(By.xpath("//*[contains(@class,'btn btn-')]"));
		 * login.click();
		 */
				((JavascriptExecutor)driver).executeScript("window.open()");
				ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
				driver.switchTo().window(tabs.get(1));
				driver.get("https://qa.doroki.com/");
				driver.switchTo().window(tabs.get(0));
				
	}

}
