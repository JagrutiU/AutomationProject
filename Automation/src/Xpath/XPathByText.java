package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByText {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[@id=\"email\"]")); // by Attribute
		email.sendKeys("Jagruti");

		WebElement pass = driver.findElement(By.xpath("//input[@id=\"pass\"]")); // by Attribute
		pass.sendKeys("Passward");

		WebElement login = driver.findElement(By.xpath("//button[text()='Log In']")); // By Text()
		login.click();
	}

}
