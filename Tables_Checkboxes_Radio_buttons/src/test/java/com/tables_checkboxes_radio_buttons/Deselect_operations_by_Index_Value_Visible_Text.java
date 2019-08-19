package com.tables_checkboxes_radio_buttons;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_operations_by_Index_Value_Visible_Text {

	public static void main(String[] args) throws InterruptedException 
	{
		
		// Method - 1 (Drop Down functionality)
		
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		WebElement element=driver.findElement(By.xpath("//select[@name='dropdown']"));
		Select select=new Select(element);
		select.selectByVisibleText("Automation Testing");
		Thread.sleep(2000);
		//To deselect an option
		 //the deselect method will throw UnsupportedOperationException if the SELECT does not support multiple selections
		select.deselectByVisibleText("Automation Testing");
	*/	
		
		// Method - 2 (Combo box functionality) - Deselect VisibleText
		
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");
		WebElement element=driver.findElement(By.xpath("//div[@id='primary']//select[@name='cars']"));
		Select select=new Select(element);
		select.selectByVisibleText("Maruti");
		select.selectByVisibleText("BMW");
		Thread.sleep(2000);
		select.deselectByVisibleText("Maruti");
	*/	
		
		// Method - 3 (Combo box functionality) - Deselect VisibleText
		
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");
		WebElement element=driver.findElement(By.xpath("//div[@id='primary']//select[@name='cars']"));
		Select select=new Select(element);
		select.selectByIndex(3);
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.deselectByIndex(3);
		
	*/	
		
		// Method - 4 (Combo box functionality) - DeselectBy Value
		
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");
		WebElement element=driver.findElement(By.xpath("//div[@id='primary']//select[@name='cars']"));
		Select select=new Select(element);
		select.selectByValue("M");
		select.selectByValue("B");
		Thread.sleep(2000);
		select.deselectByValue("M");
	*/	
		
		// Method - 5 - DeselectAll Method
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");
		WebElement element=driver.findElement(By.xpath("//div[@id='primary']//select[@name='cars']"));
		Select select=new Select(element);
		select.selectByValue("M");
		select.selectByValue("B");
		Thread.sleep(2000);
		select.deselectAll();
		

	}

}
