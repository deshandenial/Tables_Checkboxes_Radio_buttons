package com.tables_checkboxes_radio_buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Handle 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	/*	Select values from Dropdown in Selenium webdriver
		For handling dropdowns, Selenium already provides Select class that has some predefined method which help is a lot while working with Dropdown.

		Select class can be find in below package.
		org.openqa.selenium.support.ui.Select
		
		Select values Dropdown in Selenium webdriver
		Let’s Discuss some of the methods and will see the detailed program as well.
	*/
	// Method - 1 Select value using Index.
		
		Select obj1=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		obj1.selectByIndex(2);
		/*
		 * Explanation- Here selectbyIndex(int) is method which accept integer as argument so depends on index it will select values. 
		 * If you give index as 4, it will select 5th value.
		 */
		
		
	// Method - 2 Select value using value attribute
		
		Select obj2=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		obj2.selectByValue("10");
		
		/*
		 * Explanation- Here selectByValue(String) is a method which accepts values it means whatever value you have in your dropdown.
		 */
		
	// Method - 3 Select value from Visible text
		
		Select obj3=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		obj3.selectByValue("1993");
		
		/*
		 * Explanation- We can also select the value from the text as well. 
		 * This is very straight forward that whatever text we are passing it simply select that value
		 */
		
	// Method - 4 Get Selected option from Dropdown

		Select obj4=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		WebElement webElement=obj4.getFirstSelectedOption();
		String values=webElement.getText();
		System.out.println("\n Month values:"+values);
		
		/*
		 * Explanation- Here getFirstSelectedOption() will return the first selected option and will return you the WebElement then you can use getText() method to extract text and validate the same based on your requirement.
		 */
		
	// Method - 5 Get All option from dropdown
		
		Select obj5=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		List<WebElement> webelement=obj5.getOptions();
		for(int i=0;i<webelement.size();i++)
		{
			String dropdown_values=webelement.get(i).getText();
			System.out.println("Dropdown Value:"+dropdown_values);
		}
		
		/*
		 * Explanation- getOptions() is a method of Select class which will return List of WebElement then we can iterate using for loop or iterator and using getText() method we can extract values.
		 */
		
		
	
		
		
		

	}

}
