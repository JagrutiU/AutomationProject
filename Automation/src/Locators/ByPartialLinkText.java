package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.get("https://www.facebook.com/");// to get an url
		driver.manage().window().maximize();// to maximize window

		WebElement email1 = driver.findElement(By.cssSelector("[placeholder=\"Email address or phone number\"]"));
		email1.sendKeys("Jagruti111");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Shalaka");
		WebElement Login = driver.findElement(By.partialLinkText("Forgotten "));
		Login.click(); // Partial Link Text

	}

}
