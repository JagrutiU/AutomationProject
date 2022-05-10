package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void screenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\sachi\\OneDrive\\Desktop\\Velocity_Jagruti\\Automation Testing\\Selenium\\abc.jpeg");
		FileHandler.copy(source, dest);
	}

	public static void main(String[] args) throws IOException {
		ScreenShot.screenShot();

	}

}
