package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		// driver.get("https://www.facebook.com/");// to get an url
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();// to maximize window

		WebElement w = driver.findElement(By.id("email"));
		w.sendKeys("Jagruti");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Shalaka");
		driver.findElement(By.className("_6ltg")).click();

	}

}
