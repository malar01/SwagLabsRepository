package com.selenium.project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {

	public static void main(String[] args) {
		//set up WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		
		//locate header row
		List<WebElement> headRow=driver.findElements(By.xpath("//table[@class='table table-striped']/thead/tr/th"));
		for(WebElement head:headRow) {
			System.out.print(head.getText()+"\t \t \t");
		}
		System.out.println("\n==============================================================================");
		

		//get all rows
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
		//System.out.println("Total Rows: " + rows.size());
		
	//Iterate through each row
	for(WebElement row:rows) {
		List<WebElement> columns=row.findElements(By.xpath(".//td"));
		for(WebElement cell:columns) {
			System.out.print(cell.getText()+ "\t");
		}
		System.out.println();
	}

}
}