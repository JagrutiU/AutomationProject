package MtdsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMtd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		// driver.get("https://www.facebook.com/");// to get an url
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();// to maximize window

		WebElement login = driver.findElement(By.className("_6ltg"));
		login.click(); // click method

		WebElement text = driver.findElement(By.xpath("//div[@class=\"_9ay7\"]"));

		String warning = text.getText(); // gettext

		System.out.println(warning);
		String actual = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";

		Boolean result = warning.equals(actual);
		System.out.println(result);

	}

}
