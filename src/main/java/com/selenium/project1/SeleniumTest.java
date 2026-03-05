package com.selenium.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		/*Webbrowser Commands
		 -------------------
		 1.Browser Commands
		 2.Navigation Commands
		 3.Web element Commands
		 
		 1.Browser Commands
		 driver.get();
		 driver.getTitle();
		 driver.getCurrentUrl();
		 driver.getPageSource();
		 driver.manage().window().maximize(); -> maximize the window
		 driver.quit();
		 driver.close();
		 */		
		driver.get("https://www.google.com");
		//driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		System.out.println("Title: "+ driver.getTitle()); //get title
		
		System.out.println("Current URL: "+ driver.getCurrentUrl()); //get current URL
		
		//System.out.println("Page source: "+ driver.getPageSource()); //get page source
		//driver.quit();
		//driver.close();
		
		/*
		2.Navigation Commands
		-------------------
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		 */
		
		//driver.navigate().to("https://www.google.com");//navigate to a URL
		//driver.navigate().back(); // navigate to old URL
		//driver.navigate().forward(); 
		//driver.navigate().refresh(); // to refresh current page
		
		/* Web Elements Commands
		 -------------------------
		1.sendKeys();
		2.clear();
		3.click();
		4.submit():
		5.getTagName(); //div is the tag name
		6.getAttribute();//("id") identifierNext is the attribute to locator id
		7.getText(): // Next
		8.getSize(); Dimension height,width
		9.getLocation(); Point x,y
		10.getCssValue();
		11.isDisplayed();
		12.isEnabled():
		13.isSelected(); 
		 */
		
		WebElement clicktext=driver.findElement(By.id("L2AGLb"));
		clicktext.click();
		/*WebElement enterText=driver.findElement(By.className("gLFyf"));
		enterText.sendKeys("Learn Selenium Step by Step");
		enterText.sendKeys(Keys.ENTER);*/
		WebElement signGmail=driver.findElement(By.className("gb_A"));
		signGmail.click();
		WebElement emailField=driver.findElement(By.id("identifierId"));
		//check if email field is displayed
		if(emailField.isDisplayed()) {
			System.out.println("Email Field is visible");
			emailField.sendKeys("parvathi.roop@gmail.com");	
		} else {
			System.out.println("Email field not found");
		}
		
		WebElement clickNext=driver.findElement(By.id("identifierNext"));
		//check if Next button is enabled
		if(clickNext.isEnabled()) {
			System.out.println("Next button is enabled");	
		String get_tag_name=clickNext.getTagName();
		System.out.println(get_tag_name);
		String get_attr=clickNext.getAttribute("id");
		System.out.println(get_attr);
		String get_text=clickNext.getText();
		System.out.println(get_text);
		org.openqa.selenium.Dimension sz=clickNext.getSize();
		System.out.println(sz.height);
		System.out.println(sz.width);
		Point p=clickNext.getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		
		String get_css_value=clickNext.getCssValue("font-family");
		System.out.println(get_css_value);
		clickNext.click();
	} else {
		System.out.println("Next button is disabled, cannot click");
	}
	}
}
