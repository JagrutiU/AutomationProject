package KeyboardActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver CallBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.navigate().to("https://demoqa.com/text-box");
		driver.manage().window().maximize();// to maximize window
		return driver;

	}

}
