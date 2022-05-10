package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByContainsandIndex {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.xpath("//input[contains(@aria-label,'Email address or')]")); // by
																												// Contains
		email.sendKeys("Jagruti");

		WebElement pass = driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[2]")); // by
																											// Contains
		pass.sendKeys("Passward");

		WebElement login = driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _6lth')]")); // by
																											// Contains
		login.click();
	}

}
