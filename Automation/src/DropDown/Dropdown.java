package DropDown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");// to get an url
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"first\"]"));
		WebElement multiselect = driver.findElement(By.xpath("//select[@id=\"second\"]"));

		Select value = new Select(dropdown);
		System.out.println(value.isMultiple());
//		 value.selectByValue("Google"); //by value
//		 value.selectByIndex(2); //index starts with 0
		value.selectByVisibleText("Google"); // by visible text
//		List<WebElement> value2 = value.getOptions();
//		
//		for(WebElement value3:value2) {
//		System.out.println(value3.getText());
//		}
		Select multi = new Select(multiselect);
		System.out.println(multi.isMultiple());
		multi.selectByIndex(1); 
		multi.selectByIndex(2);
		WebElement option = multi.getFirstSelectedOption();
		System.out.println(option.getText());
		
		List<WebElement> a = multi.getAllSelectedOptions();
		
		//using foreach loop
		for (WebElement webElement : a) {
			System.out.println(webElement.getText());
			
		}
		
//		Iterator<WebElement> option1 =  a.iterator();
//		while(option1.hasNext())
//		{
//		System.out.println(option1.next().getText());
//		}
		


		driver.close();

	}

}
