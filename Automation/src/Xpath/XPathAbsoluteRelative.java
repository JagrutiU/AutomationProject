package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAbsoluteRelative {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// Absolute Xpath
		WebElement email = driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		email.sendKeys("Jagruti");
		// relative Xpath
		WebElement pass = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		pass.sendKeys("Umesh");

	}

}
