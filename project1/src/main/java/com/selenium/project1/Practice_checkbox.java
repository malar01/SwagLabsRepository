package com.selenium.project1;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Practice_checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
		driver.manage().window().maximize();
		Dimension actual_size=driver.manage().window().getSize();
		System.out.println(actual_size);
		Dimension size = new Dimension(1024, 1068); // width x height
        driver.manage().window().setSize(size);
		WebElement singleCheckbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		if(singleCheckbox.isEnabled()) {
			Thread.sleep(300);
		singleCheckbox.click();
			System.out.println("The check box is enabled");
			
		} else {
		System.out.println("The check box is not enabled");
	}
		
		List<WebElement> checkboxes = driver.findElements(
			    By.xpath("(//div[h2[text()='Disabled Checkbox Demo']]//input[@type='checkbox'])"));
		/*System.out.println("Total check box found: "+ checkboxes.size());
		for(WebElement checkbox:checkboxes)
			 if (checkbox.isEnabled() && !checkbox.isSelected()) {
	                checkbox.click();
		}*/
		checkboxes.get(0).isEnabled();
		checkboxes.get(0).click();
		if(checkboxes.get(2).isEnabled()) {
		System.out.println("Is Enabled");
		}else {
			System.out.println("Is not Enabled");
		}
		
		List<WebElement> multboxes=driver.findElements(By.xpath("//div[@class='flex gap-30 flex-wrap']/label/input[@type='checkbox']"));
		//System.out.println("Total number of multiple boxes :"+ multboxes.size());
		//multboxes.get(1).click();
		
		/*for(WebElement multbox:multboxes)
			if(multbox.isEnabled()&& !multbox.isSelected()) {
				multbox.click();
			}*/
		
		/*if(multboxes.size()>=2) {
			WebElement box_2=multboxes.get(1);
			if(box_2.isEnabled()&& !box_2.isSelected()) {
				box_2.click();
			}
		}
		*/
		
		//Select random checkboxes
		Random rand=new Random();
		WebElement randomBox=multboxes.get(rand.nextInt(multboxes.size()));
		if(randomBox.isEnabled() && !randomBox.isSelected()) {
			randomBox.click();
		}
		driver.quit();
	}

	

	}
	
