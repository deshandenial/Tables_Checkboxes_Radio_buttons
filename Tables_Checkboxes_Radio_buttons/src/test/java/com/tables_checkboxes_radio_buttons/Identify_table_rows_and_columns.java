package com.tables_checkboxes_radio_buttons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Identify_table_rows_and_columns
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
		//  Find the //No.of Columns
		List<WebElement> col=driver.findElements(By.xpath("//div[@class='dataTables_wrapper']/table/thead/tr/th"));
        System.out.println("No.Of Column in a table:"+col.size());
        
        // Find the //No.of Rows
        
        List<WebElement> rows=driver.findElements(By.xpath("//div[@class='dataTables_wrapper']/table/tbody/tr/td"));
        System.out.println("No.Of Rows in a table:"+rows.size());
	}

}
