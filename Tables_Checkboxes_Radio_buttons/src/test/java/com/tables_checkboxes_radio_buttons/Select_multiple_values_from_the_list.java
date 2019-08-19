package com.tables_checkboxes_radio_buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_multiple_values_from_the_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");
		WebElement element=driver.findElement(By.xpath("//div[@id='primary']//select[@name='cars']"));
		Select select=new Select(element);
		select.selectByVisibleText("Maruti");
		select.selectByVisibleText("BMW");
	}

}
