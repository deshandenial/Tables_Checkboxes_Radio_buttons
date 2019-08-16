package com.tables_checkboxes_radio_buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class_in_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*
    * Models a SELECT tag, providing helper methods to select and deselect options. 
    * Select is a class which is provided by Selenium to perform multiple operations on DropDown object and Multiple Select object. 
    * This class can be found under the Selenium’s Support.UI.Select package. 
    * As Select is also an ordinary class, so it’s object is also created by a New keyword with regular class creation syntax.
   */
		// Select oSelect = new Select();
		
		
		
 // selectByVisibleText() : we can use this method to select an item in a dropdown by giving visible text.

        //Select s = new Select(driver.findElement(By.name("xxxxxxx")));

	    //s.selectByVisibleText("xxxxxx");
		
		
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grocerycrud.com/documentation/tutorial_basic_methods/");
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.xpath("//div[@class='switch-versions-container']//select[@id='switch-version-select']"));
		Select selectobj=new Select(element);
		selectobj.selectByVisibleText("Datatables");
	 */
		
		
// selectByIndex() : we can use this method to select an item in a dropdown by giving that item index.
		//Select s = new Select(driver.findElement(By.name("xxxxxxx")));
		//s.selectByIndex("2");   // item index is starting from 0 

	 /*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grocerycrud.com/documentation/tutorial_basic_methods/");
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.xpath("//div[@class='switch-versions-container']//select[@id='switch-version-select']"));
		Select selectobj=new Select(element);
		selectobj.selectByIndex(1);
	*/	
		
		
// selectByValue() : we can use this method to select an item in a dropdown by giving that item value.

		//Select s = new Select(driver.findElement(By.name("xxxxxxx")));
		//s.selectByValue("92");	
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grocerycrud.com/documentation/tutorial_basic_methods/");
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.xpath("//div[@class='switch-versions-container']//select[@id='switch-version-select']"));
		Select selectobj=new Select(element);
		selectobj.selectByValue("/demo/employees_example/datatables");
	}

}
