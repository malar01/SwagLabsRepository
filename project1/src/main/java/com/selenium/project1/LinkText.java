package com.selenium.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		/*WebElement link=driver.findElement(By.linkText("Broken Images")); //linkText
		link.click();*/

		WebElement link=driver.findElement(By.partialLinkText("Broken")); //partialLinkText
		link.click();
		driver.close();
	}

}
