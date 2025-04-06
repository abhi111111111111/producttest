package com.demo.seleniumTraning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--headless=new");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://test.queuebuster.co/");
		System.out.println("title is "+ driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

}
