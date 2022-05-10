package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// upcast chromedriver to webdriver
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");// to get an url
		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='overview-frame.html']"));
		driver.switchTo().frame(frame1);// Frame 1
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();

		driver.switchTo().defaultContent(); // switch to default content

		WebElement frame2 = driver.findElement(By.xpath("//iframe[@name='packageFrame']"));
		driver.switchTo().frame(frame2); // Frame 2

		WebElement alert = driver.findElement(By.xpath("//ul[@title = 'Interfaces']//a[@href = 'Alert.html']"));
		alert.click();

	}

}
