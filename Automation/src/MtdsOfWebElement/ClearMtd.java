package MtdsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMtd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();// to maximize window

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Jagruti");
		Thread.sleep(2000);
		email.clear(); // clear method

	}

}
