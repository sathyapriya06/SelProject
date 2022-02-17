package com.cts;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Durai\\.eclipse\\SelProject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#Select%20Country");

		WebElement dropDown = driver.findElement(By.tagName("select"));
		
		Select s = new Select(dropDown);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("AGO");
		Thread.sleep(2000);
		s.selectByVisibleText("Bahamas");
		
	List<WebElement>options=s.getOptions();
	
	for(WebElement y :options) {
			
		System.out.println(y.getText());
		
		
		}
		
		
		
	} 

}
