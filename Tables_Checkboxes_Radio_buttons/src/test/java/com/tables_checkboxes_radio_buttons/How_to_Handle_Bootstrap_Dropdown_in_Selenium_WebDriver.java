package com.tables_checkboxes_radio_buttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_to_Handle_Bootstrap_Dropdown_in_Selenium_WebDriver
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		System.out.println("listsize:"+list.size());
		
	/*	for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("JavaScript"))
			{
				list.get(i).click();
				break;
			}
			
		}*/
		
		for(WebElement ele : list)
		{
			System.out.println("Values " + ele.getAttribute("innerHTML"));
			if (ele.getAttribute("innerHTML").contains("JavaScript"))
			{
				  
	              // if yes then click on link (iteam)
	  
	              ele.click();
	  
	  
	  
	              // break the loop or come out of loop
	  
	              break;
			}
		}
	}
}

	  

	


