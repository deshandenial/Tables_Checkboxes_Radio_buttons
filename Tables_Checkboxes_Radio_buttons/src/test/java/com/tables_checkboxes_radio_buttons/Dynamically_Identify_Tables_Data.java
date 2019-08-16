package com.tables_checkboxes_radio_buttons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamically_Identify_Tables_Data 
{
	
	
	public static void main(String[] args) 
	{
	
		 
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grocerycrud.com/documentation/tutorial_basic_methods/");
		driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		WebElement element=driver.findElement(By.xpath("//div[@class='switch-versions-container']//select[@id='switch-version-select']"));
		Select selectobj=new Select(element);
		selectobj.selectByValue("/demo/employees_example/datatables");
		
		
		String xpath1="//div[@class='dataTables_wrapper']/table//tr[";
		String xpath2="]/td[1]";
		
		// Find the //No.of Rows
        
        	List<WebElement> rows=driver.findElements(By.xpath("//div[@class='dataTables_wrapper']/table/tbody/tr/td"));
        	System.out.println("No.Of Rows in a table:"+rows.size());
        	//int rowcount=rows.size();
		
        //  Find the //No.of Columns
			List<WebElement> col=driver.findElements(By.xpath("//div[@class='dataTables_wrapper']/table/thead/tr/th"));
		    System.out.println("No.Of Column in a table:"+col.size());
		   // int colcount=col.size();  
		    
		    
		  //  for(int i=colcount;i<=rowcount;i++)
		    for(int i=1;i<=10;i++)
			{
				String name = driver.findElement(By.xpath(xpath1+i+xpath2)).getText();
				System.out.println(name);
				
				
				for(int j=1;j<=5;j++)
				{
			
					if(name.contains("Fixter"))
						{
							driver.findElement(By.xpath("//div[@class='dataTables_wrapper']/table//tr["+i+"]/td[5]/a["+j+"]")).click();
							driver.findElement(By.xpath("//input[@id='cancel-button']")).click();
							
						}
				}
				
				
			}
	}
}
		       
        
 
