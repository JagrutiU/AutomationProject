package AllLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		// driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS); //
		// Implicite Waits
		driver.get("https://kite.zerodha.com/dashboard");// to get an url
		driver.manage().window().maximize();

		// Get list of web-elements with tagName - a
		int count = 0;
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		// Traversing through the list and printing its text along with link address
		for (WebElement link : allLinks) {
			System.out.println(link.getText() + " – " + link.getAttribute("href"));
			count++;
		}
		System.out.println(count);
	}
}
