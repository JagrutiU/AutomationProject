package Tables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	public static WebDriver CallBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions notification = new ChromeOptions();
		notification.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(notification);// upcast chromedriver to webdriver
		driver.get("http://demo.guru99.com/test/web-table-element.php");// to get an url
		driver.manage().window().maximize();
		return driver;

	}

}
