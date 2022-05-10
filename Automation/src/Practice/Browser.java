package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
		public static WebDriver ChromeBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://kite.zerodha.com/dashboard");
			driver.manage().window().maximize();
			return driver;
		}
		
		
		
	
	

}
