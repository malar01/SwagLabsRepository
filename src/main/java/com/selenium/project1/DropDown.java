package com.selenium.project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown=driver.findElement(By.id("dropdown"));
		Select sn=new Select(dropdown);
		//sn.selectByIndex(2);
		//sn.selectByValue("1");
	
		
		/*
	getOptions() — returns all options in the dropdown
	getAllSelectedOptions() — returns all selected options (useful for multi-select dropdowns)
	getFirstSelectedOption() — returns the first selected option
*/
		 
		List<WebElement> fromOptions=sn.getOptions();
		System.out.println("All options in dropdown:");
		for(WebElement option:fromOptions) {
			System.out.println(option.getText());
		}
		//sn.selectByIndex(1);
		sn.selectByValue("2");
		System.out.println(sn.isMultiple());//isMultiple( ) command is used to verify whether the specified select element 
		//support selecting multiple options at the same time. 
	
		List<WebElement> allOptions=sn.getAllSelectedOptions();//it will show all the selected options from the drop down, 
		//where multiple options can be selected 
		System.out.println("All selected optons are:");
		for(WebElement allOption:allOptions) {
			System.out.println(allOption.getText());
		}
		
		WebElement firstSelectOption=sn.getFirstSelectedOption();
			System.out.println("First Selected Option : "+ firstSelectOption.getText());
		}
		/*System.out.println("Size:" + fromOptions.size());
		for(int i=0;i<fromOptions.size();i++) {
			
			System.out.println("My options are as below: "+fromOptions.get(i).getText());
		}*/
		/*List<WebElement> fromOptions=sn.getAllSelectedOptions();
		System.out.println("Size:" + fromOptions.size());
		for(int i=0;i<fromOptions.size();i++) {
			
			System.out.println("My options are as below: "+fromOptions.get(i).getText());
		}*/
	}

