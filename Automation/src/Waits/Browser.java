package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy;

public class Browser {
	public static WebDriver CallBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions notification = new ChromeOptions();
		notification.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(notification);// upcast chromedriver to webdriver
		// driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS); //
		// Implicite Waits
		driver.get("https://kite.zerodha.com/dashboard");// to get an url
		driver.manage().window().maximize();
		return driver;

	}

}
