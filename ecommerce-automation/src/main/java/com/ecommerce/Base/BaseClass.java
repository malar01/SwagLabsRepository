package com.ecommerce.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
protected WebDriver driver;

@BeforeMethod
@Parameters("browser")
public void initBowser(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
	driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("safari")){ 
		driver=new SafariDriver();
	}
	else {
        throw new RuntimeException("Browser not supported: " + browser);
    }
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
