package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.get("http://demo.guru99.com/test/radio.html");// to get an url
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[1]"));
		dropdown.click();
		WebElement element = driver.findElement(By.xpath("//a[text()='Flash Movie Demo']"));
		element.click();

	}

}
